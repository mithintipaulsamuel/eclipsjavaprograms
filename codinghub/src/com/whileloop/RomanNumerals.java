package com.whileloop;
import java.util.Scanner;
public class RomanNumerals
{
	public static void main(String args[])
	{
		//74530
		int num,r=0,rev=0,count1=0,nr=0,count2=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=s.nextInt();
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
			count1++;
		}
		System.out.println("Reverse of a number : "+rev);
		int temp=rev;
		while(rev>0)
		{
			nr=rev%10;
			if(nr==1)
				System.out.print("I ");
			if(nr==2)
				System.out.print("II ");
			if(nr==3)
				System.out.print("III ");
			if(nr==4)
				System.out.print("IV ");
			if(nr==5)
				System.out.print("V ");
			if(nr==6)
				System.out.print("VI ");
			if(nr==7)
				System.out.print("VII ");
			if(nr==8)
				System.out.print("VIII ");
			if(nr==9)
				System.out.print("IX ");
			rev=rev/10;	
			count2++;
		}		
		int diff=count1-count2;
		while(diff>0)
		{
			System.out.print("O ");
			diff--;
		}
	}
}
