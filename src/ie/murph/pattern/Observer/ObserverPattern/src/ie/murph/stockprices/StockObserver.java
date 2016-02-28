package ie.murph.stockprices;

public class StockObserver implements Observer{

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIDTracker;
		System.out.println("New Observer: " + this.observerId);
		
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) 
	{
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
	}

	@Override
	public String toString() {
		return "\nStockObserver No. " + this.observerId + "\n IBM Price: " + this.ibmPrice + "\n Apple Price: " + this.aaplPrice + "\n Google Price: " + this.googPrice;
	}
	
}
