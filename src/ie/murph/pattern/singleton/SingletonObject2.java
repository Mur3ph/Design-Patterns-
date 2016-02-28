package ie.murph.pattern.singleton;

public class SingletonObject2 
{
	//TWO WAYS TO IMPLEMENT SINGLETONS - Singleton with Public final field
		
	//Create an object of the SingletonObject class - make it public so no need for method
	public static final SingletonObject2 INSTANCE = new SingletonObject2();
	
	//Make the constructor private, so that, this class cannot be instantiated more than once
	private SingletonObject2(){}
	
	public void showMessageFromSingletonClass()
	{
		System.out.println("Public Varible: Hello from Singleton class, that returns the same object reference every time!");
	}
}
