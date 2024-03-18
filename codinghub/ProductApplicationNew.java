class ProductApplicationNew
	{
		public static void main(String args[])
		 {
			String name="Colgate";
			String code="Paste";
			double price=135.5;
			int quantity=20;
			double total=price *quantity;//2710
			System.out.println("Total = "+total);
			double discount = 0;
			double tax = 0;
		 	 
			  if(total>=1000&&total<1500)
			   {
				discount=(5.0/100)*total;
				System.out.println("Discount = "+discount);
				total=total-discount;
				System.out.println("Total after discount =  "+total);
				tax=(1.5/100)*total;
				System.out.println("Tax = "+tax);
				total=total+tax;
				System.out.println("Final Amount =  "+total);
			   }
			  else if(total>=1500&&total<2000)
			   {
				discount=(7.0/100)*total;
				System.out.println("Discount = "+discount);
				total=total-discount;
				System.out.println("Total after discount =  "+total);
				tax=(2.0/100)*total;
				System.out.println("Tax = "+tax);
				total=total+tax;
				System.out.println("Final Amount =  "+total);
			   }
			  else if(total>=2000&&total<2500)
			   {
				discount=(10.0/100)*total;
				System.out.println("Discount = "+discount);
				total=total-discount;
				System.out.println("Total after discount =  "+total);
				tax=(3.0/100)*total;
				System.out.println("Tax = "+tax);
				total=total+tax;
				System.out.println("Final Amount =  "+total);	
			   }
			  else if(total>=2500)
			   {
				discount=(15.0/100)*total;//406.5
				System.out.println("Discount = "+discount);
				total=total-discount;//2303.5
				System.out.println("Total after discount =  "+total);
				tax=(5.0/100)*total;//115...
				System.out.println("Tax = "+tax);
				total=total+tax;//2418....
				System.out.println("Final Amount =  "+total);	
			   }
			 
		 }
	}