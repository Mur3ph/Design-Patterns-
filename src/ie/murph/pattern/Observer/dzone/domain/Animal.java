package ie.murph.dzone.domain;

public class Animal {
	private String _name;
	
	public Animal(String name){
		this._name = name;
	}
	
	public void setName(String name){
		this._name = name;
	}
	
	public String getName(){
		return _name;
	}
}
