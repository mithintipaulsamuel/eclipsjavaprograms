package com.forloop;
import java.util.Scanner;
public class HighestCommonFactor 
{
	public static void main(String args[])
	{
		int n1,n2,hcf=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number ");
		n1=s.nextInt();
		System.out.println("Enter any number ");
		n2=s.nextInt();
		int small=n1<n2?n1:n2;
		for(int i=1;i<=small;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("Hcf of "+n1+" and "+n2+" is "+hcf);
		
	}
}
