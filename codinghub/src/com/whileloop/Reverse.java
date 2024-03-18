package com.whileloop;

public class Reverse 
{
	public static void main(String args[])
	{
		int n=1200000,count1=0,count2=0,count3=0,r,rev=0,newrev;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			count1++;
		}
		System.out.println("Count of first number is = "+count1);
		System.out.println("Reverse of a number is = "+rev);
		newrev=rev;
		while(rev>0)
		{
			rev=rev/10;
			
			count2++;
		}
		System.out.println("Count of second number is = "+count2);
		
		count3=count1-count2;
		System.out.println("The difference between two numbers is = "+count3);
		int newrev1=(int)(newrev*Math.pow(10,count3));
		newrev1=newrev1+17;
		System.out.println(newrev1);
	}

}
