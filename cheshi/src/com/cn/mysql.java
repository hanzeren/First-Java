package com.cn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
	int id=0;
	public void addsql(String myclass,String week,String name,String start,String end) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		
		Connection con = null; //定义一个MYSQL链接对象
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/class", "root", "77777asd//"); //链接本地MYSQL
        Statement stmt; //创建声明
		stmt = con.createStatement();
		stmt.executeUpdate("INSERT INTO mclass (class,week,classname,start,end) VALUES ('"+myclass+"','"+week+"','"+name+"','"+start+"','"+end+"')");
		ResultSet res = stmt.executeQuery("select LAST_INSERT_ID()");
		id=id+1;
	}
	public void myclass() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Connection con = null; //定义一个MYSQL链接对象
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/class", "root", "77777asd//"); //链接本地MYSQL
        Statement stmt; //创建声明
		stmt = con.createStatement();
		String selectSql = "SELECT * FROM mclass";
		ResultSet selectRes = stmt.executeQuery(selectSql);
		int i=1;
		while (selectRes.next()) { //循环输出结果集	
			String mclass = selectRes.getString("class");
			String start = selectRes.getString("week");
			String end = selectRes.getString("classname");
			i++;
        }
	}
}
