package model;

public class NoStaticObject {
	
	private int value;
	
	public NoStaticObject() {
		this.value = 0;
	}

	public void setValue(int i) {
		this.value = i;
	}
	
	public int getValue() {
		return this.value;
	}
}
