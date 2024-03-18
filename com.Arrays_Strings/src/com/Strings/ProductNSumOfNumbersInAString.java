package com.Strings;

public class ProductNSumOfNumbersInAString 
{
	public static void main(String args[])
	{
		String s1="a11cb10fg12f13ghhjkjkk14y15";//11,1
		int num=0,sum=0,product=1,pnum=1;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				num=num*10+Character.getNumericValue(ch);
				pnum=num;
			}
			else if(Character.isAlphabetic(ch))
			{
				
				sum=sum+num;
				product=product*pnum;
//				System.out.println(sum+" "+product);
				num=0;
				pnum=1;
			}
		}
		System.out.println("sum of the digits in a string are :"+sum);
		System.out.println("Product of the numbers in a string are :"+product);
	}
}
