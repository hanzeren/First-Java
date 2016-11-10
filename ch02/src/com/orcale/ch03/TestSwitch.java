package com.orcale.ch03;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import sun.misc.Cleaner;

public class TestSwitch {


	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		boolean q=true;
		//while(q){
		Scanner s=new Scanner(System.in);
		String n=s.next();
		String d = null,c=null,e=null;
		double a=0,b=0;
		//System.out.println(n.length());
			if(n.indexOf("+")>=0){
				c=n.substring(0,n.indexOf("+"));
				d=n.substring(n.indexOf("+")+1,n.length());
				e=n.substring(n.length()-1);
				a =  Double.parseDouble(c);
				b =  Double.parseDouble(d);
				clear();
				System.out.print(a+"+"+b+"="+(a+b));
			
			}else if(n.indexOf("-")>=0){
				c=n.substring(0,n.indexOf("-"));
				d=n.substring(n.indexOf("-")+1,n.length());
				a =  Double.parseDouble(c);
				b =  Double.parseDouble(d);
				clear();
				System.out.println(a+"-"+b+"="+(a-b));
			}else if(n.indexOf("*")>=0){
				c=n.substring(0,n.indexOf("*"));
				
				d=n.substring(n.indexOf("*")+1,n.length());
				a =  Double.parseDouble(c);
				b =  Double.parseDouble(d);
				clear();
				System.out.println(a+"*"+b+"="+(a*b));
			}else if(n.indexOf("/")>=0){
				c=n.substring(0,n.indexOf("/"));
				
				d=n.substring(n.indexOf("/")+1,n.length());
				a =  Double.parseDouble(c);
				b =  Double.parseDouble(d);
				clear();
				if(b==0)
				{
					System.out.println("你错了吧！！！");
				}
				else{
					System.out.println(a+"/"+b+"="+(a/b));
				}
			}else{
				System.out.println("你错了吧！！！");
			}
//			System.out.println("是否继续使用？");
//			System.out.println("1.继续");
//			System.out.println("2.退出");
//			Scanner p=new Scanner(System.in);
//			int w=p.nextInt();
//			if(w==1){
//				clear();
//				q=true;
//			}
//			else{
//				clear();
//				System.out.println("谢谢使用！");
//				q=false;
//			}
//		}
	}

	public static void clear() throws AWTException {
		Robot r = new Robot();     
		r.mousePress(InputEvent.BUTTON3_MASK);
        r.mouseRelease(InputEvent.BUTTON3_MASK);       
        r.keyPress(KeyEvent.VK_CONTROL);         
        r.keyPress(KeyEvent.VK_R);       
        r.keyRelease(KeyEvent.VK_R);       
        r.keyRelease(KeyEvent.VK_CONTROL);        
        r.delay(100);   
    }
}

