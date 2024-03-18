package com.string;

public class StringCharsFrequency 
{
	public static void main(String ags[])
	{
		String s1="Search online for the Py1234567890thon documentation for the len()\r\n"
				+ "function. It will be on a web page ti!@#$%^&*()_+|}{|:';?><,./tled “Built-in Functions.” Skim the \r\n"
				+ "list of other functions Python has, look up what the round() function \r\n"
				+ "does, and experiment with it in the interactive shell.";
		int caps=0,small=0,num=0,space=0,symb=0,capvow=0,capcons=0,smallvow=0,smallcons=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					capvow++;
				}
				else
				{
					capcons++;
				}
				caps++;
			}
			else if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					smallvow++;
				}
				else
				{
					smallcons++;
				}
				small++;
			}
			else if(ch>='0'&&ch<='9')
			{
				num++;
			}
			else if(ch==' ')
			{
				space++;
			}
			else
			{
				symb++;
			}
		}
		System.out.println("There are "+caps+" capital letters are there");
		System.out.println("There are "+capvow+" capital  vowel letters are there");
		System.out.println("There are "+capcons+" capital consonantnletters are there");
		System.out.println("There are "+smallvow+" small  vowel letters are there");
		System.out.println("There are "+smallcons+" small consonantnletters are there");
		System.out.println("There are "+small+" small letters are there");
		System.out.println("There are "+num+" digits are there");
		System.out.println("There are "+space+" spaces are there");
		System.out.println("There are "+symb+" symbols are there");
	}
}
