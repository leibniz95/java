package com.classsort;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	public Person(String last,String first,int a)
	{
		lastName=last;
		firstName=first;
		age=a;
	}
	
	
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}
	
	public String getLast()
	{
		return lastName;
	}
	
}
