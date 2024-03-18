package com.Constructors;

public class SimpleConsThis 
{
	public static void main(String args[])
	{
		Student obj1=new Student();
		obj1.Display();
		Student obj2=new Student("rajesh",26,10,20,13,'d');
		obj1.Display();
	}
}


class Student
{
	String name;
	int roll,m1,m2,m3;
	char sec;
	Student()
	{
		name="sam";
		roll=16;
		sec='a';
		m1=11;m2=12;m3=14;
	}
	Student(String name,int roll,int m1,int m2,int m3,char sec)
	{
		this.name=name;
		this.roll=roll;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.sec=sec;
	}
	public void Display()
	{
		System.out.println(name+" "+roll+" "+sec+" "+m1+" "+m2+" "+m3);
	}
}