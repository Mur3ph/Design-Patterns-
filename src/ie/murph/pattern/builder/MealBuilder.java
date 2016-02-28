package ie.murph.pattern.builder;

public class MealBuilder 
{
	public Meal prepareVeggieMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new VeggieBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVeggieMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
