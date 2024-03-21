import java.util.Scanner;
class PrimeCheck
 {
   public static void main(String args[])
    {
      int n,i=2,count=0;
      Scanner s=new Scanner(System.in);
      System.out.print("Enter a number to check the given number is Prime or Composite:");
      n=s.nextInt();
      if(n==1)
      {
        System.out.println(n+" is neither prime nor composite number.");
      }
     else
     {
      while(i<=n/2)
      {
        if(n%i==0)
	{
	   count++;
	}
        i++;
      }
      if(count==0)
	{
	  System.out.println(n+" is a prime number.");
	}
      else
	{
	  System.out.println(n+" is a composite number.");
	}
      }
    }
 }