class StudentApplication
{
public static void main(String args[])
{
String name="Samuel";
int roll=101;
int m1=90,m2=75,m3=85,m4=70,m5=95,m6=85;
double fee=50000;
System.out.println("Initial Fee = "+fee);
int total=m1+m2+m3+m4+m5+m6;

int max=600;
double percentage=(total/600.0)*100;
System.out.println("Obtained percentage = "+percentage);
if(percentage>80)
{
double x=(25.0/100)*fee;
System.out.println("Amount of scholorship obtained = "+x);
double finalfee1=fee-x;
System.out.println("Final fee = "+finalfee1);
}
else
{
double y=(10.0/100)*fee;
System.out.println("Amount of scholorship obtained = "+y);
double finalfee2=fee-y;
System.out.println("Final fee = "+finalfee2);
}
}
}