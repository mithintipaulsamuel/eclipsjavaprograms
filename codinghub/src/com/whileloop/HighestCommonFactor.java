package com.whileloop;
import java.util.Scanner;
public class HighestCommonFactor 
{
	public static void main(String args[])
	{
       int n1,n2,small,i=1,count=0;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a number : ");
       n1=s.nextInt();
       System.out.println("Enter a number : ");
       n2=s.nextInt();
       if(n1<n2)
       small=n1;
       else 
    	   small=n2;
		//n1=5,n2=10;
       while(i<=small)
       {
        if(n1%i==0&&n2%i==0)
        {
        	System.out.println(i);
        }
        count=i;
        i++;
       }
       System.out.println("HCF of "+n1+" and "+n2+" is "+count);
		
	}

}
