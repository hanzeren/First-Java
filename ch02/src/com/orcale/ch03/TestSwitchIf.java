package com.orcale.ch03;

import java.util.Scanner;

public class TestSwitchIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
		int sc=s.nextInt()/10;
		switch(sc){
		case 10:
		case 9:
			System.out.println("A");
		case 7:
			System.out.println("b");
		case 6:
			System.out.println("c");
		default:
			System.out.println("d");
			
		}

	}

}
