import java.util.Scanner;
class ProductApplication
	{
		public static void main(String args[])
			{
				String name="Trousers";
				long num;
				String s1="codinghub";
				String s2;
				int carrybagresponse,creditcardresponse;
				int code=111,quantity=10,carrybag=50;
				double price=1550.50;
           			double totalcost=(price*quantity);
				System.out.println("initial cost= "+totalcost);
				Scanner s=new Scanner(System.in);
				System.out.println("If you need carry bag  press 1 else press 2 : ");
				carrybagresponse=s.nextInt();
				if(carrybagresponse==1)
				{
				    totalcost=totalcost+carrybag;
				   System.out.println("Total cost   = "+totalcost);
                                }
				
				/*System.out.println("If you need carry bag type YES else type NO: ");
				else
				 {
				System.out.println("Total cost   = "+totalcost);
				 }*/
				if(totalcost>10000)
				 {
					double discount1=(17.0/100)*totalcost;
					System.out.println("Discount Amount  = "+discount1);
					totalcost =totalcost-discount1;
					System.out.println("Total after discount = "+totalcost);
				 }
				else
				 {
					double discount2=(3.0/100)*totalcost;
					System.out.println("Discount Amount = "+discount2);
					totalcost=totalcost-discount2;
					System.out.println("Total after discount = "+totalcost);
				 }
				System.out.println("If you have creditcard please press 1 else press 2 : ");
				creditcardresponse=s.nextInt();
				if(creditcardresponse==1)
				 {
					double discount3=(2.5/100.0)*totalcost;
					totalcost=totalcost-discount3;
					System.out.println("Total cost after creditcard discount = "+totalcost);
				 }
//System.out.println("Enter your number:");
//num=s.nextLong();
				System.out.println("Enter the coupon code:");
				s2=s.next();
				if(s1.equals(s2))
				 {
					double discount4=(20.0/100)*totalcost;
  					totalcost=totalcost-discount4;
					System.out.println("Total cost after using coupon code = "+totalcost);
				 }
				double CGST=(9.0/100)*totalcost;
				System.out.println("CGST = "+CGST);
				double SGST=(9.0/100)*totalcost;
				System.out.println("SGST = "+SGST);
				double GST=CGST+SGST;
				System.out.println("GST = "+GST);
				double newtotal=totalcost+CGST+SGST;
				System.out.println("Final amount = "+newtotal);


			}
	}