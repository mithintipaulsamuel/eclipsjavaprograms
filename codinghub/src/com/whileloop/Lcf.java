package com.whileloop;
import java.util.Scanner;
public class Lcf 
{
	public static void main(String args[])
	{	
		int num1,num2,larnum=0,smallnum=0,newlcf=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		num1=s.nextInt();
		System.out.println("enter a number");
		num2=s.nextInt();	
		int small=num1<num2?num1:num2;
		
		int i=small/2;		
		while(i>=2)
		{
			if(num1%i==0&&num2%i==0)
			{
				newlcf=i;
				System.out.println(newlcf);
			}
			i--;
		}
		
		System.out.println("The lcf of "+num1+" and "+num2+" except 1 is "+newlcf);
	}

}
