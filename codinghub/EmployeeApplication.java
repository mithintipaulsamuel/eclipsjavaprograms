import java.util.Scanner;
class EmployeeApplication
	{
		public static void main(String args[])
		 {
			String Employeename="Samuel",Employee_designation="Developer",Employee_department="Software";
			int Employee_id=1001;
			System.out.println("Name of an employee: "+Employeename);
			System.out.println("Id of an employee: "+Employee_id);
			System.out.println("Designation of an employee: "+Employee_designation);
			System.out.println("Department of an employee: "+Employee_department);
			int workingdays=20,presentdays=15;
			System.out.println("Total working days= "+workingdays);
			System.out.println("Total present days= "+presentdays);
			double Day_wisesalary=1000.0;
			System.out.println("Day wise salary = "+Day_wisesalary);
			double Actual_salary=workingdays*Day_wisesalary;
			System.out.println("Actual salary = "+Actual_salary);
			double Salary_received=presentdays*Day_wisesalary;
			System.out.println("Salary received before hike = "+Salary_received);1`
			int Exp;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter you experience : ");
			Exp=s.nextInt();
			
			if(Exp>10)
			 {
				Double hike=(50.0/100)*Actual_salary;
       				Salary_received=Salary_received+hike;
				
						
			 }
     			else
			 {
			   Double hike=(25.0/100)*Actual_salary;
		           Salary_received=Salary_received+hike;
			 }
			System.out.println("Salary received after hike = "+Salary_received);
			


}
}