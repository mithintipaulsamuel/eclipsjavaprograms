import java.util.Scanner;
class Wage
 { 
   public static void main(String args[])
   {
     int h;
     double wage;
     System.out.print("Number of hours worked = ");
     Scanner s=new Scanner(System.in);
     h=s.nextInt();
     if(h<=8)
     {
      wage=50.00;
      System.out.println("Wage = "+wage);
     }
     else if(h>8&&h<=12)
     {
       if(h==9)
        {
          wage=50+10;
      System.out.println("Wage = "+wage);        
        }
       else if(h==10)
        {
          wage=50+20;
      System.out.println("Wage = "+wage);          
        }
       else if(h==11)
        {
          wage=50+30;
      System.out.println("Wage = "+wage);          
        }
       else if(h==12)
        {
          wage=50+40;
      System.out.println("Wage = "+wage);          
        }
     }
     else if(h>12&&h<=16)
     {
       if(h==13)
        {
          wage=50+60;
      System.out.println("Wage = "+wage);          
        }
       else if(h==14)
        {
          wage=50+80;
      System.out.println("Wage = "+wage);          
        }
       else if(h==15)
        {
          wage=50+100;
      System.out.println("Wage = "+wage);          
        }
       else if(h==16)
        {
          wage=50+120;
      System.out.println("Wage = "+wage);          
        }
     }
     else if(h>16&&h<=20)
     {
       if(h==17)
        {
          wage=50+145;
      System.out.println("Wage = "+wage);          
        }
       else if(h==18)
        {
          wage=50+165;
      System.out.println("Wage = "+wage);          
        }
       else if(h==19)
        {
          wage=50+190;
      System.out.println("Wage = "+wage);          
        }
       else if(h==20)
        {
          wage=50+215;
      System.out.println("Wage = "+wage);          
        }
     }
     else if(h>20&&h<=24)
     {
       if(h==21)
        {
          wage=50+255;
      System.out.println("Wage = "+wage);          
        }
       else if(h==22)
        {
          wage=50+295;
      System.out.println("Wage = "+wage);          
        }
       else if(h==23)
        {
          wage=50+340;
      System.out.println("Wage = "+wage);          
        }
       else if(h==24)
        {
          wage=50+380;
      System.out.println("Wage = "+wage);          
        }
     }      
   }
 }