package ie.murph.dzone.run;

import ie.murph.dzone.domain.Animal;
import ie.murph.dzone.observerlisteners.CountingAnimalAddedListener;
import ie.murph.dzone.observerlisteners.PrintNameAnimalAddedListener;
import ie.murph.dzone.subject.Zoo;

public class RunZoo {

	public static void main(String[] args)
	{
		// Create a zoo to store animals
		Zoo zoo = new Zoo();
		
		// Register a listener to be notified when an animal is added
		zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
		zoo.registerAnimalAddedListener(new CountingAnimalAddedListener());
		
		// Add an animal notify the registered listeners
		zoo.addAnimal(new Animal("Lion"));
		zoo.addAnimal(new Animal("Tiger"));
		zoo.addAnimal(new Animal("Bear"));
	}
	
}
