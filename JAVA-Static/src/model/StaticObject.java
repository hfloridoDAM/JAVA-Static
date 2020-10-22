package model;

public class StaticObject {
	
	private static int value;
	
	public StaticObject () {
		value = 0;
	}

	public void setValue(int i) {
		value = i;
	}
	
	public int getValue() {
		return value;
	}

}
