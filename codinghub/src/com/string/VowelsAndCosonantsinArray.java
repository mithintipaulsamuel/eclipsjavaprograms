package com.string;

public class VowelsAndCosonantsinArray 
{
	public static void main(String args[])
	{
		String s1="good morning dear friends.";
	    char ch[]=s1.toCharArray();
	    int vcount=0,ccount=0;
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
	    	{
	    		vcount++;
	    	}
	    	else
	    		ccount++;
	    }
	    System.out.println("vowels count"+vcount);
	    System.out.println("consonants count"+ccount);
	}
}
