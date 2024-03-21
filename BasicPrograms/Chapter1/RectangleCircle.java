import java.util.Scanner;
class RectangleCircle
 {
  public static void main(String args[])
  {
    double lengthofrectangle,breadthofrectangle,radius,pie=22.0/7,areaofrectangle,areaofcircle,perimeterofrectangle,circumferenceofcircle;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the length of a rectangle = ");
    lengthofrectangle=s.nextDouble();
    System.out.print("Enter the breadth of a rectangle = ");
    breadthofrectangle=s.nextDouble();
    System.out.print("Enter the radius of circle = ");
    radius=s.nextDouble(); 

    areaofrectangle=lengthofrectangle*breadthofrectangle;
    System.out.println("AREA OF RECTANGLE = "+areaofrectangle);

    areaofcircle=pie*radius*radius;
    System.out.println("AREA OF CIRCLE = "+areaofcircle);

    perimeterofrectangle=2*(lengthofrectangle+breadthofrectangle);
    System.out.println("PERIMETER OF RECTANGLE = "+perimeterofrectangle);

    circumferenceofcircle=2*pie*radius;
    System.out.println("CIRCUMFERENCE OF CIRCLE = "+circumferenceofcircle);
  }
 }