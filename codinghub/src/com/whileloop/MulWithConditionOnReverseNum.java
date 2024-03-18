package com.whileloop;

public class MulWithConditionOnReverseNum 
{
	public static void main(String args[])
	{
		int n=1234,r=0,count=0,sum=1,summ=1;
		//r1=n%100;
		//q1=n/100;
		/*while(r1>0)
		{
			r2=r1%10;
			r1=r1/10;
			sum=sum*r2;
		}
		while(q1>0)
		{
			q2=q1%10;
			q1=q1/10;
			summ=summ*q2;
		}*/
		
		while(n>0)//1234>0,123>0,12>0,1>0
		{
			count++;//1,2,3,4
			r=n%10;//4,3,2,1
			n=n/10;//123,12,1,0
			if(count==1||count==2)
			{
				sum=sum*r;//1*4=4,4*3=12
			}
			else
			{
				summ=summ*r;//1*2=2,2*1=2
			}
		}
		
		int wholesum=sum+summ;//12+2=14
		System.out.println(wholesum);
	}
	

}
