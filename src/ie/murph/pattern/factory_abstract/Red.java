package ie.murph.pattern.factory_abstract;

public class Red implements Color
{
	@Override
	public void fill() 
	{
		System.out.println(" Inside the Red class: fill() method! ");
	}
}
