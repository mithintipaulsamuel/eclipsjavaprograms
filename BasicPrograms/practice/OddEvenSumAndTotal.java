//Program to find the no.of even numbers,odd numbers and sum of even numbers,odd numbers.
class OddEvenSumAndTotal  
 {
   public static void main(String args[])
   {
    int n=1024,evencount=0,oddcount=0,evensum=0,oddsum=0;
    while(n>=33)
    if(n%2==0)
    {
     evencount++;
     evensum=evensum+n;
     n--;
    }
    else
    {
     oddcount++;
     oddsum=oddsum+n;
     n--;
    }
    System.out.println("count of even numbers = "+evencount+" and sum of even numbers = "+evensum+".");
    System.out.println("count of odd numbers = "+oddcount+" and sum of odd numbers = "+oddsum+".");
   }
 }