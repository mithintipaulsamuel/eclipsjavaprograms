package com.array;

public class ArrayPalindrome 
{
	public static void main(String args[])
	{
		int a[]=new int[] {10,1,33,20,30,40,50,60};
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i],rem=0,rev=0,copy=temp;
			while(copy!=0)
			{
				rem=copy%10;
				rev=rev*10+rem;
				copy=copy/10;
			}
			if(temp==rev)
				System.out.println(temp);
	    }
		


	}
}
