import java.util.Scanner;
class PerfectSquare
 {
   public static void main(String args[])
   {
     int n1;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter a number to check wether it is perfect or not:");
     n1=s.nextInt();
     int n2=(int) Math.sqrt(n1);
     if((n2*n2)==n1)
     {
       System.out.println(n1+" is a perfect square.");
     }
     else
       System.out.println(n1+" is not a perfect square.");
   }
 }