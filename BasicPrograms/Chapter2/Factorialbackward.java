class Factorialbackward
 { 
   public static void main(String args[])
   {
    int n=6,count=1;
    for(int i=n;i>=1;i--)
    {
     count=count*i;
    }
    System.out.println("Factorial of "+n+" is "+count);
   }
 }