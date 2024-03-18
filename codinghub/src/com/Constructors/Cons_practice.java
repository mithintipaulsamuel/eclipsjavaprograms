package com.Constructors;

public class Cons_practice 
{
	public static void main(String args[])
	{
		
//	
////		//Example of default constructor		
////		Student s1=new Student();
////		s1.Display();
//		
//		
//		//Example of parameterized constructor.
//		Students s1=new Students("Mithinti Paul Samuel",10,15,20,'A');
//		s1.Display1();
//	}
//}
//
//
//class Students
//{
//	String name;
//	int m1,m2,m3;
//	char sec='A';
//	Students()
//	{
//		name="Samuel";
//		m1=17;m2=18;m3=19;
//		sec='B';
////		System.out.println("I am in default constructor");
//	}
//	Students(String name,int m1,int m2,int m3,char sec)
//	{
////		this();
//		this.name=name;
//		this.m1=m1;
//		this.m2=m2;
//		this.m3=m3;
//		this.sec=sec;
//	}
//	public void Display()
//	{
//		System.out.println(name+" "+m1+" "+m2+" "+m3+" "+sec);
//	}
//	public void Display1()
//	{
//		Display();
//		System.out.println("I am in display1 method");
		
		
		
		Parent p=new Parent();
		Child c=new Child();
		Parent parent=new Child();
		parent.m1();
		parent.m2();
		parent.m4();
	}

}

class Parent
{
	public static void m1()
	{
		System.out.println("p-m1");
	}
	public static void m2()
	{
		System.out.println("p-m2");

	}
	public static void m4()
	{
		System.out.println("p-m4");

	}
}
class Child extends Parent
{
	public static void m1()
	{
		System.out.println("c-m1");

	}
	public static void m3()
	{
		System.out.println("c-m3");

	}
}