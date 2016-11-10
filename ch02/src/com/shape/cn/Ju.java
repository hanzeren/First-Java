package com.shape.cn;

public class Ju extends Shape{
	
	double x=getX();
	double y;

	public Ju() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ju(double y) {
		this.y = y;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		double s=x*y;
		//System.out.println(s);
		return s;
		//return 0;
	}


	@Override
	public double length() {
		// TODO Auto-generated method stub
		double l=(x+y)*2;
		System.out.println(l);
		//return super.length();
		return 0;
	}

	
	
	
	
	
}
