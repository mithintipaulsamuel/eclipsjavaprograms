import java.util.Scanner;
class GreatestNumber
 {
  public static void main(String args[])
   {
    int n1,n2,n3,n4=0,n5=0,n6=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number : ");
    n1=s.nextInt();
    System.out.println("Enter a number : ");
    n2=s.nextInt();
    System.out.println("Enter a number : ");
    n3=s.nextInt();

    if(n1>n2&&n1>n3)
     {
       System.out.println(n1+" is the greatest number.");
       n6=n1;
        if(n2>n3)
          {
            n5=n2;
            n4=n3;
          }
        else
          {
            n5=n3;
            n4=n2;
          }
     }
    else if(n2>n1&&n2>n3)
     {
       System.out.println(n2+" is the greatest number.");
       n6=n2;
        if(n1>n3)
          {
            n5=n1;
            n4=n3;
          }
        else
          {
            n5=n3;
            n4=n1;
          }
     }
    else if(n3>n1&&n3>n2)
     {
       System.out.println(n3+" is the greatest number.");
       n6=n3;
       if(n1>n2)
       {
         n5=n1;
         n4=n2;
       } 
       else
       {
         n5=n2;
         n4=n1;
       }  
     }
    System.out.println("Ascending Order if the given numbers ==>  "+n4+","+n5+","+n6+".");
  }
}