package com.Strings;

public class CountOfRepeatedwords
{
	public static void main(String args[])
	{
		String s1="sum of the digits in a string are product of the nub=mber in a  ih the string are of";
		String[] sar=s1.split(" ");
		int count,wordcount=0;
		boolean[] b=new boolean[sar.length];
		for(int i=0;i<sar.length;i++)
		{
			if(b[i]==true)
			{
				continue;
			}
			else
			{
				count=1;
				for(int j=i+1;j<sar.length;j++)
				{
					if(sar[i].equals(sar[j]))
					{
						count++;
						b[j]=true;
					}
				}
			}
			if(count>1)
			{
				wordcount++;
			}
		}
		int bbcount=0;
		for(boolean bool:b)
		{
			if(bool==true)
			{
				bbcount++;
			}
		}
		System.out.println("there are"+bbcount+" repeated words" );
	}
}
