package com.Constructors;

public class StudentPercentage
{
	public static void main(String args[])
	{
		Std obj=new Std("Mithinti Paul Samuel",18,19,20,'A');
		
		int totalmarks=obj.TotalMarks(100);
		System.out.println("Total marks = "+totalmarks);
	}
}


class Std
{
	String name;
	int m1,m2,m3;
	char sec='A';
	
	Std()
	{
		name="Samuel";
		m1=17;m2=18;m3=19;
		sec='B';
	}
	Std(String name,int m1,int m2,int m3,char sec)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.sec=sec;
	}
	public int TotalMarks(int m1)
	{
		int total=0;
		this.m1=m1;
		total=this.m1+m2+m3;
		return total;
	}
}