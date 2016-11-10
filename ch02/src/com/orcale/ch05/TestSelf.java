package com.orcale.ch05;

import java.util.Scanner;

public class TestSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println();
		int a = s.nextInt();
		System.out.println(jiecheng(a));
	}

	public static int jiecheng(int a) {
		int i = 1;
		if (a == 1) {
			return 1;
		} else {
			return jiecheng(a - 1) * a;
		}
		// return i;
	}

}
