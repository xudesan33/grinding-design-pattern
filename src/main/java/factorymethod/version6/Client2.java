package factorymethod.version6;

public class Client2 {
	public static void main(String[] args) {
		// 创建需要使用的Creator对象
		ExportOperate operate = new ExportOperate2();
		// 下面变换传入的参数来测试参数化工厂方法
		operate.export(1,"Test1");
		operate.export(2,"Test2");
		operate.export(3,"Test3");
	}
}