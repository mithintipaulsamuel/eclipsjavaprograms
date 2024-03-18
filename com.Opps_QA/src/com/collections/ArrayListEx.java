package com.collections;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class ArrayListEx 
{
	public static void main(String args[])
	{
		//code to add and print array list elements
		//list accepts the multiple null values
		//list accepts the duplicate values
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(12);
		al.add(13);
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println("Size of an array list  : "+al.size());
		//print array list elements by using for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//print array list elements by using for each loop
		for(Object ob:al)
		{
			System.out.println(ob);

		}
		
		//code to add and print the set elements
	    Set set=new HashSet();
	    set.add(12);
	    set.add(34);
	    System.out.println(set);
	    
		
	}
}
