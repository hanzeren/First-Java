package com.orcale.ch03;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int i=1;
		
		
		while(i<=5){
			System.out.println("请输入一个百分制");
			int sc=s.nextInt()/10;
			switch(sc){
			case 10:
			case 9:
				System.out.println("a");
				break;
			case 8:
			case 7:System.out.println("b");break;
			case 6:
				System.out.println("c");
				break;
			default:
				System.out.println("d");
				break;
				
			}
			i++;
		}
	}

}
