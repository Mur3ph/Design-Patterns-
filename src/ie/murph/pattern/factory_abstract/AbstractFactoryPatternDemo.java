package ie.murph.pattern.factory_abstract;

public class AbstractFactoryPatternDemo 
{
	public static void main(String[] args)
	{
		//Get the Shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		
		//Get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("Circle");
		
		//Call draw method of Shape Circle
		shape1.draw();
		
		//Get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("Rectangle");
			
		//Call draw method of Shape Rectangle
		shape2.draw();
			
		//Get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("Square");
			
		//Call draw method of Shape Square
		shape3.draw();
		
		//Get the Color Factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		
		//Get an object of the Color Red
		Color color1 = colorFactory.getColor("Red");
		
		//Call the Fill method of Color Red
		color1.fill();
		
		//Get an object of the Color Green
		Color color2 = colorFactory.getColor("GREEN");
		
		//Call the Fill method of Color Green
		color2.fill();
		
		//Get an object of the Color Yellow
		Color color3 = colorFactory.getColor("yellow");
		
		//Call the Fill method of Color Yellow
		color3.fill();
	}
}
