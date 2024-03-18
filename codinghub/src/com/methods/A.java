package com.methods;
import java.util.Scanner;

public class A 
{
	public static void main(String args[])
	{
		
		B rv=new B();
		
		rv.total();
		B rv2;
		rv2=new B();
		rv2.total();
		
		
	}
}

class B
{
	String name;
	double price;
	int quantity;
	Scanner s=new Scanner(System.in);
	void total()
	{
		System.out.println("Enter the name of the product : ");
		name =s.next();
		System.out.println("Enter the Price : ");
		price =s.nextDouble();
		System.out.println("Enter the quantity : ");
		quantity =s.nextInt();
		System.out.println("Final Cost ==> "+(price*quantity));
	}
	
}
