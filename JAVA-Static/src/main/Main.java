package main;

import manager.Manager;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setNoStatic();
		manager.setStatic();
		manager.printValues();
	}

}
