package com.ArraysChapter1;
import java.util.Scanner;
public class InsertnDisplayElements 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
//		integers as inputs
		int[] a=new int[5];
		System.out.println("Enter any 5 integers :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Integer array elements are :");
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		int count=0;
		for(int temp:a)
		{
			count++;
		}
		System.out.println("Length of an integer array = "+count);
		
		
		//characters as inputs
		System.out.println("Enter any 5 characters :");
		char[] ch=new char[5];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.print("Character array elements are :");
		for(char temp:ch)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		int charcount=0;
		for(char temp:ch)
		{
			charcount++;
		}
		System.out.println("Length of a character array = "+count);
		
		//strings as inputs
		System.out.println("Enter any 5 Strings :");
		String[] s=new String[5];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		System.out.print("String array elements are :");
		for(String temp:s)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		int stringcount=0;
		for(int temp:a)
		{
			stringcount++;
		}
		System.out.println("Length of a String array = "+count);
		
		//boolean as inputs
		System.out.println("Enter any 5 boolean values :");
		boolean[] b=new boolean[5];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextBoolean();
		}
		System.out.print("Boolean array elements are :");
		for(boolean temp:b)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		int boolcount=0;
		for(int temp:a)
		{
			boolcount++;
		}
		System.out.println("Length of a boolean array = "+count);
		System.out.println("length of an array 'a' = "+a.length);
		System.out.println("length of an array 'ch' = "+ch.length);
		System.out.println("length of an array 's' = "+s.length);
		System.out.println("length of an array 'b' = "+b.length);
	}
}
