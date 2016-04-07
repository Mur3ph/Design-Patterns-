package ie.murph.stockprices;

public class RunStock {

	public static void main(String[] args)
	{
		StockGrabber stockGrabber = new StockGrabber();
		
		System.out.println("");
		StockObserver stockObserver1 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		System.out.println(stockObserver1.toString());
		
		System.out.println("");
		StockObserver stockObserver2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		System.out.println(stockObserver2.toString());
		
		stockGrabber.unregister(stockObserver1);
		
		Runnable getIBM = new GetTheStockUsingThreads(stockGrabber, 2, "IBM", 197.00);
		Runnable getAPPLE = new GetTheStockUsingThreads(stockGrabber, 4, "APPLE", 677.60);
		Runnable getGOOGLE = new GetTheStockUsingThreads(stockGrabber, 6, "GOOGLE", 676.40);
		
		new Thread(getIBM).start();
		new Thread(getAPPLE).start();
		new Thread(getGOOGLE).start();
	}
	
}
