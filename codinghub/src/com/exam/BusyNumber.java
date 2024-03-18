package com.exam;

public class BusyNumber 
{
	public static void main(String args[])
	{
		int n=5678,lastdigit=0,rem=0;
		lastdigit=n%10;
		if(lastdigit==7)
		{
			System.out.println(" the number is a busy number.");
		}
		else
		{
			rem=n%7;
			if(rem==0)
			{
				System.out.println("The number is a busy number.");
			}
			else
			{
				System.out.println("number is not a busy number.");
			}
		}
		
	}
}
