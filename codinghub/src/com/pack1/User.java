package com.pack1;

public class User
{
	public int day_wise_salary;
	public void Sal_cal(int present_days)
	{
		int final_salary=day_wise_salary*present_days;
		System.out.println("Your salary is = "+final_salary);
	}
	
}
