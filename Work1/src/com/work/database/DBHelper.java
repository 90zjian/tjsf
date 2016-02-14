package com.work.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
	public static final String url = "jdbc:mysql://localhost";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "zjian";
	public static final String password = "zjian";

	private static Connection conn = null;

	static {
		try {
			Class.forName(name);//指定连接类型
			if (conn == null) {
				conn = DriverManager.getConnection(url, user, password);//获取连接  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Statement getStatement() {
		Statement statement = null;
		try {
			statement = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}

	public static void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> getTables(String string) {
		List<String> list= new ArrayList<String>();
		ResultSet rs = null;
		Statement st = null;
		try {
			st = conn.createStatement();
			st.execute("use "+string+";");
			rs = st.executeQuery("show tables;");
			while(rs.next()){
				list.add(rs.getString(1).toLowerCase());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
}