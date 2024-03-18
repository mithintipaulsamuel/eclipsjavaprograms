package com.Opps_QA;

public class Example {

	public static void main(String[] args) {
		B1 b=new B1();
		b.display();
		b.display1();
		b.display();

	}
}
class A1
{
	int a;
	A1()
	{
		this.a=200;
		System.out.println(a+"A");
	}
	void display()
	{
		System.out.println(a+"A");
	}
	
}
class B1 extends A1
{
	int a;
	B1()
	{
		int a=10;
		this.a=a;
		super.a=20;
		
		System.out.println(this.a+"B"+super.a);
	}
	void display1()
	{
		System.out.println(a+"B");
	}
}
