package com.orcale.cn;

public class PC {
//主板，
	private MainBoard mb;
	private VideoCard vc;
	
	public PC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PC(MainBoard mb, VideoCard vc) {
		this.mb = mb;
		this.vc = vc;
	}

	public MainBoard getMb() {
		return mb;
	}

	public void setMb(MainBoard mb) {
		this.mb = mb;
	}

	public VideoCard getVc() {
		return vc;
	}

	public void setVc(VideoCard vc) {
		this.vc = vc;
	}

	public void show(){
		this.mb.mainBoard();
		this.vc.videoCard();
	}
}  