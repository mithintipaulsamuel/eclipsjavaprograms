import java.util.Scanner;
class Largest
 {
  public static void main(String args[])
  {
   int n1,n2,n3;
   Scanner s=new Scanner(System.in);
   System.out.print("Enter any integer = ");
   n1=s.nextInt();
   System.out.print("Enter any integer = ");
   n2=s.nextInt();
   System.out.print("Enter any integer = ");
   n3=s.nextInt();
   int n4=n1>n2&&n1>7n3?n1:n2>n3?n2:n3;
   System.out.println(n4+" is the LARGEST NUMBER");
  }
 }