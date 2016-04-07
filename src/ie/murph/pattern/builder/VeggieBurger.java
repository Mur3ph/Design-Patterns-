package ie.murph.pattern.builder;

public class VeggieBurger extends Burger
{
	@Override
	public String name() 
	{
		return "Veggie Burger";
	}

	@Override
	public Float price()
	{
		return 1.99f;
	}

}
