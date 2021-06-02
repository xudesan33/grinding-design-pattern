package abstractfactory.version2;

/**
 * 具体的工厂实现对象，实现创建具体的产品对象的操作
 */
public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}