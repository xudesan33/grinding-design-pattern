package abstractfactory.version5;

public class RdbMainDAOImpl implements OrderMainDAO{
	@Override
	public void saveOrderMain() {
		System.out.println("now in RdbMainDAOImpl saveOrderMain");
	}
}