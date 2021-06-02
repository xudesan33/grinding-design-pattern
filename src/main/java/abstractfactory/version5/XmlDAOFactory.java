package abstractfactory.version5;

public class XmlDAOFactory extends DAOFactory {
	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		return new XmlDetailDAOImpl();
	}
	@Override
	public OrderMainDAO createOrderMainDAO() {
		return new XmlMainDAOImpl();
	}
}