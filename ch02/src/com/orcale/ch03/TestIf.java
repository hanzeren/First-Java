package com.orcale.ch03;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		//引用类型
		double score=Double.parseDouble(args[0]);
		double score1=Double.parseDouble(args[1]);
		// TODO Auto-generated method stub
		//double score=99;
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		score=20;
//		if(n>=60){
//			System.out.println(n+"pass");
//		}
		double c=score/score1;
		
		if(score1>=1){
		
		System.out.println(c);	
		}
		else {
			System.out.println("你傻逼吗？不能为零！！！");
		}
		System.out.println(score);
	}

}
