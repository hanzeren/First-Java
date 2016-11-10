package com.music.cn;

import java.util.Scanner;

public class Player {
	protected int a;
	public static int i=0;
	public Player(){
		i++;
	}
	public void shuru() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		 if (i == 1) {
			System.out.println("钢琴啊");
			Piano p=new Piano();
			p.play();
		}else if(i==2){
			System.out.println("小提琴");
			Violin v=new Violin();
			v.play();
		}
	}
}