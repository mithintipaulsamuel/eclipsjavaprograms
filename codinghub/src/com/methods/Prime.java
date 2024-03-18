package com.methods;
import java.util.Scanner;
public class Prime 
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a  number ");
		num=s.nextInt();//5
		PrimeNumber primenumber=new PrimeNumber();
		int count=primenumber.NoOfFactors(num);
		primenumber.PrimeCheck(num,count);//count=0		
	}
}


class PrimeNumber
{
	public int NoOfFactors(int num)//num=5,
	{
		int count=0;
		{
			for(int i=2;i<=num/2;i++)//2<=2,3!<=2break
			{
				if(num%i==0)//5%2!==0
					count++;//count=0,
			}
		}
		return count;//count=0
	}
	
	public void PrimeCheck(int num,int count)//count=0,
	{
		if(count==0&&num!=1)
			System.out.println(num+" is Prime");
		else if(num==1)
			System.out.println("1 is nither Prime nor Composite");
		else
			System.out.println(num+" is a Composite number");
	}
}