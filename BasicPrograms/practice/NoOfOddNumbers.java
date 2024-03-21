class NoOfOddNumbers
 {
   public static void main(String args[])
   {
     int n=1024,count=0,temp=0;
     while(n>=33)
     {
      
      if(n%2!=0)
      {
    
       count++;
       temp=temp+n;
      System.out.println(n);
      }
      n--; 
     }
     System.out.println("no of odd numbers = "+count);
     System.out.println("sum of  odd numbers = "+temp);
   }
 }