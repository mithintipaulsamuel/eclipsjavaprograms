package com.ArraysChapter3;
import java.util.Scanner;
public class SearchArray 
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int search=12,count=0;
		//Write a program to find if the number to be searched is present in the array and if
		//it is present, display the number of times it appears in the array.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array elements of size 10 : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Array elemsnts of 'a' are : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Element found and it has repeated "+count+" number of times.");
		}
		else if(count==0)
		{
			System.out.println("Element not found.");
		}
	}
}
