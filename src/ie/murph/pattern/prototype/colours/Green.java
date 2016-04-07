package ie.murph.pattern.prototype;

public class Green extends Colour{
	
	public Green(){
		type = "Green";
	}

	@Override
	public void paint(){
		System.out.println("Inside Green :: paint() method");
	}
}
