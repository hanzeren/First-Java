package com.shape.cn;

public class Cone {
	private Shape s;
	private double y;
	public Cone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cone(double y) {
		this.y = y;
	}

	public Cone(Shape s,double y) {
		this.s = s;
		this.y = y;
	}
	public Shape getS() {
		return s;
	}
	public void setS(Shape s) {
		this.s = s;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double tiji(){
		return 1.0/3*this.y*this.s.area();
	}
}
