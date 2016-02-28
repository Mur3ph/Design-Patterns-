package ie.murph.pattern.factory_abstract;

public class Square implements Shape
{
	@Override
	public void draw() 
	{
		System.out.println(" Inside the Square: draw() method! ");
	}
}
