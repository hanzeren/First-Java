package com.orcale.du;

import java.util.Scanner;

public class Mdzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=24;a<=24;a++){
			int sum=0;
			for(int b=1;b<a;b++){
				if(a%b==0){
					sum+=b;
					if(sum==a){
						System.out.println(sum);
					}
				}
			}
		}


	}

}
