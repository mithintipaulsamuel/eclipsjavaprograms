package com.forloop;
import java.util.Scanner;
public class ExtractEvenOddDigit 
{
	public static void main(String args[])
	{
		int n,rem=0,sum=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();//1234
		for(int i=n;i>0;i/=10)//1234,123,12,1
		{
			count++;//1,2,3,4
			rem=i%10;//4,3,2,1
			if(rem%2==0)//4%2==0,3%2!=0,2%2==0,
			{
				rem=rem+2;//4+2=6,2+2=4
			}
			if(rem%2!=0)//3%2!=0,1%2!=0
			{
				rem=rem+1;//3+1=4,1+1=2
			}
			sum=sum*10+rem;//6,60+4=64,640+4=644,6440+2=6442
		}
		System.out.println("Count = "+count);
		System.out.println(sum);

	}
}
