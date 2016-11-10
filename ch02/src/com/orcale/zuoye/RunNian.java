package com.orcale.zuoye;

import java.util.Scanner;

public class RunNian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*要求从控制台输入一个年份，判断它是不是闰年
	    以下情况满足其一即为闰年
	    1）能被4整除，但是不能被100整除
	    2）能被400整除*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if((n%4==0&&n%100!=0)||n%400==0){
			System.out.println(n+"是闰年");
		}else{
			System.out.println(n+"不是闰年");
		}
	}

}
