package com.work;

import com.work.database.CreateTable;

public class Test { 
    public static void main(String[] args) { 
//        ApplicationContext context = 
//            new FileSystemXmlApplicationContext("resource/com/work/beans/beans.xml");        
//        HelloBean helloBean = (HelloBean)context.getBean("helloBean"); 
//        System.out.print("Name: ");
//        System.out.println(helloBean.getName()); 
//        System.out.print("Word: ");
//        System.out.println(helloBean.getHelloWord()); 
    	
//    	Statement st = DBHelper.getStatement();
//    	try {
//			boolean res = st.execute("show databases like 'tjsf'");
//			ResultSet rs = st.getResultSet();
//			while(rs.next()){
//				System.out.println(rs.getString(1));
//			}
//			st.close();
//			st=DBHelper.getStatement();
//			System.out.println("-----------------");
//			boolean ress = st.execute("show databases-- like 'tjsf'");
//			ResultSet rss = st.getResultSet();
//			while(rss.next()){
//				System.out.println(rss.getString(1));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
    	CreateTable.init();
    	
    }
}