package ie.murph.pattern.builder;

public class Pepsi extends ColdDrink 
{
	@Override
	public String name() 
	{
		return "Pepsi";
	}

	@Override
	public Float price() 
	{
		return 0.98f;
	}

}
