
public class Card {

	private int value;
	private String name;
	
	Card(int value, String name) {
		this.value = value;
		this.name = name;
	}


	public void setValue(int value) {
		this.value = value;
}
	
	public int getValue() {
		return value;
	}

	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public static void describe() {
		//System.out.println(getName() + "is worth " +  " points!");
	}
	
}