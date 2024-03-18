class ExNestedIfElse
	{
	   public static void main(String args[])
	    {
		if(true)//outer if
		{
 		  if(true)//inner if
		   {
 			System.out.println("IF-IF");
		   }
		  else
		   {
			System.out.println("IF-Else");
		   }
		}
		else
		{
		  if(true)
		   {
			System.out.println("Else-If");
		   }
		  else
		   {
 			System.out.println("Else-Else");
		   }
		}

	    }
	}