package com.StringPrograms;

public class StringVariousProgrms
{
	public static void main(String args[])
	{
		//Program to convert the the  even index words to small and odd indexed words should be print in captial and reverse.
		//INPUT:Hello all good morning
		//OUTPUT:hello LLA good GNINROM
//		String s1="Hello all good morning";
//		System.out.println(s1);
//		String[] sarray=s1.split(" ");
//		for(int i=0;i<sarray.length;i++)
//		{
//			if(i%2==0)
//			{
//				String s=sarray[i];
//				s=s.toLowerCase();
//				System.out.print(s+" ");
//				
//			}
//			else
//			{
//				String s=sarray[i];
//				StringBuffer sb=new StringBuffer(s);
//				sb.reverse();
//				String rev=sb.toString();
//				rev=rev.toUpperCase();
//				System.out.print(rev+" ");
//			}
//		}
		
		
//		//Program to print the words having highest no.of vowels. 
//		String s1="all Hello good morning";
//		String[] sarray=s1.split(" ");
//		int max=0;
//		String newstring="";
//		for(int i=0;i<sarray.length;i++)
//		{
//			String s=sarray[i];
//			char[] carray=s.toCharArray();
//			int count=0;
//			for(int j=0;j<carray.length;j++)
//			{
//				if(carray[j]=='a'||carray[j]=='e'||carray[j]=='i'||carray[j]=='o'||carray[j]=='u'||carray[j]=='A'||carray[j]=='E'||carray[j]=='I'||carray[j]=='O'||carray[j]=='U')
//				{
//					count++;
//				}
//			}
////			System.out.println("There are "+count+" vowels in "+s);
//			if(count>max)
//			{
//				max=count;
//			    newstring=s;
////			    System.out.println(newstring+" has the highest number of vowels with count "+max+".");
//			}
//			else if(max==count)
//			{
//				System.out.println(s+" ===> has the highest number of vowels with count "+max+".");	
//			}
//		}
//		 System.out.println(newstring+" ===> has the highest number of vowels with count "+max+".");
		
		//Program to print the sum of the digits in a string
//		String s1="a1b2c3";
//		int sum=0;
//		for(int i=0;i<s1.length();i++)
//		{
//			char ch=s1.charAt(i);
//			if(ch>='0'&& ch<='9')
//			{
//				//The below line " Character.getNumericValue(char)" method  is used to extract the number from a String. 
////				System.out.println(Character.getNumericValue(ch));
//				sum=sum+Character.getNumericValue(ch);
//			}
//		}
//		System.out.println(sum);
		
		
		//Program to capitalize the first letter of every word
//		String str="Hai hello good morning";
//		String[] sarray=str.split(" ");
//		for(String s:sarray)
//		{
//			String s1="",s2="";
//			for(int i=0;i<s.length();i++)
//			{
//				if(i==0)
//				{
//					s1=s1+s.charAt(i);
//				}
//				else
//				{
//					s2=s2+s.charAt(i);
//				}
//			}
//			s1=s1.toUpperCase()+s2;
//			System.out.print(s1+" ");
//		}
		
		//Program to find the number of words in a String.
//		String s1="Hai hello good morning";
//		String[] sarray=s1.split(" ");
//		System.out.println("There are "+(sarray.length)+" words in a given String.");
		
		
		//program to print the first letter of each word in a String.
//		String s1="Coding hub innovation private limited";
//		String[] sarray=s1.split(" ");
//		for(int i=0;i<sarray.length;i++)
//		{
//			String s=sarray[i];
//			String s2="";
//			s2=s2+s.charAt(0);
//			System.out.print(s2.toUpperCase());
//		}
		
		
		//Program to print the words repeatedly as per the number that lies towards its right.
		//Hi 1 Hello 2 HRU 3.
//		String s1="Hi sai 1 Hello 2 HRU 3 ";
//		String s2="";
//		for(int i=0;i<s1.length();i++)
//		{
//			
//			char ch=s1.charAt(i);
//			if(Character.isAlphabetic(ch)||ch==' ')
//			{
//				s2=s2+ch;
//			}
//			else if(Character.isDigit(ch))
//			{	
//				int n=Character.getNumericValue(ch);
//				while(n>0)
//				{
//					System.out.println(s2);
//					n--;
//				}
//				s2="";
//			}
//		}
		
		//Program to print the sum of the numbers in a string.
//		String s1="a10b12c13";
//		int num=0,sum=0;
//	    for(int i=0;i<s1.length();i++)
//	    {
//	    	if(Character.isDigit(s1.charAt(i)))
//	    	{
//	    		num=num*10+Character.getNumericValue(s1.charAt(i));
//	    	}
//	    	else if(Character.isAlphabetic(s1.charAt(i)))
//	    	{
//	    		sum=sum+num;
//	    		num=0;
//	    	}
//	    	if(i==s1.length()-1&&Character.isDigit(s1.charAt(i)))
//	    	{
//	    		sum=sum+num;
//	    	}
//	    }
//	    System.out.println(sum);
		
		
		
		//Program to print the words repeatedly as per the number that lies towards its right.
		//a10b12c13
		String s1="abc 10 b 12 c 13";
		String[] sarray=s1.split(" ");
		for(int i=0;i<sarray.length;i++ )
		{
			String s=sarray[i];
			if(Character.isAlphabetic(s.charAt(0)))
			{
				continue;
			}
			else
			{
				int num=Integer.parseInt(s);
				while(num>0)
				{
					System.out.println(sarray[i-1]);
					num--;
				}
			}
		}
	}
}
