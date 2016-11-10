package com.orcale.zuoye;

import java.util.Scanner;

public class MaiChe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*根据存款money ，单位（万元），决定买什么样的车
        	500 W，"太好了，我可以买凯迪拉克");
        	100 "不错，我可以买辆帕萨特"); 
     		50W，"我可以买辆依兰特");
     		10 "至少我可以买个奥托");
     		其它情况"看来，我只能买个捷安特了");*/
		Scanner s=new Scanner(System.in);
		System.out.println("我有存款");
		System.out.println("1.500w");
		System.out.println("2.100w");
		System.out.println("3.50w");
		System.out.println("4.10w");
		System.out.println("5.其他情况");
		int n=s.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("太好了，我可以买凯迪拉克");
			break;
		case 2:
			System.out.println("不错，我可以买辆帕萨特");
			break;
		case 3:
			System.out.println("我可以买辆依兰特");
			break;
		case 4:
			System.out.println("至少我可以买个奥托");
			break;
		default:
			System.out.println("看来，我只能买个捷安特了");
			break;
		}
	}

}
