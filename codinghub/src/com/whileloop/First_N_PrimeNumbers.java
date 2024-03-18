package com.whileloop;
import java.util.Scanner;
public class First_N_PrimeNumbers 
{
	public static void main(String args[])
	{
		int req,count=0;
		System.out.println("How many prime numbers do you want : ");
		Scanner s=new Scanner(System.in);
		req=s.nextInt();
		int num=2;
		while(count<=req)
		{
			int fact=0;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					fact++;
					break;
				}
			}
			if(fact==0)
			{
				count++;
				System.out.println(num);
			}
			num++;
		}
	}
}
