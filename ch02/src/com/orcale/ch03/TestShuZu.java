package com.orcale.ch03;

import java.util.Scanner;

public class TestShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a;
		double b=0;
		System.out.println("");
		Scanner s=new Scanner(System.in);
		a=new double[5];
		for(int i=0;i<5;i++){
			a[i]=s.nextDouble();
		}
		//java.util.Arrays.sort(a);
		/*for(int i=0;i<5;i++)
		{
			b+=a[i];
			//System.out.println(a[i]);
		}
		System.out.println(b/5);*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1]){
					/*double temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;*/
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		paint(a);
	}
	public static void paint(double[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}



/*
if(num[j] > num[j + 1])
{
    int temp = num[j];
    num[j] = num[j + 1];
    num[j + 1] = temp;
}
*/