package com.whileloop;

public class PowerOfNumber 
{
	public static void main(String args[])
	
	{
		int n=2,m=10,power=1;
		while(m>=1)
		{
			power=power*n;
			m--;
		}
		System.out.println("2 power 10 is = "+power);
	}

}
