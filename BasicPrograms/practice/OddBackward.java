class OddBackward
 {
   public static void main(String args[])
   {
     
     int i=1024,j=39;
     System.out.println("Evennumbers in backward : ");
     while(i>=35)
     {
       if(i%2==0)
       {
         System.out.print(i);
       }
       i--;
     }
     System.out.println("Odd numbers in forward : ");
     while(j<=447)
    {
     if(j%2!=0)
     {
       System.out.println(j);
     } 
      j++;
    }
   }
 }