package com.orcale.zuoye02;

import java.util.Scanner;

public class WanShu {
//完数，，，1 2 3 相加等于6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println();
		int a=s.nextInt();
		wanshu(a);
	}
	public static void wanshu(int a){
		
		for(int j=1;j<=a;j++){
			int sum=0;
			for(int i=1;i<j;i++){
				if(j%i==0){
					sum+=i;
				}
			}
			if(sum==j){
				System.out.print(sum+" ");
			}
		}
		
	}
}
