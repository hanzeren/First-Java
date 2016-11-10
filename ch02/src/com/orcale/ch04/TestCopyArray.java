package com.orcale.ch04;

import java.util.Arrays;

public class TestCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x,x1;
		x=new int[]{1,2,3,4,5};
		x1=new int[]{5,4,3,2,1};
		/*int[] y=new int[x.length*2];
		System.arraycopy(x, 0, y, 0, x.length);
		System.arraycopy(x1, 0, y, 5, x1.length);*/
		int[] y=Arrays.copyOf(x, x.length*2);
		y=Arrays.copyOf(x1, x1.length*2);
		print(y);
	}
	public static void print(int[] y){
		for(int i=0;i<y.length;i++){
			System.out.print(y[i]+" ");
		}
		System.out.println();
	}

}
