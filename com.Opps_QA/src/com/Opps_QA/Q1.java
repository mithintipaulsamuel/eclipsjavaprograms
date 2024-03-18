package com.Opps_QA;

public class Q1 
{
	public static void main(String args[])
	{
		Person person=new Person();
		person.display();
		Person person1=new Person(26,"mahesh");
		person1.display();
//		Person person2=new Person(28,"mahesh");
//		person2.display();
	}
}

class Person
{
	String name;
	int age;
	Person()
	{
		this(20,"balu");
		System.out.println(" bread and age");
		
	}
	Person(int age,String name)
	{
		//this();
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}

}
