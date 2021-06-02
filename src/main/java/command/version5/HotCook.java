package command.version5;

/**
 * 厨师对象，做热菜
 */
public class HotCook implements CookApi{
	
	@Override
	public void cook(String name) {
		System.out.println("本厨师正在做："+name);
	}
}