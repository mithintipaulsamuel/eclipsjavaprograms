class Interchange2
 { 
   public static void main(String agrs[])
   {
     int a=9;
     System.out.println("initial value of A : "+a);
     int b=8;
     System.out.println("initial value of B : "+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("New value of A : "+a);
     System.out.println("New value of B : "+b);


   }
 }