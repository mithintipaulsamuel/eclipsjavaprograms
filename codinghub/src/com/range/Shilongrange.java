package com.range;

public class Shilongrange 
{
	public static void main(String args[])
	{
		int num,n,sum=0,product=1,i,range=0;
        for(i=1;i<=1000;i++)
        {
        	num=i;//1,2
        	n=num/2;//0
        	sum=0;
        	product=1;
    		while(n>=1)
    		{
    			if(num%n==0)
    			{
    				sum=sum+n;
    				product=product*n;
    			}
    			n--;
    		}
    		if(sum==product)
    		{
    			System.out.println(num);
    			range++;
    		}
        }
        System.out.println("The range shilong numbers between 1-1000 = "+range);
	}
}
