package ie.murph.pattern.builder;

public class ChickenBurger extends Burger
{
	@Override
	public String name() 
	{
		return "Chicken Burger";
	}

	@Override
	public Float price() 
	{
		return 3.25f;
	}

}
