package com.orcale.ch04;

public class ErWeiShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] a=new int[3][];
		/*a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];*/
	    int	a[][]={{1,2,3,0},{11,12,13,14,0},{21,22,0}};
	    //int n[][]={{},{},{}};
	    
		for(int i=0;i<a.length;i++)
		{
			int m=0;
			int j;
			for(j=0;j<a[i].length-1;j++){
//				System.out.print(a[i][j]+" ");
				m+=a[i][j];
			}
			//m=;
//			System.out.println(m);
//			System.out.println();
			a[i][j]=m/j;
			//System.out.println(a[i][j]);
		}
		int q=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++){
				//System.out.print(a[i][j]+" ");
				if(a[i][j]<q){
					int temp=q;
					q=a[i][j];
					a[i][j]=temp;
				}
			}
			System.out.println();
		}
		System.out.println(q);
	}

}
