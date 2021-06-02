package command.version5;

/**
 * 命令对象，北京烤鸭
 */
public class DuckCommand implements Command{
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	@Override
	public void execute() {
		this.cookApi.cook("北京烤鸭");
	}
}