package com.string;
import java.util.Arrays;
public class scp 
{
	public static void main(String ars[])
	{
		String s1="Asdf;lkJzxcmnvbg.,Mnh";
		
	//Length of a String
		System.out.println(s1.length());
	//Rverse of a String using loop
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		//Rverse of a String using buffer method
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		s1=sb.toString();
		System.out.println(s1);
		
		String s3="Hai";
		String s4="Hello";
		String s5=new String("Hai");
		String s6=new String("Hello");
		String s7="Hai";
		System.out.println(s3==s7);
		System.out.println(s3==s5);
		System.out.println(s4==s6);
		System.out.println(s3.equals(s5));
		System.out.println(s4==(s6.intern()));
		
		//Program to print the characters in a String using charAt().
		System.out.println(s5.charAt(1));
		String s8="";
		//Java program to concatenate two Strings by using concat() and + operator
		System.out.println(s1.concat(s7));
		for(int i=0;i<s7.length();i++)
		{
			 s8=s7.charAt(i)+s8;
		}
		System.out.println(s8);
		
		
		//Java program to find the length of a String without using length() method
		int length=0;
		for(int i=0;i<s6.length();i++)
		{
			length++;
		}
		System.out.println(length);
		
		//Program to find how many Uppercase letters , lowercase letter , symbols & numbers are present in a String 
		char[] a=s1.toCharArray();
		int ucount=0,lcount=0,ncount=0,scount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A'&&a[i]<='Z')
			{
				ucount++;
			}
			else if(a[i]>='a'&&a[i]<='z')
			{
				lcount++;
			}
			else if(a[i]>='0'&&a[i]<='9')
			{
				ncount++;
			}
			else
			{
				scount++;
			}
		}
		System.out.println("ucount"+ucount);
		System.out.println("lcount"+lcount);
		System.out.println("ncount"+ncount);
		System.out.println("scount"+scount);
		
		int dcount=0;
		//Java program to find the number of characters, number of words & number of lines in a String.
		String s9="Java program to find the number of characters, number of words & number of lines in a String."
				+ "Program to find how many Uppercase letters , lowercase letter , symbols & numbers are present in a String "
				+ "Java program to concatenate two Strings by using concat() and + operator"
				+ "Program to print the characters in a String using charAt().";
		System.out.println("There are "+s9.length()+" characters");
		String[] ar=s9.split(" ");
		char[] arr=s9.toCharArray();
		for(char ch:arr)
		{
			if(ch=='.')
			{
				dcount++;
			}
		}
		System.out.println("There are "+ar.length+" words");
		System.out.println("There are "+dcount+" lines");
		
		int vcount=0,concount=0;
		//Java program to find the number of vowels and consonants in a  
		for(char ch:arr)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')
			{
				vcount++;
			}
			else 
			{
				concount++;
			}
		}
		System.out.println(vcount);
		System.out.println(concount);

		
		//Java program to find the duplicate characters in a String 
		//String s1="Asdf;lkJzxcmnvbg.,Mnh";
		char[] car=s9.toCharArray();
		boolean[] b=new boolean[car.length];
		for(int i=0;i<car.length;i++)
		{
			int dupcount=1;
			if(b[i]==true)
			{
				continue;
			}
			else
			{
				for(int j=i+1;j<car.length;j++)
				{
					if(car[i]==car[j])
					{
						dupcount++;
						b[j]=true;
					}
				}
			}
			System.out.println(car[i]+" "+dupcount);
		}
		
		
		//program to sort a string both in Ascending and Descending (use both charAt() &toCharArray())
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				char temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for(char ch:a)
		{
			System.out.print(ch);
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				char temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for(char ch:a)
		{
			System.out.print(ch);
		}
		System.out.println();
		
		//Java program to Create String arrat and display them.
		String[] sarray=s9.split(" ");
		for(String ch:sarray)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
		
		//program to delete spaces in starting and ending of a string
		String s10="hello";
		String s11="HELLO";
		System.out.println((s10).concat(s11));

		System.out.println((s10.trim()).concat(s11));
		
		
		//Java program to compare two String using compareToIgnoreCase()
		System.out.println(s10.compareTo(s11));
		System.out.println(s10.compareToIgnoreCase(s11));
		
		
		//Java Program to find a String is  Palindrome  or not
		String s12="madam";
		StringBuffer sbn=new StringBuffer(s12);
		sbn.reverse();
		if(s12.contentEquals(sbn))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		
		
		//Java Program to find two Strings are  Anagram  or not
		String s13="mad";
		String s14="dam";
		char[] array=s13.toCharArray();
		Arrays.sort(array);
		String s15="";
		s15=array.toString();
		char[] array1=s14.toCharArray();
		Arrays.sort(array1);
		String s16="";
		s16=array.toString();
		if(s15.equals(s16))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
		
	}

}
