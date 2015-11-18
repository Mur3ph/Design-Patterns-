package ie.murph.pattern.builder;

public class BuilderPatternDemo 
{
	public static void main(String[] args)
	{
		MealBuilder builder = new MealBuilder();
		
		Meal veggieMeal = builder.prepareNonVeggieMeal();
		System.out.println("Veggie Meal baby..!");
		veggieMeal.showAllItems();
		System.out.println("Total Price of Veggie Meal baby..!");
		System.out.println(veggieMeal.getCost());
	}
}
