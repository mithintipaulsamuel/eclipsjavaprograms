class NoOfEvenNumbers
 {
   public static void main(String args[])
   {
     int n=1,temp=0,count=0;
     while(n<=500)
     {
      temp++;
      if(n%2==0)
      {
    
       count++;
      System.out.println(n);
      }
      n++; 
     }
     System.out.println("no of iterations = "+temp);
     System.out.println("no of even numbers = "+count);
   }
 }