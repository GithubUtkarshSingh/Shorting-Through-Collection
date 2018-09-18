package com.nt.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComprator implements Comparator<Integer>
{
	public int compare(Integer I1,Integer I2)
	{
		if(I1<I2)
		{
			return -1;
		}
		else if(I1>I2)
		{
			return 1;
		}
		else
		{
		return 0;
	}
}
}
public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(90);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(23);
		l.add(62);
		l.add(45);
		l.add(35);
		System.out.println(l);
		Collections.sort(l,new MyComprator());
		System.out.println(l);
	}
}