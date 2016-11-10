package com.cn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public  class CheShiClass implements ActionListener {

	/**
	 * Launch the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		new CheShiClass();
	}

	/**
	 * Create the application.
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	public CheShiClass(){	
	/**
	 * Initialize the contents of the frame.
	 */
		super();
		
		JFrame frame1 = new JFrame();
		ButtonGroup bg = new ButtonGroup();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		frame1.setVisible(true);
		//btn1.setVisible(false);
		
		
		JPanel panel = new JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon("images/1.jpg");
                // 图片随窗体大小而变化
                g.drawImage(icon.getImage(), 0, 0,                  
                frame1.getSize().width,
                frame1.getSize().height,
                frame1);
            }
		};
		panel.setOpaque(false); //设置透明。
		frame1.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("退出");
		btn1.setBounds(312, 243, 132, 29);
		frame1.getContentPane().add(btn1);
		
		JLabel lblNewLabel = new JLabel("自动排课系统");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblNewLabel.setBounds(123, 6, 227, 47);
		frame1.getContentPane().add(lblNewLabel);
		
		JButton btn2 = new JButton("添加课程");
		btn2.setBounds(150, 81, 117, 29);
		frame1.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("更改课程");
		btn3.setBounds(150, 122, 117, 29);
		frame1.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("删除课程");
		btn4.setBounds(150, 163, 117, 29);
		frame1.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("显示课程");
		btn5.setBounds(150, 207, 117, 29);
		frame1.getContentPane().add(btn5);
		
		/*exit start*/
		btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
		/*exit end*/
		
		/*add start*/
		class add implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				new tianjia();
				frame1.setVisible(false);
			}
		}
		btn2.addActionListener(new add());
		/*add end*/
		
		/*genggai start*/
		class update implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				new genggai();
				frame1.setVisible(false);
			}
		}
		btn3.addActionListener(new update());
		/*genggai end*/
		
		/*delete start*/
		class shanchu implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				new delete();
				frame1.setVisible(false);
			}
		}
		btn4.addActionListener(new shanchu());
		/*delete end*/
		
		/*chaxun start*/
		class select implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "将进入另一个窗体！");
				new xian();
				frame1.setVisible(false);
			}
		}
		btn5.addActionListener(new select());
		/*chaxun end*/

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

