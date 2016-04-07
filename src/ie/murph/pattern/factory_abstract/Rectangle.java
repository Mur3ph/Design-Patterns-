package ie.murph.pattern.factory_abstract;

public class Rectangle implements Shape
{
	@Override
	public void draw() 
	{
		System.out.println(" Inside the Rectangle: draw() method! ");
	}
}
