package com.whileloop;

public class MulWithConditionOnReverseNum2 
{
	public static void main(String args[])
	{
		int n=1234,count=0,r,num1=0,num2=0,num3=0,num4=0,sum=0;
		while(n>0)
		{
			count++;
			r=n%10;
			n=n/10;
			if(count==1)
			{
				num1=r;
			}
			if(count==2)
			{
				num2=r;
			}
			if(count==3)
			{
				num3=r;
			}
			if(count==4)
			{
				num4=r;
			}
			sum=(num1*num4+num2*num3);
		}
		System.out.println("Required answer is "+sum);
	}

}
