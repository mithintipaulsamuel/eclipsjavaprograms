import java.util.Scanner;
class Cube
 {
   public static void main(String args[])
   {
     int n,i=1;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter how many cubes do you required from 1 =  ");
     n=s.nextInt();
     while(i<=n)
     {
       System.out.println("cube of "+i+" = "+(Math.pow(i,3)));
       i++;
     }
   }
 }