import java.util.Scanner;
class VaniMam
{
 public static void main(String args[])
  {
    /*int num=10;
    while(num>=1) 
    { 
      num--;
    }
System.out.println(num);*/
    /*int num=1;
    while(num<=100)
    {
     if(num%2==0)
     System.out.println(num);
     ++num;
    }*/
/*
int num,i=20;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number to get its table : ");
num=s.nextInt();
while(i>=0)
 {
   System.out.println(num+" * "+i+" = "+(num*i));
   i--;
 }*/
int n,count=1,i=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter a natural number to get its factorial : ");
n=s.nextInt();
while(i<=n)
{
count=count*i;
i++;
}
System.out.println(count);
  }
}