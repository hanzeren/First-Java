package com.orcale.cn;

public class SunCard extends VideoCard {

	public SunCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SunCard(String vCard) {
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
