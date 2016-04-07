package ie.murph.pattern.builder;

public abstract class Burger implements Item
{
	@Override
	public abstract Float price();

	@Override
	public Packing packing() 
	{
		return new Wrapper();
	}
}
