package com.orcale.ch04;

public class ErWeiDa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3,0},{11,13,12,0},{21,22,23,0}};
		
		for(int i=0;i<a.length;i++){
			int max=a[i][0];
			int j;
			for(j=0;j<a[i].length-1;j++){
				if(a[i][j]>max){
					max=a[i][j];
				}
			}
			
			a[i][j]=max;
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
