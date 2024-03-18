package com.Constructors;

public class College_codeByVaniMam 
{
	public static void main(String args[])
	{
//		String s1="asdf";
////		String[] sar=s1.split(" ");
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(s1);
//		System.out.println(s1);
////		System.out.println(sar.length);
//		College college=new College();
//		college.Display();
//		System.out.println("===========================");
//		College college1=new College("ACME Degree College");
//		college1.Display();
//		System.out.println("===========================");
//		College college2=new College("bbabanb",12345);
//		college2.Display();
//		System.out.println("===========================");

		
		
		
	}
}

class College
{
	int college_code;
	String college_name;
	
	//Default Constructor
	College()
	{
		college_code=1055;
		college_name="Osmania University ";
	}
	//Parameterized Constructor
	College(String college_name)
	{
		this.college_name=college_name;
		
	}
	
	
	//Parameterized Constructor

	College(String c_name,int college_code)
	{
		this(c_name);
		this.college_code=college_code;
	}
	
	
	
	public void Display()
	{
		System.out.println(college_name+"["+college_code+"]");
	}
}