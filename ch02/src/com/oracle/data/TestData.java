package com.oracle.data;

import com.oracle.data2.Aa;

public class TestData 
{
	public static void main(String[] args) 
	{
		System.out.println("com.oracle.data");
		
		//
		int age = 0;   
		//
		Aa aa;
		//
		char a,b,c,d;
		a='A';
		b=65;
		c='\u0041';
		d='/';
		com.oracle.data2.TestData td;
		System.out.print(a+" "+b+" "+c+" "+(int)c);
		
		Aa bb;
		
		byte e=(byte)0b10;
		System.out.print(e);
	}
}