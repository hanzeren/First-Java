package com.animal.cn;

public class Freeder {
	/*private Tiger t;
	private Rabbit r;*/
	private Animal a;
	public Freeder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Freeder(Animal a) {
		this.a = a;
	}
	public Animal getA() {
		return a;
	}
	public void setA(Animal a) {
		this.a = a;
	}
	public void feed(){
		this.a.eat();
	}
}
