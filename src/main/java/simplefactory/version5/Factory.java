package simplefactory.version5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂类，用来创建Api的
 */
public class Factory {

	/**
	 * 具体创建Api的方法,根据配置文件的参数来创建接口
	 * @return 创建好的Api对象
	 */
	public static Api createApi() {
		// 直接读取配置文件来获取需要创建示例的类
		// 至于如何读取Properties,还有如何反射就不解释了
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = Factory.class.getResourceAsStream("/FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("装载工厂配置文件出错，具体的堆栈信息如下：");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 用反射去创建，那些例外处理等完善的工作就不做了
		Api api = null;
		try {
			api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return api;
	}
}