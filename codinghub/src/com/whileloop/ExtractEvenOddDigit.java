package com.whileloop;
import java.util.Scanner;
public class ExtractEvenOddDigit 
{
	public static void main(String args[])
	{
	 int n,r=0,count=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a number = ");
	 n=s.nextInt();
	 while(n!=0)
	 {
	    r=n%10;
	    if(r%2==0)
	    {
	     r=r+2;
	     System.out.print(r);
	    }
	    else
	    {   
	    	r=r+1;
	        System.out.print(r);
	    }
	    count++;
	    n=n/10;
	 }
	 System.out.println();
	 System.out.println("Count of digits of a 17546 = "+count);
	 
	}

}
