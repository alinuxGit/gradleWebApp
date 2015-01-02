package org.gradle;


public class TestPerson {
	
	public static void main(String[] args) {
		Person person = new Person("Igor");
		Person marco = new Person("Marco");
		
		System.out.println("Ciao, io sono " + person.getName());
		System.out.println("Salve, io mi chiamo " + marco.getName() + " e sono contento di conoscerti");
	}
}
