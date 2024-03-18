package com.methods;

	import java.util.Scanner;
	public class ArmstrongRangeUpLoop
	{
		public static void main(String args[])
		{
			int startnum,endnum;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a start number : ");
			startnum=s.nextInt();
			System.out.println("Enter a end number : ");
			endnum=s.nextInt();
			Arms obj=new Arms();
			for(int i=startnum;i<=endnum;i++)
			{
				int num=i;
				int count=obj.CountUp(num);
				int sum=obj.SumUp(num, count);
				obj.CheckUp(num, sum);
			}
		}
	}

	class Arms
	{
		public int CountUp(int num)
		{
			int count=0;
			while(num>0)
			{
				num=num/10;
				count++;
			}
			return count;
		}
		public int SumUp(int num,int count)
		{
			int sum=0,rem=0;
			while(num>0)
			{
				rem=num%10;
				sum=sum+(int)(Math.pow(rem, count));
				num=num/10;
			}
			return sum;
		}
		public void CheckUp(int num,int sum)
		{
			if(num==sum)
				System.out.println(num);
		}

		
	}

