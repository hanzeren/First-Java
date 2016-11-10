package com.orcale.zuoye02;

import java.util.Scanner;

public class GeDeBaHe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入偶数");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		gebenhagen(a);
	}

	public static void gebenhagen(int a) {
		int b = 0;
		int m;
		int sum = 0;
		int w=0;
		a:for (int i = 2; i < a/2; i++) {
			int flag = 1;
			b:for (m = 2; m < i; m++) {
				c:if (i % m == 0) {
					flag = 2;
					break;
				}
			}
			
			d:if (flag == 1) {
				int s = a - i, q = 1;
				e:for (m = 2; m < s; m++) {
					f:if (s % m == 0) {
						q = 2;
						break e;
					}
				}
				if(s!=1){
					if (q == 1) {
						//if(s!=sum&&s!=i){
							System.out.println(i + "+" + (a - i) + "=" + a);
				
						//}
					}
				}
				//sum=i;
			}
		}
	}

}
