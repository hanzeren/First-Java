package com.orcale.zuoye;

import java.util.Scanner;

public class ZhaoBenShan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*输入赵本山的考试成绩，显示所获奖励
		成绩==100分，爸爸给他买辆车
		成绩>=90分，妈妈给他买MP4
		90分>成绩>=60分，妈妈给他买本参考书
		成绩<60分，什么都不买*/
		Scanner s=new Scanner(System.in);
		int i=s.nextInt()/10;
		switch (i) {
		case 10:
			System.out.println("爸爸给你买辆车");
		case 9:
			System.out.println("妈妈给你买mp4");
			break;
		case 8:
		case 7:
		case 6:
			System.out.println("妈妈给你买本参考书");
			break;

		default:
			System.out.println("什么也不买");
			break;
		}
	}

}
