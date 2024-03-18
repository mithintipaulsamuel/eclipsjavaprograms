package com.exam;
import java.util.Scanner;
public class ProductApplication 
{
	public static void main(String args[])
	{
		System.out.println("*****WELCOME TO KANCHANAMALA SHOPPING MALL*****");
		Scanner sc=new Scanner(System.in);
		String s1="Yes",s2,s3;
		while(s1.equalsIgnoreCase(s1))
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Please Mention your Gender");
			s2=sc.next();
			if(s2.equalsIgnoreCase("Male"))
			{
				System.out.println("            ITEMS FOR MENS            ");
				System.out.println("======================================");
				System.out.println("Shirts");
				System.out.println("Trosures");
				System.out.print("Please type what you need : ");
				s3=sc.next();
				if(s3.equalsIgnoreCase("Shirts"))
				{
					
				}
				if(s3.equalsIgnoreCase("Trosures"))
				{
					
				}
			}
		}
	}
}
