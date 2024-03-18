package com.whileloop;

public class Mul1 
{
	public static void main(String args[])
	{
		int n=12345,r=0,count=0,mul1=1,mul2=1,mul3=1;
				while(n>0)
				{
					count++;
					r=n%10;
					n=n/10;
					if(count==1||count==5)
					{
						mul1=mul1*r;
					}
					else if(count==2||count==3)
					{
						mul2=mul2*r;						
					}
					else
					{
						mul3=mul3*r;
					}
				}
				System.out.println((mul1+mul2)*mul3);
	}

}
