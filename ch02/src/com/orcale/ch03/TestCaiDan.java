package com.orcale.ch03;

import java.util.Scanner;

public class TestCaiDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean p = true;
		do {
			System.out.println("1.");
			System.out.println("2.");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("请输入代号：");

			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("1.");
				p = true;
				break;
			case 2:
				System.out.println("2.");
				p = true;
				break;
			case 3:
				System.out.println("3.");
				p = true;
				break;
			case 4:
				System.out.println("退出");
				p = false;
				break;
			default:
				p = true;
				System.out.println("输入错误！！！");
				break;
			}
		} while (p);
	}

}
