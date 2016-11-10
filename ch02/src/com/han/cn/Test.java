package com.han.cn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s.study());
		Person p=new Person();
		p=s;
		System.out.println(p.study());
	}

}
