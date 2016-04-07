package ie.murph.pattern.factory;

public class FactoryPatternDemo 
{
	public static void main(String[] args)
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//Get the object of Circle
		Shape shape1 = shapeFactory.getShape("Circle");
		//Call the draw method of Circle
		shape1.draw();
		
		//Get the object of Square
		Shape shape2 = shapeFactory.getShape("square");
		//Call the draw method of Square
		shape2.draw();
		
		//Get the object of Rectangle
		Shape shape3 = shapeFactory.getShape("RECTANGLE");
		//Call the draw method of Rectangle
		shape3.draw();
	}
}
