package com.Opps_QA;
import java.util.Scanner;
public class CustomExceptionEx 
{
	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter your total amount");
		int total=s.nextInt();
		System.out.println("Enter your withdrawl amount");
		int withdrawl=s.nextInt();
		if(withdrawl>total)
		{
			try
			{
				throw new InsuffException("Low Balance");
			}
			catch(InsuffException ae)
			{
//				System.out.println("LowBalance");
				System.out.println(ae.getMessage());
//				System.out.println(ae);
 				//ae.printStackTrace();
			}
		}
		else
		{
			System.out.println("Balance = "+(total-withdrawl));
		}
	}
}
class InsuffException extends Exception
{
	
	InsuffException(String msg)
	{
		//super();
		super(msg);
		//System.out.println(msg);
	}
}
