package com.exam;

public class StaticExample 
{
	static int a,b;
	public static void m2()
	{
		System.out.println("i am a m2 method in main class.");
	}
	public static void main(String args[])
	{
		A.m1();
		m2();//we can directly access the  static method in the same class whith out using the class name.
		StaticExample.m2();//this is the second way.
		System.out.println(a+" "+b);
		System.out.println(A.c+" "+A.d);

	}
}

class A
{
	static int c,d;
	public static void m1()
	{
		System.out.println(" im m1 method in class A");
	}
}
