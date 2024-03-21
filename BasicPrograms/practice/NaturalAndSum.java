import java.util.Scanner;
class EvenAndSum
 {
  public static void main(String args[])
  {
    int n,i=1,sum=0;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter how many natural numbers and their sum yo required = ");
    n=s.nextInt();
    while(i<=n)
    {
     if(i%2==0)
     {
     sum=sum+i;
     System.out.println(i);
     }
     i++;
    }
    System.out.println("Sum of "+n+" natural numbers = "+sum);
  }
 }