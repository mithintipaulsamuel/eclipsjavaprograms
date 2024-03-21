import java.util.Scanner;
class GradeOfSteel
 {
  public static void main(String args[])
  {
   int hardness,tensilestrength;
   double carboncontent;
   /*
   int hardness=50;//must be greater than 50
   double carboncontent=0.6;//must be less than 0.7
   int tensilestrength=5700;//must be greater than 5600
   */
   Scanner s=new Scanner(System.in);
   System.out.print("Enter the HARDNESS of the Steel = ");
   hardness=s.nextInt();
   System.out.print("Enter the TENSILE STRENGTH of the Steel = ");
   tensilestrength=s.nextInt();
   System.out.print("Enter the CARBON CONTENT of the Steel = ");
   carboncontent=s.nextDouble();   
   if(hardness>50&&carboncontent<0.7&&tensilestrength>5600)
    {
     System.out.println("Grade=10");
    } 
   else if(hardness>50&&carboncontent<0.7)
    {
     System.out.println("Grade=9");
    } 
   else if(carboncontent<0.7&&tensilestrength>5600)
    {
     System.out.println("Grade=8");
    } 
   else if(hardness>50&&tensilestrength>5600)
    {
     System.out.println("Grade=7");
    } 
   else if(hardness>50||carboncontent<0.7||tensilestrength>5600)
    {
     System.out.println("Grade=6");
    } 
   else
    {
     System.out.println("Grade=5");
    }   
  }
 }