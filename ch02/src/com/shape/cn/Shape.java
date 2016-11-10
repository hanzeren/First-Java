package com.shape.cn;

public class Shape {
	private double x;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(double x) {
		super();
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double area() {
		
		return 0;
	}

	public double length() {

		return 0;
	}
	public void qe(){
		if(this instanceof Circle){
			System.out.println("circle");
		}
		if(this instanceof Ju){
			System.out.println("Ju");
		}
	}
}
