package com.array;

public class SortCharArray 
{
	public static void main(String args[])
	{
		char ch[]=new char[] {'h','e','l','l','o'};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(char temp:ch)
		{
			System.out.println(temp);
		}
	}
}
