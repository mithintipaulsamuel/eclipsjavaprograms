package com.range;

public class MagicRange 
{	
	public static void main(String args[])
	{
		int n,temp=0,r=0,sum=0,product=1,i,range=0;
		System.out.println("Magic numbers between 1-1000 are :");
        for(i=1;i<=1000;i++)
        {
        	n=i;
        	temp=n;
        	r=0;
        	sum=0;
        	product=1;
    		while(n>0)
    		{
    			r=n%10;
    			sum=sum+r;
    			product=product*r;
    			n=n/10;
    		}
    		n=temp;
            if(sum==product)
            {
            	System.out.println(n);
            	range++;
            }
        }
        System.out.println("The range of magic numbers  between 1-1000 is = "+range);
	}
}
