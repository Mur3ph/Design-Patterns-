package ie.murph.dzone.observerlisteners;

import ie.murph.dzone.domain.Animal;

public interface AnimalAddedListener {
	//This class acts as the OBSERVER listener
	public void onAnimalAdded(Animal animal);
}
