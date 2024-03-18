package com.methods;
import java.util.Scanner;
public class PrimeRange 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting number of the range : ");
		int startnum=s.nextInt();
		System.out.println("Enter Ending number of the range : ");
		int endnum=s.nextInt();
		PrimeRangeSub obj=new PrimeRangeSub();
		obj.Range(startnum, endnum);
		
		
		
//		for(;startnum<=end;startnum++)
//		{
//			int count=obj.Range(startnum);
//			obj.Check(count,startnum);
//		}

	}
}

class PrimeRangeSub
{
	public void Range(int startnum,int endnum)
	{		
		for(int i=startnum;i<=endnum;i++)
		{
			int num=i;
			int count=0;
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
					count++;
			}
//			return count;
//		}
		
//		public void Check(int count,int num)
//		{
			if(count==0&&num!=1)
				System.out.println(num);
		}
	}
	
}


