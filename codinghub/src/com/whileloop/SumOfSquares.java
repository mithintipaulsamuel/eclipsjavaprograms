package com.whileloop;

public class SumOfSquares 
{
	public static void main(String args[])
	{
		int n=12345,r=0,sos=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.println(r*r);
		    sos=sos+(r*r);
		}
		System.out.println("Sum of the squares = "+sos);
	}

}
