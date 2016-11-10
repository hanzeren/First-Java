package com.cn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class delete {

	JFrame frame3 = new JFrame("delete");
	JComboBox cb1 = new JComboBox();
	JComboBox cb2 = new JComboBox();
	JComboBox cb3 = new JComboBox();
	JButton btn1 = new JButton("确认删除");
	JButton btn2 = new JButton("返回上一层");
	ButtonGroup bg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new delete();
	}

	/**
	 * Create the application.
	 */
	public delete() {
		
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		
		cb1.setBounds(34, 51, 99, 27);
		frame3.getContentPane().add(cb1);
		
		cb2.setBounds(165, 51, 99, 27);
		frame3.getContentPane().add(cb2);
		
		cb3.setBounds(297, 51, 99, 27);
		frame3.getContentPane().add(cb3);
		
		
		btn1.setBounds(34, 211, 117, 29);
		frame3.getContentPane().add(btn1);
		
		btn2.setBounds(279, 211, 117, 29);
		frame3.getContentPane().add(btn2);
		frame3.setVisible(true);
		
		/*mysql sql = new mysql();
		String mclass=sql.myclass(mclass);
		cb1.addItem();*/
	}

	/**
	 * Initialize the contents of the frame.
	 */

}
