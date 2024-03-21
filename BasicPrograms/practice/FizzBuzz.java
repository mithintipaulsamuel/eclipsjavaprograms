/*
3-fizz
5-buzz
3&5-fizzbuzz
else not */
import java.util.Scanner;
class FizzBuzz
 {
  public static void main(String args[])
   {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.print("enter an integer = ");
    n=s.nextInt();
    if(n%3==0&&n%5==0)
    {
      System.out.println("FizzBuzz");
    }
    else if(n%3==0)
    {
      System.out.println("Fizz");
    }
    else if(n%5==0)
    {
     System.out.println("Buzz");
    }
    else 
    {
      System.out.println("It is not divisible by 3and 5");
    }
   }
 }