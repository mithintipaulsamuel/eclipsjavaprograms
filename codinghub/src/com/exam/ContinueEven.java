package com.exam;
import java.util.Scanner;
public class ContinueEven 
{
	public static void main(String args[])
	{
		int num;
		String s1="yes";
		Scanner s=new Scanner(System.in);		
        while(s1.equalsIgnoreCase("yes"))
        {
    		System.out.println("Enter a number to check wether it is an Even or Odd : ");
    		num=s.nextInt();
    		if(num%2==0)
    		{
    			System.out.println(num+" is an Even number.");
    		}
    		else
    		{
    			System.out.println(num+" is an Odd number");
    		}
    		System.out.println("If you want to continue type YES else type NO");
    		s1=s.next();
    		if(s1.equalsIgnoreCase("no"))
    		{
    			System.out.println("*******Thank you visit again*******");
    		}
    		
        }
	}
}

