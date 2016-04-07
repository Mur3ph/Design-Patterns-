package ie.murph.pattern.factory_abstract;


public class ShapeFactory extends AbstractFactory
{
	@Override
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
