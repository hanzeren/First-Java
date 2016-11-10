package com.animal.cn;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit r=new Rabbit();
		r.eat();
		r.sleep();
		Tiger t=new Tiger();
		Animal a=new Animal();
		a=t;
		a.eat();
		a.sleep();
	}

}
