package com.methods;
import java.util.Scanner;
public class Studentpercentage 
{
	public static void main(String args[])
	{
		int s1,s2,s3,s4,s5,s6;
		double max;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur telugu marks : " );
		s1=s.nextInt();
		System.out.println("Enter ur hindi marks : " );
		s2=s.nextInt();
		System.out.println("Enter ur english marks : " );
		s3=s.nextInt();
		System.out.println("Enter ur maths marks : " );
		s4=s.nextInt();
		System.out.println("Enter ur science marks : " );
		s5=s.nextInt();
		System.out.println("Enter ur social marks : " );
		s6=s.nextInt();
		System.out.println("Enter ur max marks : " );
		max=s.nextDouble();
		Student student=new Student();
		int sum=(student.total(s1,s2,s3,s4,s5,s6));
		System.out.println("Sum = "+sum);
		double per= student.percent(sum,max);
		System.out.println("Percentage : "+per);
		
	}
}


class Student
{
	int total(int s1,int s2,int s3,int s4,int s5,int s6)
	{
		int sum=s1+s2+s3+s4+s5+s6;
		return sum;
	}
	double percent(int toatl,double max)
	{
		
		double percentage=(toatl/max)*100;
		return percentage;
	}
}
