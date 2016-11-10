package com.orcale.zuoye;

import java.util.Scanner;

public class ABWenTi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2、 要求用户输入两个数a、b，如果a能被b整除或a加b大于1000，则输出a，否则输出b
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a%b==0||a+b>1000){
			System.out.println(a);
		}else{
			System.out.println(b);
		}
	}

}
