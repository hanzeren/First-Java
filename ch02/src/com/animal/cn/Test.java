package com.animal.cn;

public class Test {
	public static void main(String [] args){
		Tiger t=new Tiger();
		Rabbit r=new Rabbit();
		Freeder f=new Freeder(t);
		f.feed();
	}
}
