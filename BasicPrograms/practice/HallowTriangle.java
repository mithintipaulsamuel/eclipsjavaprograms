/*
*
**
* *
****
*/

import java.util.Scanner;
class HallowTriangle
 {
    public static void main(String args[])
     {
       int rows;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter required number of rows :  ");
       rows=s.nextInt();
       for(int i=1;i<=rows;i++)
	{
	   for(int j=1;j<=i;j++)
	    {
		if(j==1||(i==rows&&j==1)||(i==rows&&j==rows)||(i==j))
		 {
		    System.out.print("* ");
		 }
		else 
		 {
		    System.out.print("  ");
		 }
	    }
              System.out.println();
	}



       for(int i=rows-1;i>=1;i--)
	{
	   for(int j=1;j<=i;j++)
	    {
		if(j==1||(i==rows&&j==1)||(i==rows&&j==rows)||(i==j))
		 {
		    System.out.print("* ");
		 }
		else 
		 {
		    System.out.print("  ");
		 }
	    }
              System.out.println();
	}

     }
 }

