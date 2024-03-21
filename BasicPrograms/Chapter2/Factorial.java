class Factorialbackward
 { 
   public static void main(String args[])
   {
    int n=5,count=1;
    for(int i=n;i>=1;i--)
    {
     count=count*i;
    }
    System.out.println("Factorial of "+n+" is "+count);
   }
 }