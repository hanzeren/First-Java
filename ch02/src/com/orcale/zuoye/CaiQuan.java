package com.orcale.zuoye;

import java.util.Random;
import java.util.Scanner;

public class CaiQuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 利用循环及随机数设计一个用户与电脑猜拳的游戏，用户选择1，2，3分别代表石头、剪刀、布，电脑通过随机数生成器产生由1-3的随机数，
		 * 用户可以连续参加游戏。当用户选择不继续参加游戏时，退出游戏。参考效果如下图。 提示：提示可以通过如下的方法产生随机数作为电脑的出拳
		 * Random rand=new Random(); int number=rand.nextInt(3);
		 * //number即为生成的随机数 注意：需要在程序的第一行添加语句 “import java.util.Random;”
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("欢迎您参加石头，剪刀，布游戏");
		//int 
		boolean p=true;
		String q="y";
		while (p) {
			System.out.println("请选择（1,2,3）");
			System.out.println("1.石头");
			System.out.println("2.剪刀");
			System.out.println("3.布");
			System.out.print("选择：");
			int n = s.nextInt();
			Random rand = new Random();
			int a = rand.nextInt(3) + 1;
			if (n == 1) {
				switch (a) {
				case 1:
					System.out.println("电脑出拳为：石头");
					System.out.println("您出拳为：石头");
					System.out.println("平手！！！");
					break;
				case 2:
					System.out.println("电脑出拳为：剪刀");
					System.out.println("您出拳为：石头");
					System.out.println("您赢啦！！！");
					break;
				case 3:
					System.out.println("电脑出拳为：布");
					System.out.println("您出拳为：石头");
					System.out.println("您输啦！！！");
					break;
				}
			}
			if (n == 2) {
				switch (a) {
				case 1:
					System.out.println("电脑出拳为：石头");
					System.out.println("您出拳为：剪刀");
					System.out.println("您输啦！！！");
					break;
				case 2:
					System.out.println("电脑出拳为：剪刀");
					System.out.println("您出拳为：剪刀");
					System.out.println("平手！！！");
					break;
				case 3:
					System.out.println("电脑出拳为：布");
					System.out.println("您出拳为：剪刀");
					System.out.println("您赢啦！！！");
					break;
				}
			}
			if (n == 3) {
				switch (a) {
				case 1:
					System.out.println("电脑出拳为：石头");
					System.out.println("您出拳为：布");
					System.out.println("您赢啦！！！");
					break;
				case 2:
					System.out.println("电脑出拳为：剪刀");
					System.out.println("您出拳为：布");
					System.out.println("您输啦！！！");
					break;
				case 3:
					System.out.println("电脑出拳为：布");
					System.out.println("您出拳为：布");
					System.out.println("平手！！！");
					break;
				}
			}
			System.out.print("还要继续吗？");
			q=s.next();
			if(q.contains("y")){
				p=true;
			}else{
				p=false;
			}
		}
	}

}
