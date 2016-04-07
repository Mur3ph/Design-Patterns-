package ie.murph.stockprices;

import java.util.ArrayList;
import java.util.List;


public class StockGrabber implements Subject{

	private List<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber()
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) 
	{
		observers.add(newObserver);
		System.out.println("Observer regisered..");
	}

	@Override
	public void unregister(Observer oldObserver)
	{
		int observerIndex = observers.indexOf(oldObserver);
		System.out.println("\nObserver " + (observerIndex+1) + " deleted..");
		
		observers.remove(oldObserver);
	}

	@Override
	public void notifyObserver() 
	{
		for(Observer observer : observers)
		{
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setIBMPrice(double ibmPrice)
	{
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setAAPLPrice(double aaplPrice)
	{
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}
	
	public void setGOOGPrice(double googPrice)
	{
		this.googPrice = googPrice;
		notifyObserver();
	}
}
