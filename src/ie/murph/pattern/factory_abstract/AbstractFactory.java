package ie.murph.pattern.factory_abstract;

public abstract class AbstractFactory 
{
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
