package com.cn;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;



public class tianjia extends JFrame implements ActionListener,ItemListener{

	/*连接sql*/
	
    
	
	JFrame frame2;
	private JTextField textField;
	JTextField txt = new JTextField(45);
	JComboBox cb1 = new JComboBox();
	JComboBox cb2 = new JComboBox();
	JRadioButton rb1 = new JRadioButton("08:30am");
	JRadioButton rb2 = new JRadioButton("10:25am");
	JRadioButton rb3 = new JRadioButton("01:30pm");
	JRadioButton rb4 = new JRadioButton("03:25pm");

	/**
	 * Launch the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {
		new tianjia();
	}

	/**
	 * Create the application.
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	public tianjia(){
		super();
		
		JFrame frame2 = new JFrame();
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		frame2.setVisible(true);
		ButtonGroup bg;
		
		JButton btn1 = new JButton("确认");
		btn1.setBounds(71, 222, 117, 29);
		frame2.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("返回上一层");
		btn2.setBounds(241, 222, 117, 29);
		frame2.getContentPane().add(btn2);
		
		
		txt.setBounds(224, 16, 134, 28);
		frame2.getContentPane().add(txt);
		txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("课程名");
		lblNewLabel.setBounds(107, 22, 61, 16);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("上课时间");
		lblNewLabel_2.setBounds(107, 112, 61, 16);
		frame2.getContentPane().add(lblNewLabel_2);
		
		
		cb1.setBounds(71, 56, 141, 27);
		frame2.getContentPane().add(cb1);
		
		
		cb2.setBounds(224, 56, 134, 27);
		frame2.getContentPane().add(cb2);
		
		
		rb1.setBounds(224, 108, 141, 23);
		frame2.getContentPane().add(rb1);
		
		rb2.setBounds(224, 131, 141, 23);
		frame2.getContentPane().add(rb2);
		
		rb3.setBounds(224, 156, 141, 23);
		frame2.getContentPane().add(rb3);
		
		rb4.setBounds(224, 178, 141, 23);
		frame2.getContentPane().add(rb4);
		
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		
		/*classname start*/
		
		/*classname end*/
		
		/*class start*/
		cb1.addItem("一班");
		cb1.addItem("二班");
		setLayout(new FlowLayout());
		/*class end*/
		
		/*week start*/
		cb2.addItem("星期一");
		cb2.addItem("星期二");
		cb2.addItem("星期三");
		cb2.addItem("星期四");
		cb2.addItem("星期五");
		cb2.addItem("星期六");
		cb2.addItem("星期七");
		/*week end*/
		
		/*shangyiceng start*/
		class main implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				new CheShiClass();
				frame2.setVisible(false);
			}
		}
		btn2.addActionListener(new main());
		/*shangyiceng end*/
		
		btn1.addActionListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		String name = txt.getText();
		
		if(cb1.getSelectedItem()=="一班")
		{
			if(cb2.getSelectedItem()=="星期一")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期一", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期一", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期一", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期一", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期二")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期二", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期二", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期二", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期二", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期三")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期三", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期三", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期三", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期三", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期四")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期四", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期四", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期四", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期四", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期五")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期五", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期五", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期五", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期五", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期六")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期六", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期六", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期六", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期六", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期七")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期七", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期七", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期七", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("一班", "星期七", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		
		
		
	
		else if(cb1.getSelectedItem()=="二班")
		{
			if(cb2.getSelectedItem()=="星期一")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期一", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期一", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期一", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期一", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期二")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期二", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期二", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期二", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期二", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期三")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期三", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期三", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期三", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期三", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期四")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期四", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期四", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期四", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期四", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期五")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期五", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期五", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期五", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期五", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期六")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期六", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期六", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期六", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期六", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(cb2.getSelectedItem()=="星期七")
			{
				if(rb1.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期七", name, "08:30am", "10:05am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb2.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期七", name, "10:25am", "12:00am");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb3.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期七", name, "1:30pm", "3:05pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(rb4.isSelected())
				{
					mysql sql=new mysql();
					try {
						sql.addsql("二班", "星期七", name, "03:25pm", "05:00pm");
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		
	}
	
}