package abstractfactory.version5;

public class RdbDetailDAOImpl implements OrderDetailDAO{
	@Override
	public void saveOrderDetail() {
		System.out.println("now in RdbDetailDAOImpl saveOrderDetail");
	}
}