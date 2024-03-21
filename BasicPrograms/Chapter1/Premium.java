/*a program to output whether the person should be insured or not, his/her premium rate and maximum amount for which he/she can be insured*/
import java.util.Scanner;
class Premium
 { 
   public static void main(String args[])
   { 
    String health;//="excelent";
    int age;//=26;//25-35
    String location;//="city";
    String gender;//="male";
    double premium=0;
    double policyamount;//=40000;//policyamount<=200000
    Scanner s=new Scanner(System.in);
    System.out.print("Enter you health condition either excelent or poor : ");
    health=s.next();
    System.out.print("Enter your age : ");
    age=s.nextInt();
    System.out.print("Enter your location either city or village : ");
    location=s.next();
    System.out.print("Enter your gender either male or female : ");
    gender=s.next();
    System.out.print("Enter your policy amount = ");
    policyamount=s.nextDouble();
    if((health.equals("excelent"))&&(age>25&&age<35)&&(location.equals("city"))&&(gender.equals("male"))&&(policyamount<=200000))
    {
      System.out.println("You can INSURE");
      System.out.println("Maximum amount you can insure is 200000 ");
      System.out.println("Rate of your premium is 4 rupees for thousand. ");
      premium=(4.0/1000)*policyamount;  
     System.out.println("PREMIUM AMOUNT FOR YOUR POLICY AMOUNT = "+premium);    
    }
    else if((health.equals("excelent"))&&(age>25&&age<35)&&(location.equals("city"))&&(gender.equals("female"))&&(policyamount<=100000))
    {
      System.out.println("You can INSURE");
      System.out.println("Maximum amount you can insure is 100000 ");
      System.out.println("Rate of your premium is 3 rupees for thousand. ");      
      premium=(3.0/1000)*policyamount;
     System.out.println("PREMIUM AMOUNT FOR YOUR POLICY AMOUNT = "+premium);
    }
    else if((health.equals("poor"))&&(age>25&&age<35)&&(location.equals("village"))&&(gender.equals("male"))&&(policyamount<=10000))
    {
      System.out.println("You can INSURE");
      System.out.println("Maximum amount you can insure is 10000 ");
      System.out.println("Rate of your premium is 6 rupees for thousand. ");
      premium=(6.0/1000)*policyamount;
     System.out.println("PREMIUM AMOUNT FOR YOUR POLICY AMOUNT = "+premium);
    }
    else
    {
     System.out.println("SORRY YOU CAN NOT INSURE THE PREMIUM ");
    }

   }
 }