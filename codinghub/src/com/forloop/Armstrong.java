package com.forloop;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String args[])
	{
		int count=0,sum=0,rem=0,k=1;
		/*for( k=1;k<=10000;)*/while(k<=10000)
		{
			
		//Scanner s=new Scanner (System.in);
		//System.out.println("Enter a number ");
		//n=s.nextInt();
		
		for(int j=k;j>0;j=j/10)
		{
			count++;
		}
		for(int i=k;i>0;i=i/10)
		{
			rem=i%10;
		    sum=sum+(int)(Math.pow(rem, count));	
		}
		if(sum==k)
		{
			System.out.println(k+" is an armstrong number.");
		}
		k++;
		//else
		//	System.out.println(n+" is not an armstrong number.");
	
	     }
	}
}
