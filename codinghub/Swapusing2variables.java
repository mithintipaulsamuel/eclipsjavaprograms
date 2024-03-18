class Swapusing2variables
{
public static void main(String args[])
{
int b1=10,b2=20;
System.out.println("Before Swap");
System.out.println(b1);
System.out.println(b2);
b1=b1+b2;
b2=b1-b2;
b1=b1-b2;
System.out.println("After Swap");
System.out.println(b1);
System.out.println(b2);

}
}