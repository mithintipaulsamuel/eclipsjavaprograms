package com.Opps_QA;

interface A
{
	public void m1();
}
interface B
{
	public void m2();
}
interface C
{
	public void m3();
}
public class MultipleInheritance implements A,B,C
{
	public void m1()
	{
		System.out.println("Hi");
	}
	public void m2()
	{
		System.out.println("Hello");
	}
	public void m3()
	{
		System.out.println("Namsthe");
	}
	public static void main(String args[])
	{
		MultipleInheritance obj1=new MultipleInheritance();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
}

