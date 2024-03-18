package com.Constructors;
import java.util.Scanner;
public class Constructor1 
{
	public static void main(String args[])
	{
		Student1 obj1=new Student1();
		int total=obj1.Display();
		System.out.println(total);
	}
}

class Student1
{
	int n1,n2,n3,n4;
	String name;
	Scanner sc=new Scanner(System.in);
	
	Student1()
	{
		System.out.println("======");
	}
	Student1(int num)
	{
//		System.out.println("enter ur marks of three subs : ");
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		n3=sc.nextInt();
//		System.out.println("Enter ur name : ");
//		name=new String(sc.next());
		n1=10;n2=20;n3=30;
		n4=num;//This is know as local instances
	}
	public int Display()
	{
		int total=n1+n2+n3+n4;
		return (total);
	}
}
