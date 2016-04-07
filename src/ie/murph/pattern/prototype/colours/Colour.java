package ie.murph.pattern.prototype;

public abstract class Colour implements Cloneable{

	private String id;
	protected String type;

	abstract void paint();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Object clone(){
		Object clone = "";
		
		try{
			clone = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
}
