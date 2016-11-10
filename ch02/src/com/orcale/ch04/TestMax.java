package com.orcale.ch04;

public class TestMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x={3,1,5,2,4};
		int a=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>a)
			{
				a=x[i];
			}
		}
		for(int i=0;i<x.length;i++){
			if(x[i]==a){
				System.out.println(a+" "+i);
				break;
			}
		}
		
	}

}
