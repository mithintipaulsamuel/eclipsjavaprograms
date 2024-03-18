package com.TwoDimensionalArray;

public class HallowOfMatrix 
{
	public static void main(String args[])
	{
		int[][] a=new int[][] {{11,21,31,41},{51,61,71,81},{91,10,11,12,},{13,14,15,16}};
		  /*0, 1, 2, 3
		 * 11,21,31,41
		 * 51,61,71,81
		 * 91,10,11,12
		 * 13,14,15,16
		 */
		for(int i=0;i<a.length;i++)//0<3
		{
			for(int j=0;j<a[i].length;j++)//0<3
			{
				if(i==0||i==a.length-1||j==0||j==a[i].length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}
