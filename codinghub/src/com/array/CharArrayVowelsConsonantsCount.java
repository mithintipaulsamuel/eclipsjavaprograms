package com.array;

public class CharArrayVowelsConsonantsCount 
{
	public static void main(String args[])
	{
		char a[]=new char[] {'o','u','e','w','q','g','f','d','s'};
		int vcount=0,ccount=0;
		System.out.print("Array a elements are:");
		for(char ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
			{
				//System.out.print(a[i]+" ");
				vcount++;
			}
			else
			{
				//System.out.print(a[i]+" ");
				ccount++;
			}
		}
		System.out.println("There are "+vcount+" vowels in a given array");
		System.out.println("There are "+ccount+" consonants in a given array");
	}
}
