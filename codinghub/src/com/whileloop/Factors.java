package com.whileloop;

public class Factors {
	public static void main(String args[])
	{
		int n=1000,x=1000,count=0;
		while(x>=1)
		{
			if(n%x==0)
			{
				count++;
				System.out.println(x);
			}
			x--;

		}
		if(count>=10)
		{
			System.out.println(n+" is a super number.");
		}
		else
		{
			System.out.println(n+" is not a super number.");
		}
      
	}

}
