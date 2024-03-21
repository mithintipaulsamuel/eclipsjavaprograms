class Mk
 {
   public static void main(String args[])
   {
    int n=7,i=20,mul;
   /* while(i>=0)
    {
      if(i%2==0)
      {
        System.out.println(n+"*"+i+"="+(n*i));
      }
      i--;
    }*/
    
   /* while(i>=0)
    {
        mul=n*i; 
       if(mul%9==0||mul%6==0)    
        System.out.println(n+"*"+i+"="+(mul));
        i--;
    }*/
    while(i>=0)
    {
        mul=n*i; 
       if(mul%9==0&&

mul%6==0)    
        System.out.println(n+"*"+i+"="+(mul));
        i--;
    }
   }
 }