package com.patterns;
import java.util.Scanner;
public class Practice 
{
	public static void main(String args[])
	{
		int rows,columns;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter required no.of rows : ");
		rows=s.nextInt();
//		System.out.println("Enter required no.of columns : ");
//		columns=s.nextInt();
		
		
		//ch17 pattern problem by sreeja mam.
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=rows;j++)
//			{
//				if(j<=i)
//				System.out.print(j+" ");
//				if(j>i)
//					System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		
		
//		Square Hallow
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=columns;j++)
//			{
//				if(i==1||i==rows||j==1||j==columns)
//				System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		
// 		Square Matrix Decrement
//		for(int i=rows;i>=1;i--)
//		{
//			for(int j=columns;j>=1;j--)
//			{
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}

		
		
		//Number Triangular
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=columns-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//NumberIncreasingPyramid 
		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		//NumberIncreasingReversePyramid
//		for(int i=rows;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		//NumberChangingPyramid
//		int n=1;
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print((n++)+" ");
//			}
//			System.out.println();
//		}
		
		
		
		//Zero-One-Zero
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if((i+j)%2==0)
//				{
//					System.out.print("1 ");
//				}
//				else
//				{
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}
//		
		
		
		
		//PalindromeTriangle
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=columns-i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=i;k>=1;k--)
//			{
//				System.out.print(k+" ");
//			}
//			for(int l=2;l<=i;l++)
//			{
//				System.out.print(l+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		//RhombusPattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=columns;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		//SquareFillPattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=columns;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		//RightHalfPyramid
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//ReverseRightHalfPyramid
//		for(int i=rows;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//LeftHalfPyramid
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=columns-1;j>=i;j--)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//ReverseLeftHalfPyramid
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=columns;k>=i;k--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
//		//DaimondPattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=columns-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}
//		for(int i=rows;i>=1;i--)
//		{
//			for(int j=1;j<=columns-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}
		
		
		
		//Star@Triangle
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=columns;j>=i+1;j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.print("@ ");
//			System.out.println();
//		}
		
		
		//Star@AlternativeLine
//		for(int i=rows;i>=1;i--)
//		{
//			if(i%2==0)
//			{
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print("@ ");
//				}
//			}
//			else
//			{
//				for(int k=1;k<=i;k++)
//				{
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		//Star@Alternative
//		for(int i=rows;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if((i+j)%2==0)
//				{
//					System.out.print("@ ");
//				}
//				else
//				{
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
//		//AlphabetTriangle
//		//char ch='A';
//		for(int i=1;i<=rows;i++)
//		{
//			
//			char ch='A';
//			for(int j=1;j<=i;j++)
//			{
//				if(ch>'Z')
//				{
//					ch='A';
//				}
//				else
//				System.out.print((ch++)+" ");
//			}
//			System.out.println();
//		  //ch='A';
//		}
		
		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j>=1;j--)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//Daimond
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=rows;j>i;j--)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			for(int l=i;l>=2;l--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=rows-1;i>=1;i--)
//		{
//			for(int j=rows;j>i;j--)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			for(int l=i;l>=2;l--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		//UpperpartofaDaimondwithspaces
		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(" *  ");
//			}
//			System.out.println();
//		}
		
		
		//LeftHalfButterflyStarPatternwithspaces
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if((i+j)%2==0)
//				{
//					System.out.print("* ");
//				}
//				else
//					System.out.print("  ");
//				
//			}
//			System.out.println();
//		}
//		
//		for(int i=rows-1;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if((i+j)%2==0)
//				{
//					System.out.print("* ");
//				}
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
//	
		
		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=rows-1;i>=1;i--)
//		{
//			for(int j=i;j<rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<=rows;j++)
//			{
//				if(j==1||(j==i))
//				System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		
		//square hallows pattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=rows;j++)
//			{
//				if(i==1||i==rows||j==1||j==rows)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		//NumberTriangular
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=rows-1;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		//NumberIncreasingPyramid
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		//NumberIncreasingReversePyramid
//		for(int i=rows;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		//NumberchangingPyramid
//		int n=1;
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print((n++)+" ");
//			}
//			System.out.println();
//		}
//		
		
		//ZeroOneTriangle
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if((i+j)%2==0)
//					System.out.print("1 ");
//				else
//				{
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}
		
		
		//PalindromeTriangle
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=i;k>1;k--)
//			{
//				System.out.print(k+" ");
//			}
//			for(int l=1;l<=i;l++)
//		{
//				System.out.print(l+" ");
//			}
//			System.out.println();
//		}
		
		
		//Rhombus Pattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=columns;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		//DaimondPattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(" *  ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=rows-1;i>=1;i--)
//		{
//			for(int j=i;j<rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(" *  ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=i;k<=rows;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		//KPattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<=rows;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=rows-1;i>=1;i--)
//		{
//			for(int j=i;j<=rows;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
		//Triangle star pattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<rows;j++)
//			{ 
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		//MirroImageTrianglePattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i;k<=rows;k++)
//			{
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=rows-1;i>=1;i--)
//		{
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i;k<=rows;k++)
//			{
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		
		//HallowTriangle Pattern
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=i;j<=rows;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=rows;k++)
//			{
//				if(k==1||i==rows||(i==k))
//					System.out.print("* ");
//				else
//					System.out.print("  "); 
//			}
//			System.out.println();
//		}
		

		
		
	}
}
