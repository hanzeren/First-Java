package com.orcale.zuoye;

import java.util.Scanner;

public class XingQi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		编写程序，键盘输入一个数,利用swith语句输出星期几
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch (n) {
		case 1:
			System.out.println("星期"+n);
			break;
		case 2:
			System.out.println("星期"+n);
			break;
		case 3:
			System.out.println("星期"+n);
			break;
		case 4:
			System.out.println("星期"+n);
			break;
		case 5:
			System.out.println("星期"+n);
			break;
		case 6:
			System.out.println("星期"+n);
			break;
		case 7:
			System.out.println("星期"+n);
			break;
		default:
			System.out.println("你输入错了！！！");
			break;
		}
	}

}
