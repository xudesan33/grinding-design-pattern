package abstractfactory.version5;

public class RdbDAOFactory extends DAOFactory{
	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		return new RdbDetailDAOImpl();
	}
	@Override
	public OrderMainDAO createOrderMainDAO() {
		return new RdbMainDAOImpl();
	}
}