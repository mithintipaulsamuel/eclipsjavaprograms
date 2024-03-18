package com.Opps_QA;
import java.util.Scanner;
public class BankApplication
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Insert the card");
			//For languages
			System.out.println("Select your languages \n"
					+ "**************************************\n"
					+ "For English Press--> 1 \n"
					+ "For Telugu Press-->  2 \n"
					+ "For Hindi press-->   3");
			int n1=s.nextInt();
			Language language=new Language(n1);
			language.display();
			
			//Pin
			System.out.println("Enter a pin");
			String pin=s.next();
			Pin pinobj=new Pin(pin);
			String respond=pinobj.pin_verify();
			
			//For Functionality
			System.out.println("Select your Functionality \n"
					+ "**************************************\n"
					+ "For Cash-Withdrawl Press--> 1 \n"
					+ "For Deposit Press-->        2 \n"
					+ "For Pinchange press-->      3\n"
					+ "For Balance Enquiry press-->4");
			int n2=s.nextInt();
			Function function=new Function(n2);
			function.display();
			
			
			//For Receipt
			System.out.println("Option for receipt: /n"
					+ "Receipt required Press-->    1 \n"
					+ "Receipt not required Press-->2 ");
			int n3=s.nextInt();
//			Receipt receipt=new Receipt(n3);
//			receipt.display();
			
		}
	}
interface Aaa
{
	public void display();
}
class  Language implements Aaa
{
	int n1;
	Language(int n1)
	{
		this.n1=n1;
	}
	public void display()
	{
		switch(n1)
		{
		case 1:
		{
			System.out.println("English");
			break;
		}
		case 2:
		{
			System.out.println("Telugu");
			break;
		}
		case 3:
		{
			System.out.println("Hindi");
			break;
		}
		}
	}
}


class Pin
{
	String pin;
	Pin(String pin)
	{
		this.pin=pin;
	}
	public String pin_verify()
	{		
		if(pin.length()==4)
			return "yes";
		else
			return "Wrong pin";		
	}
}

class Function implements Aaa
{
	int n2;
	Function(int n2)
	{
		this.n2=n2;
	}
	public void display()
	{
		switch(n2)
		{
		case 1:
		{
			System.out.println("Withdrawl");
			cashwithdrawl();
			break;
		}
		case 2:
		{
			System.out.println("Deposit");
			break;
		}
		case 3:
		{
			System.out.println("Pinchange");
			break;
		}
		case 4:
		{
			System.out.println("Balance Enquiry");
			break;
		}
		}
		
	}
	public double cashwithdrawl()
	{
		double Balance=50000.00,NewBalance=0.0;
		System.out.println("Enter Amount: ");
		Scanner s=new Scanner(System.in);
		double withdrawlamount=s.nextDouble();
	    if(withdrawlamount<=Balance)
	    {
	    	NewBalance=Balance-withdrawlamount;
	    	
	    }
	    else
	    {
	    	System.out.println("Insufficient Balance and re-enter the amount:");
	    }
	    
		return NewBalance;	
	}
//}
//class Receipt  extends Function implements Aaa
{
	int n3;
//	Receipt(int n3)
//	{
//		this.n3=n3;
	}
//	public void display()
	{
//		switch(n3)
		{
//		case 1:
			System.out.println("balance-amount = ");
			System.out.println("Thank U Visit Again");
//		break;
//		case 2:
			System.out.println("Thank U Visit Again");
//			break;
		}
	}
}



