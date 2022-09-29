package com.syntax.class09;

public class Dog {

	String name;
	String color;
	int year;

	void bark() {
		System.out.println(name + " barks a lot");
	}
	void sleep() {
		System.out.println(color + " " + name + " never takes a nap");
	}
	public static void main(String[] args) {
		
		Dog lolo = new Dog();
		lolo.name = "Husky";
		lolo.color = "brown";

		lolo.bark();
		lolo.sleep();

		Dog lolo1 = new Dog();
		lolo1.name = "labrador";
		lolo1.color = "yellow";

		lolo1.bark();
		lolo1.sleep();

		Dog lolo2 = new Dog();
		lolo2.name = "bulldog";
		lolo2.color = "black";

		lolo2.bark();
		lolo2.sleep();
	}

}
