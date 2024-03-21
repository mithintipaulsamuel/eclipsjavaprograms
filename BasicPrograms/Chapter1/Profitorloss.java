import java.util.Scanner;
class Profitorloss
 {
   public static void main(String args[])
   {
     double cp;
     double sp;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter the COST PRICE = ");
     cp=s.nextDouble();
     System.out.print("Enter the SELLING PRICE = ");
     sp=s.nextDouble();
     double profit=sp-cp;
     
     if(profit>0)
     {
       System.out.println("PROFIT = "+profit);
     }
     else if(profit<0)
     {
       System.out.println("LOOS = "+profit);
     }
     else
     {
       System.out.println("Neither Profit nor Loss");
     }
   }
 }
  