package ie.murph.dzone.observerlisteners;

import ie.murph.dzone.domain.Animal;

public class CountingAnimalAddedListener implements AnimalAddedListener {

	private static int _animalsAddedCount = 0;
	
	@Override
	public void onAnimalAdded(Animal animal) {
		// Increment the number of animals after being added
		_animalsAddedCount++;
		
		// Print the number of animals
		System.out.println("Total animals added: " + _animalsAddedCount);
	}

}
