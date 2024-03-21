import java.util.Scanner;
class Fine
 {
   public static void main(String args[])
   {
    int late;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number of days you where late to submit the book = ");
    late=s.nextInt();
    if(late<=5)
    System.out.println("LATE FEE = 0.50 rupees.");
    else if(late>5&&late<=10)
    System.out.println("LATE FEE = 1.00 rupees.");
    else if(late>10&&late<=30)
    System.out.println("LATE FEE = 5.00 rupees.");
    else if(late>30)
    System.out.println("YOU MEMBERSHIP WAS CANCLLED.");
   }
 }