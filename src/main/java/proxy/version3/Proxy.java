package proxy.version3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 代理对象,代理用户数据对象
 */
public class Proxy implements UserModelApi{
	/**
	 * 持有被代理的具体的目标对象
	 */
	private UserModel realSubject=null;
	/**
	 * 构造方法，传入被代理的具体的目标对象
	 * @param realSubject 被代理的具体的目标对象
	 */
	public Proxy(UserModel realSubject){
		this.realSubject = realSubject;
	}
	/**
	 * 标示是否已经重新装载过数据了
	 */
	private boolean loaded = false;
	
	
	@Override
	public String getUserId() {
		return realSubject.getUserId();
	}
	@Override
	public void setUserId(String userId) {
		realSubject.setUserId(userId);
	}
	@Override
	public String getName() {
		return realSubject.getName();
	}
	@Override
	public void setName(String name) {
		realSubject.setName(name);
	}
	
	
	@Override
	public void setDepId(String depId) {
		realSubject.setDepId(depId);
	}
	@Override
	public void setSex(String sex) {
		realSubject.setSex(sex);
	}
	
	@Override
	public String getDepId() {
		// 需要判断是否已经装载过了
		if(!this.loaded){
			// 从数据库中重新装载
			reload();
			// 设置重新装载的标志为true
			this.loaded = true;
		}
		return realSubject.getDepId();
	}	
	@Override
	public String getSex() {
		if(!this.loaded){
			reload();
			this.loaded = true;
		}
		return realSubject.getSex();
	}
	
	/**
	 * 重新查询数据库以获取完整的用户数据
	 */
	private void reload(){
		System.out.println("重新查询数据库获取完整的用户数据，userId=="+realSubject.getUserId());
		Connection conn = null;
		try{
			conn = this.getConnection();
			String sql = "select * from tbl_user where userId=? ";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, realSubject.getUserId());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				// 只需要重新获取除了userId和name外的数据
				realSubject.setDepId(rs.getString("depId"));
				realSubject.setSex(rs.getString("sex"));
			}
			
			rs.close();
			pstmt.close();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public String toString(){
		return "userId="+getUserId()+",name="+getName()
		+",depId="+getDepId()+",sex="+getSex()+"\n";
	}

	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3308/test?useSSL=false&serverTimezone=UTC", "root", "root");
	}
}