package com.orcale.zuoye;

import java.util.Scanner;

/*
 * 
 * hrz
 */
public class XingQi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 编写程序，接受用户输入1～7之间的整数，若不符合条件则重新输入，符合条件后输出是星期几。
		Scanner s = new Scanner(System.in);
		int n = 8;
		while (n > 7) {
			n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("星期" + n);
				break;
			case 2:
				System.out.println("星期" + n);
				break;
			case 3:
				System.out.println("星期" + n);
				break;
			case 4:
				System.out.println("星期" + n);
				break;
			case 5:
				System.out.println("星期" + n);
				break;
			case 6:
				System.out.println("星期" + n);
				break;
			case 7:
				System.out.println("星期" + n);
				break;
			default:
				// System.out.println("你输入错了！！！");
				System.out.println("请重新输入");
			}
		}
	}

}
