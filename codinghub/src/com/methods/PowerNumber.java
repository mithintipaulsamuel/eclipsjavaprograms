package com.methods;
import java.util.Scanner;
public class PowerNumber 
{
 	public static void main(String args[])
 	{
 		Scanner s=new Scanner(System.in);
 		System.out.println("Enter a start number : ");
 		int startnum=s.nextInt();
 		System.out.println("Enter a end number : ");
 		int endnum=s.nextInt();
 		Power obj=new Power();
 		for(int i=startnum;i<=endnum;i++)
 		{
 			int num=i;
 	 		int sum=obj.Sum(num);
 	 		int mul=obj.Product(num);
 	 		obj.Check(sum, mul,num);
 		}
 	}

}

class Power
{
	public int Sum(int num)
	{
		int sum=0,rem=0;
		while(num>0)
		{
		 	rem=num%10;
		 	sum=sum+rem;
		 	num=num/10;
		}
		return sum;
	}
	
	public int Product(int num)
	{
		int mul=1,rem=0;
		while(num>0)
		{
		 	rem=num%10;
		 	mul=mul*rem;
		 	num=num/10;
		}
		return mul;
	}
	public void Check(int sum,int mul,int num)
	{
		if(sum==mul)
			System.out.println(num);
	}
}
