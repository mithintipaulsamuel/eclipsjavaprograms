class Geomentry
{
	public static void main(String args[])
	{
		int length=12;
		int breadth=8;
		double radius=2.5;
		double pie=22/7.0;
		int perimeterofarectangle=2*(length+breadth); 
		System.out.println("Perimeter of a rectangle = "+perimeterofarectangle);
		int areaofarectangle=length*breadth;
		System.out.println("Area of a rectangle = "+areaofarectangle);
		double circumferenceofacircle=2*pie*radius;
		System.out.println("Circumference of a circle = "+circumferenceofacircle);
		double pi=Math.PI;
		double areaofacircle=pi*Math.pow(radius,2);
		System.out.println("Area of a circle = "+areaofacircle);
	}
}