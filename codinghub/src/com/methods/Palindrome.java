package com.methods;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check wether it is a palindrome or not : ");
		num=s.nextInt();
		PalindromeNumber palindromenumber=new PalindromeNumber();
		int reverse=palindromenumber.Reverse(num);
		palindromenumber.Check(num, reverse);
		
	}
}

class PalindromeNumber
{
	public int Reverse(int num)
	{
		int r=0,reverse=0;
		while(num>0)
		{
			r=num%10;
			reverse=reverse*10+r;
			num=num/10;
		}
		return reverse;
	}
	public void Check(int num,int reverse)
	{
		if(num==reverse)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
}
