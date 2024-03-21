//Program to find the factors of a given numbers. 
class Factors
 {
   public static void main(String args[])
   {
     int n=10,i=1,count=0,factorscount;
     System.out.println("Factors of "+n+" = ");
     while(i<=n)
     {
       if(n%i==0)
       {
       
        count++;
        System.out.println(i);
       }
       i++;
     }
     System.out.println("count of factors of 10 are :"+count);
     if(count>=3)
     {
       System.out.println(n+"  is super number. ");
     }
     

   }
 }