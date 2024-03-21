class Grosssalary
 { 
   public static void main(String args[])
   {
     double basicsalary=50000;
     System.out.println("Basic salary = "+basicsalary);
     double DA=(40.0/100)*basicsalary;
     System.out.println("Dearness allowance = "+DA);
     double HR=(20.0/100)*basicsalary;
     System.out.println("House rent allowance = "+HR);
     double grosssalary=basicsalary+DA+HR;
     System.out.println("Gross salary = "+grosssalary);  
   }
 }