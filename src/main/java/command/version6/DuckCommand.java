package command.version6;

/**
 * 命令对象，北京烤鸭
 */
public class DuckCommand implements Command{
	private CookApi cookApi = null;
	@Override
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	private int tableNum;
	public DuckCommand(int tableNum){
		this.tableNum = tableNum;
	}
	@Override
	public int getTableNum(){
		return this.tableNum;
	}
	
	@Override
	public void execute() {
		this.cookApi.cook(tableNum,"北京烤鸭");
	}
}