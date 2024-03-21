import java.util.Scanner;
class Smallest
 {
   public static void main(String args[])
   {
     int n1,n2,n3;
     String s1;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter any integer = ");
     n1=s.nextInt();
     System.out.print("Enter any integer = ");
     n2=s.nextInt();
     System.out.print("Enter any integer = ");
     n3=s.nextInt();
     int n4 =n1<n2&&n1<n3?n1:n2<n3?n2:n3; 
     System.out.println(n4+" is the smallest number.");  
     /*
     if(n1<n2&&n1<n3)
     {
       System.out.println(n1+" is the smallest number. ");
     }
     else if(n2<n3)
     {
       System.out.println(n2+" is the smallest number.");
     }
     else 
    {
      System.out.println(n3+" is the smallest number");
    }
    */
   }
 }