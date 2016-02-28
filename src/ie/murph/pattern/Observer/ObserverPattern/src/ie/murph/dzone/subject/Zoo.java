package ie.murph.dzone.subject;

import java.util.ArrayList;
import java.util.List;

import ie.murph.dzone.domain.Animal;
import ie.murph.dzone.observerlisteners.AnimalAddedListener;

public class Zoo {
	
	//The Zoo class acts as the SUBJECT, responsible for storing a list of Animals and notifying a collection of listeners each time a new Animal is added
	
	private List<Animal> _animals = new ArrayList<>();
	private List<AnimalAddedListener> _listeners = new ArrayList<>();
	
	public void addAnimal(Animal animal){
		//Add an animal to the list of animals
		this._animals.add(animal);
		
		//Notify the list of registered listeners
		this.notifyAnimalAddedListeners(animal);
	}

	public void registerAnimalAddedListener(AnimalAddedListener listener){
		//Add the listener to the list of registered listeners
		this._listeners.add(listener);
	}
	
	public void unregisterAnimalAddedListener(AnimalAddedListener listener){
		//Remove the listener to the list of registered listeners
		this._listeners.remove(listener);
	}
	
	private void notifyAnimalAddedListeners(Animal animal) {
		// Notify each of the listeners in the list of the registered listener
		this._listeners.forEach(listener -> listener.onAnimalAdded(animal));
		
	}
}
