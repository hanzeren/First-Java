package com.orcale.cn;

public class ViXing extends VideoCard {

	public ViXing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViXing(String vCard) {
		super(vCard);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void videoCard() {
		// TODO Auto-generated method stub
		super.videoCard();
		System.out.println(super.getVCard());
	}

}
