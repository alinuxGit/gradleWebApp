package org.gradle;

public class TestPerson {
	
	public static void main(String[] args) {
		Person person = new Person("Igor");
		
		System.out.println("Ciao, io sono " + person.getName());
	}

}
