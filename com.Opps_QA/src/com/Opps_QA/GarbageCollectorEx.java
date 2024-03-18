package com.Opps_QA;

public class GarbageCollectorEx 
{
	public static void main(String args[])
	{
		GarbageCollectorEx obj=new GarbageCollectorEx();
		System.out.println(obj.hashCode());//object created
		obj=null;//unreferencing the object
		System.gc();//calling garbage collector to destroy the object
	}
	
}
