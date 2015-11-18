package ie.murph.pattern.prototype;

import java.util.Hashtable;

public class ColourCache {

	private static Hashtable<String, Colour> colourMap = new Hashtable<String, Colour>();
	
	public static Colour getColour(String ColourId){
		Colour cachedColour = colourMap.get(ColourId);
		return (Colour) cachedColour.clone();
	}
	
	public static void loadCache(){
		Red red = new Red();
		red.setId("1");
		colourMap.put(red.getId(), red);
		
		Green green = new Green();
		green.setId("2");
		colourMap.put(green.getId(), green);
		
		Yellow yellow = new Yellow();
		yellow.setId("3");
		colourMap.put(yellow.getId(), yellow);
		
	}
}
