package com.shape.cn;
import java.math.*;
public class Circle extends Shape{
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		return Math.pow(getX(), 2)*Math.PI;
	}

	@Override
	public double length() {
		// TODO Auto-generated method stub
		double l=getX()*Math.PI*2;
		System.out.println(l);
		//return super.length();
		return 0;
	}
	public  void w(){
		System.out.println("asd" );
	}
	
}
