package com.methods;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=s.nextInt();
		ArmstrongNum armstrongnum=new ArmstrongNum();
		int count=armstrongnum.count(num);
		System.out.println("No of Digits : "+count);
		double num2=armstrongnum.SumOfPowerOfDigits(num,count);
		System.out.println("Sum of power of digits : "+num2);
		armstrongnum.Check(num,num2);
		
	}
}

class ArmstrongNum
{
	public int count(int num)
	{
		int count=0,r=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public double SumOfPowerOfDigits(int num,int count)
	{
		int r=0;
		double revnum=0;
		while(num>0)
		{
			r=num%10;
			revnum=revnum+(Math.pow(r,count));
			num=num/10;
		}
		return revnum;
	}
	public void Check(int num,double num2)
	{
		if(num==num2)
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrongnumber");
	}
}
