package com.whileloop;
import java.util.Scanner;
public class ReverseOfNumber 
{
	public static void main(String args[])
	{
		int n,r=0,sum=0,i=2,count=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=s.nextInt();
		int j=n;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		System.out.println(sum);
		if(j==sum)
			System.out.println("Palindrome");
		else
		{
			System.out.println("Not Palindrome");
		}
		/*if(sum==1)
		{
			System.out.println(sum+" is neither prime nor composite.");
		}
		else
		{
			while(i<=sum/2)
			{
				if(sum%i==0)
				{
				  count++;
				}
				i++;
			}
			if(count==0)
			{
				System.out.println(sum+" is a prime number. ");
			}
			else
			{
				System.out.println(sum+" is composite number.");
			}
		}*/
	}

}
