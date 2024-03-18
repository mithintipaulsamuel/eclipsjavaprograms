package com.range;

public class ArmstrongRange {

	public static void main(String[] args) 
	{
		int count=0,r=0,sum=0,i=1,range=0;
		for(;i<=1000;i++)
		{
			sum=0;
			r=0;
			count=0;
			int n=i;//1,n=2
			int temp=n;//1,2
			
			while(n>0)//1>0,2>0
			{
				count++;
				n=n/10;
			}//1,1
			n=temp;//n=1,n=2
			while(n>0)//1>0,2>0
			{
				r=n%10;//1,2
				sum=sum+(int)(Math.pow(r,count));//0+1=1,0+2=2
				n=n/10;
			}
			n=temp;//n=1,,n=2
			if(n==sum)
			{
				System.out.println(n);
				range++;
			}

		}
		System.out.println("The range of Armstrong numbers between 1-1000 is "+range);

	}

}

