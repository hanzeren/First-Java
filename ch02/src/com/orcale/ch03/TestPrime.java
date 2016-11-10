package com.orcale.ch03;

import java.util.Scanner;

public class TestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int q = 1;
		while (q != 0) {
			int n = s.nextInt();
			int flag = 1;
			if (n == 1) {
				System.out.println("no");
			} else {
				for (int i = 2; i < n; i++)

				{
					if (n % i == 0) {
						flag = 2;
						break;
					}
				}
				if (flag == 2) {
					System.out.println("no");
				} else {
					System.out.println("yes");
				}
			}
			System.out.println("是否继续？");
			System.out.println("1");
			System.out.println("2");
			int w = s.nextInt();
			if (w == 1) {
				q = 1;
			} else {
				q = 0;
			}
		}
	}

}
