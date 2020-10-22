package manager;

import model.NoStaticObject;
import model.StaticObject;

public class Manager {
	//Declaro fuera del constructor SIN INICIALIZAR
	private NoStaticObject nso2;
	private NoStaticObject nso1;
	
	private StaticObject so1;
	private StaticObject so2;

	public Manager () {
		//Inicializo en le constructor.
		this.nso2 = new NoStaticObject();
		this.nso1 = new NoStaticObject();
		this.so1 = new StaticObject();
		this.so2 = new StaticObject();
	}
	
	public void setStatic() {
		//Cuando cambio el valor de un atributo static cambia para todas las instancias de ese objeto
		//es decir: so1 y so2 comparten la variable Vallue porque es estática.
		this.so1.setValue(1);
	}
	
	public void setNoStatic() {
		//En este caso como no tienen la variable static vallue, si modifico el value de una no aplica a la otra.
		this.nso1.setValue(1);
	}
	
	public void printValues() {
		//Print del valor del atributo value para las 4 instancias de objetos (2 static y 2 sin static).
		System.out.println("Static values: " + this.so1.getValue() + " " + this.so2.getValue());
		System.out.println("NO static values: " + this.nso1.getValue() + " " + this.nso2.getValue());
	}
}
