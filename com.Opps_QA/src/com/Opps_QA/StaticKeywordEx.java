package com.Opps_QA;

public class StaticKeywordEx
{
	static int a;//stati variables
	static int b;//static variables
	static
	{
		a=10;
		b=20;
	}
	public static void add()
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		add();//we can also call the current class  static methods directly without class name 
		AA.sub();//we must call the different class static methods with the class name.
	}
}
class AA
{
	static int a=90;//static variable	
	public static void sub()
	{
		int b=70;//local variable
		System.out.println(a-b);//we may use static variable and local variable in static methods/static blocks
	}
}

