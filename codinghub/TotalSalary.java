class TotalSalary
{
public static void main(String args[])
{
int bs=10000;
double ta=10.0/100*bs;
double da=25.0/100*bs;
double hra=15.0/100*bs;
double oa=30.0/100*bs;
double totalsalary=ta+da+hra+oa;
System.out.println("BASIC SALARY =      "+bs);
System.out.println("TA(10%) =      "+ta);
System.out.println("DA(25%) =      "+da);
System.out.println("HRA(15%) =     "+hra);
System.out.println("OA(30%) =      "+oa);
System.out.println("=====================");
System.out.println("TOTAL SALARY = "+(totalsalary+bs));


}
}