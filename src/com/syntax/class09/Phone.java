package com.syntax.class09;

public class Phone {
	
	String name;
	String lastVersion;
	String color;
	String oSystem;
	int year;
	void call () {
		System.out.println(name+ " "+lastVersion + " has the best sound when makeing a call ");
		//System.out.println(" ");
	}
	void takePictures() {
		System.out.println ( name + " "+ year  +" is good in taking pictures in a high-reselution ");
		System.out.println(" ");
	}
	void speed() {
		System.out.println (color + " "+ name + "is very fast ");
		//System.out.println(" ");
	}
	public static void main(String[] args) {
		
		Phone cell1 = new Phone();
		Phone cell2 = new Phone();
		Phone cell3 = new Phone();
		
		cell1.name= "Iphne";
		cell1.lastVersion= "14";
		cell1.color= "black";
		cell1.oSystem= "IOS";
		cell1.year= 2022;
		
		cell1.call();
		cell1.speed();
		cell1.takePictures();
		
		cell2.name= "Samsung";
		cell2.lastVersion= "NoteBook";
		cell2.color= "selver";
		cell2.oSystem= "Andriod";
		cell2.year= 2021;
		
		cell2.call();
		cell2.speed();
		cell2.takePictures();
		
		cell3.name= "Pixel";
		cell3.lastVersion= "NoteBook";
		cell3.color= "gold ";
		cell3.oSystem= "Andriod";
		cell3.year= 2023;
		
		cell3.call();
		cell3.speed();
		cell3.takePictures();
	}
}
