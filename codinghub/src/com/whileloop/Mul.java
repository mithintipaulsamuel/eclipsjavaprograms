package com.whileloop;

public class Mul 
{
	public static void main(String args[])
	{
		int n=1234,temp=n,count1=0,count=0,r=0,sum=1,summ=1;
		while(n>0)
		{
			count++;
			n/=10;
		}
		n=temp;
		while(n>0)//1234>0,123>0,12>0,1>0
		{
			count1++;//1+1+1+1
			r=n%10;//4,3,2,1
			n=n/10;//123,12,1,0
			if(count1==1||count1==count)
			{
				sum=sum*r;//1*4=4,4*1=4
			}
			else
			{
				summ=summ*r;//1*3=3,3*2=6,
			}

		}
		System.out.println(sum+summ);
	}

}
