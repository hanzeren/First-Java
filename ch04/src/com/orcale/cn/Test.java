package com.orcale.cn;

public class Test {
	public static void main(String [] args){
		
		/*MainBoard mb=new MainBoard();
		//PC pc=new MainBoard();
		mb.setMname("Ausa");
		mb.mainBoard();*/
		MainBoard mb=new Ausa();
		mb.setMname("Ausa");
		VideoCard vc=new ViXing();
		vc.setVCard("ViXing");
		PC pc=new PC(mb,vc);
		pc.show();
		
	}
}
