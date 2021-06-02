package visitor.version3;

/**
 * 具体的访问者实现
 */
public class ConcreteVisitor1 implements Visitor {
	@Override
	public void visitConcreteElementA(ConcreteElementA element) {
		// 把去访问ConcreteElementA时，需要执行的功能实现在这里
		// 可能需要访问元素已有的功能，比如：
		element.opertionA();
	}
	@Override
	public void visitConcreteElementB(ConcreteElementB element) {
		// 把去访问ConcreteElementB时，需要执行的功能实现在这里
		// 可能需要访问元素已有的功能，比如：
		element.opertionB();
	}
}