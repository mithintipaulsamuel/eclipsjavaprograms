package com.string;

public class StringMethods 
{
	public static void main(String args[])
	{
		String s1="Hello all good morning",s2=" Praise The Lord";
		System.out.println("Concatination");
		System.out.println("-------------------");
		System.out.println(s1.concat(s2));
		System.out.println("To Upper Case");
		System.out.println("-------------------");
		System.out.println(s1.toUpperCase());
		System.out.println("To Lower Case");
		System.out.println("-------------------");
		System.out.println(s2.toLowerCase());
		System.out.println("To find the Length of String");
		System.out.println("-----------------------------");
		System.out.println(s1.length());
		System.out.println("Comparing two strings wehter they are equal or not:");
		System.out.println("----------------------------------------------------");
		System.out.println(s1.equals(s2));
		
		
	}
}
