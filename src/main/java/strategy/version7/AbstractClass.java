package strategy.version7;

public abstract class AbstractClass implements Strategy{

	@Override
	public void algorithmInterface() {
		stepOneOpe();
		stepTwoOpe();
		stepThreeOpe();
	}
	private void stepThreeOpe(){}
	protected abstract void stepOneOpe();
	protected abstract void stepTwoOpe();
}