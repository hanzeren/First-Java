package com.orcale.zuoye02;

import java.util.Scanner;

public class MuNiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//母牛    1 四年生一个   输入的是年
		System.out.println();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		sheng(a);
	}
	public static void sheng(int a){
		int sum=1,m=a/4;
		for(int i=1;i<=m;i++){
			sum=sum*2;
		}
		System.out.println(sum);
	}

}
