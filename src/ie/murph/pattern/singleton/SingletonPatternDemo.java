package ie.murph.pattern.singleton;

public class SingletonPatternDemo 
{
	public static void main(String[] args)
	{
		//Illegal construct
		//Compile time error: The constructor SingletonObject() is not visible 
		//SingletonObject object = new SingletonObject();
		
		//Get the only object available
		SingletonObject object1 = SingletonObject.getInstance();
		
		//OR Get the only object available
		SingletonObject2 object2 = SingletonObject2.INSTANCE;
		
		//Show the message
		object1.showMessageFromSingletonClass();
		
		//Show the message
		object2.showMessageFromSingletonClass();
		
		//Enum singleton, best approach to singleton
		SingletonObjectEnum object3 = SingletonObjectEnum.INSTANCE;
		
		System.out.println("0)." + object3);
		
		//Show the message
		synchronized(object3)
		{
			try 
			{
				object3.wait(2000);
				System.out.println("1). Wait.. " + object3);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("1)." + object3);
		}
		object3.showMessageFromSingletonEnum();
		System.out.println("2)." + object3);
		
		//Enum singleton, best approach to singleton
		SingletonObjectEnum object4 = SingletonObjectEnum.INSTANCE;
		//Show the message
		object4.showMessageFromSingletonEnum();
		System.out.println("3)." + object4.hashCode());
	}
}
