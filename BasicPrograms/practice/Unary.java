class Unary
{
public static void main(String args[])
{

int a=10,b=20,c;
a=b++;
System.out.println("value of a = "+a);
System.out.println("value of b = "+b);
System.out.println("a=b++ ==> "+a);//a=20,b=21
b=++a;//b=21,a=21
System.out.println("b=++a ==> "+b);//21
c=a+b;
System.out.println("a+b = "+c);//42
c=a++ + b++;//a=21,b=21,c=42;
System.out.println("c=a++ + b++ ==> "+c);//c=42
System.out.println("a+b+c = "+(a+b+c));//22+22+42=86

 
 /* int a = 10;
  System.out.println(a + ++a - a++ - --a + a-- - a++);*/
}
}