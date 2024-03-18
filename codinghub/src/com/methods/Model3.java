package com.methods;

public class Model3 
{
	void m1()
	{
		System.out.println("m1   :"+(13f+14f));
	}
	void m2()

	{
		System.out.println("Hai helooo");
	}
	void m3()
	{
		System.out.println('a');
	}
	public long ln()
	{
		return 4567;
	}
	
	
	public static void main(String args[])
	{
		Ant a=new Ant();
		System.out.println("int   "+a.ad());
		System.out.println("double  "+a.mu());
		System.out.println("float  "+a.flo());
		System.out.println("boolean  "+a.m4());
		Model3 model =new Model3();
		model.m1();
		model.m2();
		model.m3();
		System.out.println("long  "+model.ln());
	}
}

class Ant
{
	boolean y;
	public int ad()
	{
//		System.out.println(" Sum of integers : "+(x+y));
		return 11;
	}
	public double mu()
	{
//		System.out.println(" Mul of doubles : "+(x*y));
		return 24.678;
	}
	public float flo()
	{
		return 23.45f;
	}
	public boolean m4()
	{
		return y;
	}


}
