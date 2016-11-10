package com.orcale.cn;

public class GiGia extends MainBoard {

	public GiGia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiGia(String mname) {
		super(mname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mainBoard() {
		// TODO Auto-generated method stub
		super.mainBoard();
		System.out.println(super.getMname());
	}
	
}
