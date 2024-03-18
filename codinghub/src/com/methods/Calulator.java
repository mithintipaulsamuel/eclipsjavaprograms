package com.methods;
import java.util.Scanner;
public class Calulator 
{
	public static void main(String args[])
	{
		cal obj1=new cal();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1: ");
		obj1.n1=sc.nextInt();
		System.out.println("Enter n2: ");
		obj1.n2=sc.nextInt();
//		System.out.println("The numbers  are : ");
//		System.out.println(obj1.n1);
//		System.out.println(obj1.n2);
		System.out.println("Enter an operator u need : ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
		{
			obj1.add();
			break;
		}
		case '-':
		{
			obj1.sub();
			break;
		}
		case '*':
		{
			obj1.mul();
			break;
		}
		case '>':
		{
			obj1.greater();
			break;
		}
		case '<':
		{
			obj1.smaller();
			break;
		}
		}
		
		

	}
}

class cal
{

	int n1,n2;
	
	void add()
	{
		System.out.println("Sum is = "+(n1+n2));
	}
	void sub()
	{
		System.out.println("Sub is = "+(n1-n2));
	}
	void mul()
	{
		System.out.println("Mul is = "+(n1*n2));
	}
	void pow()
	{
		System.out.println("Power is = "+(Math.pow(n1,n2)));
	}
	void greater()
	{
		if(n1>n2)
			System.out.println(n1+" is greater");
		else if(n2>n1)
			System.out.println(n2+" is greater");
		else
			System.out.println(n1+" "+n2+" both are equal");
	}
	void smaller()
	{
		if(n1>n2)
			System.out.println(n2+" is smaller");
		else if(n2>n1)
			System.out.println(n1+" is smaller");
		else
			System.out.println(n1+" "+n2+" both are equal");
	}
}
