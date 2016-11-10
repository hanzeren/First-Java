package com.orcale.zuoye;

import java.util.Scanner;

public class NianYueRi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输入年，输入月后，输出该月有多少天？
		// 135781012
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int y = s.nextInt();
		if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			switch (y) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31天");
				break;
			case 2:
				System.out.println("29天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30天");
				break;

			default:
				System.out.println("输入月份有误");
				break;
			}
		} else {
			switch (y) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31天");
				break;
			case 2:
				System.out.println("28天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30天");
				break;

			default:
				System.out.println("输入月份有误");
				break;
			}
		}
	}

}
