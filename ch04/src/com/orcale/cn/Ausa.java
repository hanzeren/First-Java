package com.orcale.cn;

public class Ausa extends MainBoard {

	public Ausa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ausa(String mname) {
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
