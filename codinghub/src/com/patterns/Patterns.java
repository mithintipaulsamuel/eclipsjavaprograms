package com.patterns;
import java.util.Scanner;
public class Patterns 
{
	public static void main(String args[])
	{
		int rows,columns,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows : ");
		rows=s.nextInt();
//		System.out.println("Enter columns : ");
//		columns=s.nextInt();
		int n=2;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;)
			{
				count=0;
				for(int k=2;k<=n/2;k++)
				{
					if(n%k==0)
						count++;
				}
				if(count==0)
				{
					System.out.print(n+" ");
					n++;
					j++;
				}
				else
				{
					n++;
				}
			}
			System.out.println();
		}
	}
}
