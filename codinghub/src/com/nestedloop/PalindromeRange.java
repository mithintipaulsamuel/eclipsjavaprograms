package com.nestedloop;

public class PalindromeRange 
{
	public static void main(String args[])
	{
		int num,rem=0,rev=0;
		for(int i=1;i<=1000;i++)
		{
			num=i;
			for(int j=num;j>0;j/=10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==num)
			{
				System.out.println(rev);
			}
			rev=0;
		}
	}
}
