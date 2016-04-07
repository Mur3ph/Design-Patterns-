package ie.murph.pattern.factory_abstract;

public class ColorFactory extends AbstractFactory
{

	@Override
	public Color getColor(String color) {
		if(color == null)
		{
			return null;
		}
		
		if(color.equalsIgnoreCase("Red"))
		{
			return new Red();
		}
		else if(color.equalsIgnoreCase("GREEN"))
		{
			return new Green();
		}
		else if(color.equalsIgnoreCase("yellow"))
		{
			return new Yellow();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) 
	{
		return null;
	}
	
}
