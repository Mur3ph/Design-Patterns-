package ie.murph.pattern.singleton;

public enum SingletonObjectEnum
{
	//ANOTHER BETTER WAY TO IMPLEMENT SINGLETON
	//This approach is functionally equivalent to public field approach, 
	//Except that it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation
	//even in the face of sophisticated serialization or reflection attacks
	//While this approach has yet to be widely adopted, a single-element enum type is the best way to implement a singleton
	
	INSTANCE;
	
	public synchronized SingletonObjectEnum getEnumInstance()
	{
		return INSTANCE;
	}
	
	public void showMessageFromSingletonEnum()
	{
		System.out.println("Hello from Singleton Enum, that returns the same object reference every time!");
	}
}
