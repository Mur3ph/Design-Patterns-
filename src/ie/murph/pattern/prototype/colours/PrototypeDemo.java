package ie.murph.pattern.prototype;

public class PrototypeDemo {

	
	public static void main(String[] args){
		ColourCache.loadCache();
		
		Colour clonedColour1 = (Colour) ColourCache.getColour("1");
		System.out.println("Colour: " + clonedColour1.getType());
		
		Colour clonedColour2 = (Colour) ColourCache.getColour("2");
		System.out.println("Colour: " + clonedColour2.getType());
		
		Colour clonedColour3 = (Colour) ColourCache.getColour("3");
		System.out.println("Colour: " + clonedColour3.getType());
	}
}
