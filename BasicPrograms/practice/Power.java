class Power
 {
   public static void main(String args[])
{
  int n=2,i=1,count=1;
  while(i<=20)
  {
   count=count*n;
   i++;
  }
  System.out.println(count);
    /*int count=0,i=1;
    while(i<=20)
    {
      count=count+i;
      i++;
    }
    System.out.println("The sum of first 20 natural numbers = "+count);*/
  /*int n=1,count=1,iter=0;
  while(n<=6)
   {
     iter++;
     count=count*n;
     n++;
   }
   System.out.println("Factorial of "+(n-1)+" = "+count);
   System.out.println("No.of iterations = "+iter);*/
}
 }