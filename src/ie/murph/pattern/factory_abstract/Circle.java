package ie.murph.pattern.factory_abstract;

public class Circle implements Shape
{
	@Override
	public void draw() 
	{
		System.out.println(" Inside the Circle: draw() method! ");
	}
}
