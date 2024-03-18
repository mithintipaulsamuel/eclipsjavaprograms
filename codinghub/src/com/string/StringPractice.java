package com.string;

public class StringPractice 
{
	public static void main(String args[])
	{
		//String methods
		//split(),==>returntype=String array
		//compareTo
		//s1.equals(s2)
		//s1.contentEquals(s2),
		//trim,
		//concat,
		//upperCase,
		//lowerCase,
		//toCharArray,==>returntype=Char array
		//.replace
		//delete :CharAt, .append,==> StringBuilder methods
		String s1="Hello all good morning it very good to see u all today";
		String s2="hello";
		System.out.println("Hashocode of s2 = "+s2.hashCode());
		String s3="hello";
		System.out.println("Hashocode of s3 = "+s3.hashCode());
		String s4=new String("hello");
		System.out.println("Comparing two String literls");
		System.out.println("equals method "+s2.equals(s3));
		System.out.println("Using == "+(s2==s3));
		System.out.println("========================================");
		System.out.println("Comparing two String literls");
		System.out.println("equals method "+s2.equals(s4));
		System.out.println(s2==s4);
		System.out.println("========================================");
		char[] ch={'s','a','m'};
		String ss=new String(ch);
		System.out.println(ss);
		
	}
}
