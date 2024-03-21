import java.util.Scanner;
class LargestInAscendingOrder
 {
   public static void main(String args[])
    {
      int a,b,c;
      Scanner s=new Scanner(System.in);
      System.out.print("Enter any integer = ");
      a=s.nextInt();
      System.out.print("Enter any integer = ");
      b=s.nextInt();
      System.out.print("Enter any integer = ");
      c=s.nextInt();
      if(a<b)
      {
      }
      else
      {
     //a=1,b=2
       a=a+b;//a=3
       b=a-b;//b=1
       a=a-b;//a=a-b
      }
      if(b<c)
      {
      }
      else
      {
       b=b+c;
       c=b-c;
       b=b-c; 
      }
      if(a<b)
      {
      }
      else
      {
       a=a+b;
       b=a-b;
       a=a-b;
      }
     System.out.println("The Ascending order of the given numbers ==> "+a+","+b+","+c+".");
    }
 }