package com.whileloop;
import java.util.Scanner;
public class Reverse1 
{
	public static void main(String args[])
	{
		int n,r,sum=0,count=0,count1=0,newsum,count2=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number = ");
		n=s.nextInt();//120
		while(n>0)//120>0,12>0,1>0
		{
			count++;//1+1+1
			r=n%10;//0,2,1
			n=n/10;//12,1,0
			sum=sum*10+r;//0,2,21
			
		}
		System.out.println("Count of first number = "+count);//3
		System.out.println("Reverse of a number is "+sum);//21
		newsum=sum;//21
		while(sum>0)//21>0,2>0
		{
			count1++;//1+1
			sum=sum/10;//2,0
		}
		System.out.println(count1);//2
		if(count==count1)
		{
			System.out.println("Reverse of "+n+" is "+newsum);
		
		}
		else
		{
			count2=count-count1;//1
			while(count2>=1)//1>=1
			{
				newsum=newsum*10;//21*10
				count2--;//0
			}
			System.out.println("Reverse of "+n+" is "+newsum);
			System.out.println("Reverse num + 17 = "+(newsum+17));
		}
	}

}
