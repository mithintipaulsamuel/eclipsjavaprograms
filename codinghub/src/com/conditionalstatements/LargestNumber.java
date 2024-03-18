package com.conditionalstatements;

import java.util.Scanner;

public class LargestNumber 
{
	public static void main(String args[])
	{
		int n1,n2,n3;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter any number = ");
		n1=s.nextInt();
		System.out.print("Enter any number = ");
		n2=s.nextInt();
		System.out.print("Enter any number = ");
		n3=s.nextInt();
		/*if(n1>n2&&n1>n3)
		{
			System.out.println(n1);
		}
		else if(n2>n3)
		{
			System.out.println(n2);	
		}
		else
			System.out.println(n3);*/
		int  large= n1>n2?n1:(n2>n3?n2:n3);
		System.out.println(large);
	}	

}
