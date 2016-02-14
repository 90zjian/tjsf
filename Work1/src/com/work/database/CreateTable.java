package com.work.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateTable {
	private static Map<String,String> db = new HashMap<String,String>();
	
	static {
		initdb();
	}
	
	public static void initdb(){
		String tmp = "";
		db.clear();
		//课件信息表，
		tmp= "create table tjsf.courseWare (" +
			"Id integer primary key not null auto_increment," +
			"courseId integer," + 	//关联课程信息表的主键；
			"chapterNum integer," +
			"sectionNum integer," +
			"cwDesc varchar(100)," +
			"FileName varchar(50)," +
			"downLoadTimes integer" +	//课件被下载次数；
			")";
		db.put("courseware", tmp);
		//课程信息表，
		tmp= "create table tjsf.course (" +
			"Id integer primary key not null auto_increment," +
			"courseName varchar(100)," +
			"courseDesc varchar(50)," +
			"teacherId integer" +	//关联教师信息表主键；
			")";
		db.put("course",tmp);
		//教师信息表，
		tmp= "create table tjsf.teacher (" +
			"Id integer primary key not null auto_increment," +
			"userName varchar(20) not null unique," +
			"passWord char(41)," +	//根据 mysql.user 表中的password 字段设计类型
			"name varchar(100)," +
			"workId varchar(20)," +	//教师编号，相当于学生学号，若没有，可删除或不维护
			"phone varchar(15)," +
			"email varchar(50)," +
			"address varchar(100)," +
			"valid double" +	//表示该用户是否可用，
			")";
		db.put("teacher",tmp);
		//学生信息表，
		tmp= "create table tjsf.student (" +
			"studentId integer primary key not null," +	//学号，学生的唯一标识，不为空，不重复；
			"userName varchar(20) not null unique," +
			"passWord char(41)," +
			"name varchar(100)," +
			"phone varchar(15)," +
			"email varchar(50)," +
			"address varchar(100)," +
			"valid double" +	//表示该用户是否可用，
			")";
		db.put("student",tmp);
		//课程章节信息表，
		tmp= "create table tjsf.cha_sec (" +
			"courseId integer not null," +
			"chapterNum integer," +
			"sectionNum integer," +
			"Name varchar(20)," +	//章名称或节名称，当sectionNum=0时，存章名称，否则存对应章，节的节名称
			"primary key (courseId,chapterNum,sectionNum)" +
			")";
		db.put("cha_sec",tmp);
	}
	
	public static void init(){
		Statement statement = DBHelper.getStatement();
		ResultSet rs = null;
		try {
			rs = statement.executeQuery("show databases like 'tjsf'");
			if(!rs.next()){
				statement.execute("create database tjsf;");
			}
			List<String> tables = DBHelper.getTables("tjsf");
			for(String key : db.keySet()){
				if(!tables.contains(key)){
					statement.execute(db.get(key));
					ResultSet a = statement.getResultSet();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
