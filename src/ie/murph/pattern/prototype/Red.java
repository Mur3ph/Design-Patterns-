package ie.murph.pattern.prototype;

public class Red extends Colour{
	
	public Red(){
		type = "Red";
	}

	@Override
	public void paint(){
		System.out.println("Inside Red :: paint() method");
	}
}
