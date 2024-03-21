class AreaPerimeter
 {
   public static void main(String args[])
   { 
     double l=4,b=5,area=l*b,perimeter=2*(l+b);//area=5,p=12
     if(area>perimeter)
     { 
      System.out.println("Area of a rectangle is greater than its perimeter"); 
     }
     else if(area==perimeter)
     {
      System.out.println("Area of a rectangle is equal to its  perimeter");
     }
     else
     {
      System.out.println("Perimeter of a rectangle is greater than its area");
     }
   }
 }