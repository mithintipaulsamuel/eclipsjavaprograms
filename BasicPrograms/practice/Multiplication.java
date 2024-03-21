import java.util.Scanner;
class Multiplication 
 {
   public static void main(String args[])
   {
     int n,mul;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter a number to get the multiplication table of it = ");
     n=s.nextInt();
     for(int i=0;i<=10;i++)
      {
        mul=n*i;
        System.out.println(n+"*"+i+"="+mul);
      }
   }
 }