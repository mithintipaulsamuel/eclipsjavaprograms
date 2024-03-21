//Program to find the leap years between 2000-3000
class LeapYearRange
 {
  public static void main(String args[])
  {
   int n=2000,count=0;
   System.out.println("Leap years are : ");
   while(n<=3000)
   {
     if((n%4==0&&n%100!=0)||n%400==0)
      {
       count++;
       System.out.println(n); 
      }
     n++;
   }
    System.out.println("There are "+count+" leapyears between 2000-3000.");
  } 
 }