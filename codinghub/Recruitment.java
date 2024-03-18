
/*1)age 25-40
sex male
per>60
course javafullstack
2)20-35
sex female
*/


class Recruitment
 {
   public static void main(String args[])
   {
     int age=32;
     String gender="Female";
     double percentage=68;
     String course="JavafullStack";
     if(((age>=25&&age<=40)&&gender=="Male"&&percentage>=60&&course=="JavafullStack")||(age>=20&&age<=35&&gender=="Female"&&percentage>=60&&course=="JavafullStack"))
      {
        System.out.println("Congratulations you are selected.");
      }
     else
      {
        System.out.println("Sorry betterluck next time.");
      }
   }
 }