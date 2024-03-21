import java.util.Scanner;
class UniversityQualify
 {
   public static void main(String args[])
   {
    double Aper,Bper;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the Aggregated percentage in subject A= ");
    Aper=s.nextDouble();
    System.out.print("Enter the Aggregated percentage in subject B= ");
    Bper=s.nextDouble();
     
    if(Aper>=55&&Bper>=45)
    System.out.println("PASSED");
    else if(Aper>=45&&Aper<55&&Bper>=55)
    System.out.println("PASSED");
    else if(Bper<45&&Aper>65)
    System.out.println("You are allowed to reappear in B. ");
    else
    {
     System.out.println("FAILED");
    }
   }
 }