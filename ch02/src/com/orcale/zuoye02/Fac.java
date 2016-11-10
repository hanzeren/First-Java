package com.orcale.zuoye02;

import java.util.Scanner;

public class Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="0";
		/*for(int i=0;i<15;i++)
		{
			int res=fac(i);
			str=str+","+Long.toString(res);
		}*/
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//for(int i;i<a;i++){
			System.out.println(fac(a));
		//}
		
	}
	public static int fac(int i){
		if(i==0||i==1||i==3||i==2){
			return 1;
		}else{
			return fac(i-1)+fac(i-3);
		}
	}
}
//斐波那契 还有牛那个乱七八糟的