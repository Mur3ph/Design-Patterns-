package ie.murph.dzone.observerlisteners;

import ie.murph.dzone.domain.Animal;

public class PrintNameAnimalAddedListener implements AnimalAddedListener{

	@Override
	public void onAnimalAdded(Animal animal) {
		//Print the name of the newly added animal
		System.out.println("Added new animal with name: " + animal.getName());
	}

}
