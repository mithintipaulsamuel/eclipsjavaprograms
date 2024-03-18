package com.forloop;
import java.util.Scanner;
public class TwinPrime 
{
	public static void main(String args[])
	{
		int n1,n2,count=0,count2=0,i=2,j=2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number.");
		n1=s.nextInt();
		System.out.println("Enter any number.");
		n2=s.nextInt();
		if(n1-n2==2||n2-n1==2)
		{
	        for(;i<=n1/2;i++)
	        {
	        	if(n1%i==0)
	        	{
	        		count++;
	        		break;
	            }
	        }	
	        for(;j<=n2/2;j++)
	        {
	        	if(n2%j==0)
	        	{
	        		count2++;
	        	}
	        }
	        if(count==0&&count2==0)
	        {
	        	System.out.println(n1+" and "+n2+" are twin primes");
	        }
	        else
	        {
	        	System.out.println("Not twin primes. ");
	        }
		}
        
		else
		System.out.println("Sorry enter any other numbers.");

	}
}
