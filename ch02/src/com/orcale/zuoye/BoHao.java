package com.orcale.zuoye;

import java.util.Scanner;

public class BoHao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4、张三为他的手机设定了自动拨号
		按1：拨爸爸的号
		按2：拨妈妈的号
		按3：拨爷爷的号
		按4：拨奶奶的号
		 编程实现此业务*/
		Scanner s=new Scanner(System.in);
		
		System.out.println("按1：拨爸爸的号");
		System.out.println("按2：拨妈妈的号");
		System.out.println("按3：拨爷爷的号");
		System.out.println("按4：拨奶奶的号");
		int n=s.nextInt();
		switch (n) {
		case 1:
			System.out.println("拨打爸爸电话中");
			break;
		case 2:
			System.out.println("拨打妈妈电话中");
		case 3:
			System.out.println("拨打爷爷电话中");
		case 4:
			System.out.println("拨打奶奶电话中");
		default:
			System.out.println("瞎按什么？");
			break;
		}
	}

}
