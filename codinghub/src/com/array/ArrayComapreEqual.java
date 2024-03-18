package com.array;
import java.util.Scanner;
public class ArrayComapreEqual 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements of size 5 : ");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array-A Elements : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter array elements of size 5 : ");
		int b[]=new int[5];
		for(int i=0;i<5;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("Array-B Elements : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		ArrayMethod obj=new ArrayMethod();
		obj.CompareArray(a,b);
	}
}

class ArrayMethod
{
	public void CompareArray(int a[],int b[])
	{
		if(a.length!=b.length)
			System.out.println("Not Equal");
		else
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					System.out.println("Not equal");
					break;
				}
				else
					count++;
			}
			if(count==a.length)
				System.out.println("Equal");
		}
	}
}
