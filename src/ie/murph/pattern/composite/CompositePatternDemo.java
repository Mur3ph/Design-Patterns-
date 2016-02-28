package ie.murph.pattern.composite;

public class CompositePatternDemo 
{
	public static void main(String[] args)
	{
		Employee CEO = new Employee("Min", "CEO", 30000);
		
		Employee headSales = new Employee("Paul", "Head Sales", 20000);
		
		Employee headMarketing = new Employee("Ringo", "Head Marketing", 20000);
		
		Employee clerk1 = new Employee("John", "Marketing", 10000);
		Employee clerk2 = new Employee("Ricardo", "Marketing", 10000);
		
		Employee salesExecutive1 = new Employee("Bob", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Tobby", "Sales", 10000);
		
		CEO.addEmployee(headSales);
		CEO.addEmployee(headMarketing);
		
		headSales.addEmployee(salesExecutive1);
		headSales.addEmployee(salesExecutive2);
		
		headMarketing.addEmployee(clerk1);
		headMarketing.addEmployee(clerk2);
		
		System.out.println(CEO);
		for(Employee headEmployee : CEO.getSubordinates())
		{
			System.out.println(headEmployee);
			for(Employee employee : headEmployee.getSubordinates())
			{
				System.out.println(employee);
			}
		}
	}
}
