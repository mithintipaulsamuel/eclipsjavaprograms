import java.util.Scanner;
class Opposite
 {
   public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
    char ch;
    System.out.print("Enter any alphabet = ");
    ch=s.next().charAt(0);
    if(ch>='A'&&ch<='Z')
    {
     ch=(char)(ch+32);
     System.out.println("the opposite case = "+ch);

    }
    else
    {
     ch=(char)(ch-32);
     System.out.println("the opposite case = "+ch);
    }
     

   }
 }