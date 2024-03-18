package com.Strings;

public class Reversealternative 
{
	public static void main(String args[])
	{
		String s1="java program to reverse alternative words in a String array",s2="";
		System.out.println(s1);
		String[] sar=s1.split(" ");
//		Stringbuffer
		for(int i=0;i<sar.length;i++)
		{
			if(i%2!=0)
			{
			StringBuffer sb=new StringBuffer(sar[i]);
			sb.reverse();
			sar[i]=sb.toString();
			}
			s2=s2+sar[i].toString()+" ";
		}
		System.out.println(s2);
	}
}
