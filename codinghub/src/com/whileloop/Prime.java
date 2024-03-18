package com.whileloop;
import java.util.Scanner;
public class Prime {
	 public static void main(String args[])
	 {
		 int n,i=2,count=0;
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter a number to check wether it is prime or not:");
		 n=s.nextInt();
		/* if(n==1)
		 {
		 System.out.print("Sorry enter any other integer.");
		 n=s.nextInt();
		 }*/
		 while(i<=n/2)
		 {
			 
		   if(n%i==0)
		   {
			count++;   
		   }
		   i++;
		 }
		 
		 if(count==0&&n!=1)
		 {
			 System.out.println(n+" is a prime number.");
		 }
		 else if(count>=3)
		 {
		     System.out.println(n+" is a composite number.");
		 }
		 else
		 {
		     System.out.println("1 is neither prime nor composite.");
		 }
		 
	 }

}
