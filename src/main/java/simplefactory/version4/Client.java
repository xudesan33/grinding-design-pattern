package simplefactory.version4;

/**
 * 客户端：测试使用Api接口
 */
public class Client {
	public static void main(String[] args) {
		// 注意这里传入的参数，修改参数就可以修改行为
		Api api = Factory.createApi(2);
		api.test1("哈哈，不要紧张，只是测试而已！");
	}
}