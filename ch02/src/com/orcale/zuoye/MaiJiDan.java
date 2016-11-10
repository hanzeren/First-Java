package com.orcale.zuoye;

import java.util.Scanner;

public class MaiJiDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1、 小布什买了一筐鸡蛋，如果坏蛋少于5个，他就吃掉，否则他就去退货
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=5){
			System.out.println("退货");
		}else{
			System.out.println("吃掉");
		}
	}

}
