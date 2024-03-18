package com.methods;
import java.util.Scanner;
	class ArmstrongNew
	{
	  public static void main(String agrs[])
	   {
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter a number : ");
	     int num=s.nextInt();
	     ArmstrongWithoutMath obj=new ArmstrongWithoutMath();
	     int count=obj.Count(num);
	System.out.println(count+" = Count");
	     int sum=obj.Sum(num,count);
	System.out.println(sum+" = Sum");
	     obj.Compare(num,sum);
	   }
	}

	class ArmstrongWithoutMath
	{
	  public int Count(int num)
	  {
	    int count=0;
	    while(num>0)
	    {
	      num=num/10;
	      count++;
	    }
	    return count;
	  }
	  public int Sum(int num,int count)
	  {
	   int rem=0,sum=0,temp=1;
	   while(num>0)//153>0
	   {
	     int count1=count,temp1=temp;
	     rem=num%10;//3
	     while(count1>0)//3>0,2>0,1>0,0!>0
	      {
	        temp1=temp1*rem;//temp=1*3=3,temp=3*3,temp=9*3=27
	        count1--;
	      } 
	     sum=sum+temp1;//sum=0+27,
	     num=num/10;
	   }
	   return sum;
	  }
	  public void Compare(int num,int sum)
	  {
	    if(num==sum)
	    System.out.println("Armstrong"); 
	  }
	}
	
	
	
	

