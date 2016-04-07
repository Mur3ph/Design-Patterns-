package ie.murph.pattern.singleton;

public class SingletonObject 
{
	//TWO WAYS TO IMPLEMENT SINGLETONS - Singleton with static factory

	//Create an object of the SingletonObject class - make it private
	private static final SingletonObject INSTANCE1 = new SingletonObject();
	
	//Make the constructor private, so that, this class cannot be instantiated more than once
	private SingletonObject(){}
	
	//Get the only object available, return the same object reference and no other reference will ever be created
	public static SingletonObject getInstance()
	{
		return INSTANCE1;
	}
	
	public void showMessageFromSingletonClass()
	{
		System.out.println("Public Method: Hello from Singleton class, that returns the same object reference every time!");
	}
}
