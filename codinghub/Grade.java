class Grade
	{
		public static void main(String args[])
			{
				String name="Mahesh";
				int m1=89,m2=87,m3=90,m4=95,m5=78,m6=99;
				int total=m1+m2+m3+m4+m5+m6;
				double maxmarks=600.0;
				double percentage=(total/maxmarks)*100;
					
					if(percentage>=0&&percentage<35)
					 {
					   System.out.println(name+" is FAIL.");
					 }
					if(percentage>=35&&percentage<50)
					 {
					   System.out.println(name+" is THIRD CLASS.");
					 }
					if(percentage>=50&&percentage<70)
					 {
					   System.out.println(name+" is SECOND CLASS.");
					 }
					if(percentage>=70&&percentage<85)
					 {
					   System.out.println(name+" is FIRST CLASS.");
					 }
					if(percentage>=85)
					 {
					   System.out.println(name+" is DISTINCTION.");
					 }
			}
	}

