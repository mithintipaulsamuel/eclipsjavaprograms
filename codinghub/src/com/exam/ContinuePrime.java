package com.exam;
import java.util.Scanner;
public class ContinuePrime 
{
	public static void main(String args[])
	{
		int n,temp,count=0;
		String response="yes";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=s.nextInt();
		temp=n/2;
		while(response.equalsIgnoreCase("yes"))
		{
			if(n==1)
			{
				System.out.println(n+" is neither a Prime or Composite number");
			}
			else
			{
				for(int i=temp;i>=2;i--)
				{
					if(n%i==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(n+" is a Prime Number.");
				}
				else
				{
					System.out.println(n+" is a Composite Number");
				}
				count=0;
			}

			System.out.println("If you want to continue type YES else type NO");
			response=s.next();
			if(response.equalsIgnoreCase("YES"))
			{
				System.out.println("Enter any other number : ");
				n=s.nextInt();
				temp=n/2;
			}
			else
				System.out.println("*** THANK YOU ***");
			

		}
		
			

	}
}
