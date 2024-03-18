package com.ArraysChapter3;
import java.util.Scanner;
public class CountOfEvenOddNegPovNum 
{
	public static void main(String args[])
	{
		int[] a=new int[15];
		//program to find out how many of them are positive, 
		//how many are negative, how many are even and how many odd.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array elements of size 15 : ");
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
		int evencount=0,oddcount=0,negcount=0,poscount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else 
			{
				oddcount++;
			}
			if(a[i]<0)
			{
				negcount++;
			}
			else
			{
				poscount++;
			}
		}
		System.out.println("evencount"+evencount);
		System.out.println("oddcount"+oddcount);
		System.out.println("negcount"+negcount);
		System.out.println("poscount"+poscount);
	}
}
