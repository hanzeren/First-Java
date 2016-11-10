package com.orcale.ch05;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(2,3,'*');
		print(1,8,'-');
		print(3,4,'*');
		swap(2,4);
		int[] x={2,5};
		
			System.out.print(swap(x));
		System.out.println();
		//System.out.println(x[0]+" "+x[1]);
		System.out.println(add(x));
	}

	public static void print(int ii,int jj,char cc){
		for(int i=0;i<ii;i++){
			for(int j=0;j<jj;j++){
				System.out.print(cc);
			}
			System.out.println();
		}
	}
	public static void swap(int a,int b){
		int i=0;
		i=a;
		a=b;
		b=i;
		
		System.out.println(b+" "+a);
	}
	public static int swap(int [] a){
		int i=0;
		i=a[0];
		a[0]=a[1];
		a[1]=i;
		
		//System.out.println(a[0]+" "+a[1]);
		return (a[0]+' '+a[1]);
	}
	public static int add(int [] a){
		int i=a[0]+a[1];
		return i;
	}
}
