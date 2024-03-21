import java.util.Scanner;
class Oddoreven
 {
   public static void main(String agrs[])
   {
    int n;  
    Scanner s=new Scanner(System.in);
    System.out.print("Enter any number = ");
    n=s.nextInt();
    if(n%2==0)
    {
     System.out.println(n+" is an even number.");
    }
    else
    {
     System.out.println(n+" is an odd number.");
    }
   }
 }