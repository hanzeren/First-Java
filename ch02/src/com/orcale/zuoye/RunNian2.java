package com.orcale.zuoye;

import java.util.Scanner;

public class RunNian2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 编写程序，对任意输入的一个年份输出其是否是闰年，直到输入0时结束。

		Scanner s = new Scanner(System.in);
		int n = 1;
		while (n != 0) {
			n = s.nextInt();
			if(n==0){
				break;
			}
			if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
				System.out.println(n + "是闰年");
			} else {
				System.out.println(n + "不是闰年");
			}
		}
	}

}
