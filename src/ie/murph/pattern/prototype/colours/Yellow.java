package ie.murph.pattern.prototype;

public class Yellow extends Colour{
	
	public Yellow(){
		type = "Yellow";
	}

	@Override
	public void paint(){
		System.out.println("Inside Yellow :: paint() method");
	}
}
