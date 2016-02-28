package ie.murph.stockprices;

public interface Observer {
	
	public void update(double ibmPrice, double aaplPrice, double goog);
	
}
