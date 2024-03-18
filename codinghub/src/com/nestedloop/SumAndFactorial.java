package com.nestedloop;
import java.util.Scanner;
public class SumAndFactorial 
{
	public static void main(String args[])
	{
		int n,rem=0,fact=1,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=s.nextInt();
		while(n>0)
		{
			rem=n%10;
			while(rem>=1)
			{
				fact=fact*rem;
				rem--;
			}
			//System.out.println(fact);
			sum=sum+fact;
			fact=1;
			n=n/10;
		}
		System.out.println("sum of the factorial of each digit of a given number = "+sum);
	}
}
