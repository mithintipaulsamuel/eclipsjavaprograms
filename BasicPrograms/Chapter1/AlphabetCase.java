import java.util.Scanner;
class  AlphabetCase
 {
   public static void main(String args[])
   {
    char ch;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a character : "); 
    ch=s.next().charAt(0);
    if(ch>='A'&&ch<='Z')
    {
     System.out.println(ch+" is an Upper Case Letter.");
    }
    else if(ch>='a'&&ch<='z')
    {
     System.out.println(ch+" is an Lower Case Letter.");
    }
    else if(ch>='0'&&ch<='9')
    {
     System.out.println(ch+" is a Digit.");
    }
    else 
    {
     System.out.println(ch+" is a Special Symbol");
    }
   }
 }