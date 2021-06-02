package simplefactory.version5;

/**
 * 接口的具体实现类对象A
 */
public class Impl implements Api {

	@Override
	public void test1(String s) {
		System.out.println("Impl s==" + s);
	}

}