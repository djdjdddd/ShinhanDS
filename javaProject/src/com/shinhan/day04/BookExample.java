package com.shinhan.day04;

public class BookExample {

	
	public static void main(String[] args) {
		System.out.println("책생성전:" + BookVO.count);
		
		BookVo[] b = new BookVO[5];
		b[0] = new BookVO("Java Program",30000);
		b[1] = new BookVO("JSP Program",25000);
		b[2] = new BookVO("SQL Fundamentals",20000);
		b[3] = new BookVO("JDBC Program",32000);
		b[4] = new BookVO("EJB Program",25000);
		
		System.out.println("책생성후:" + BookVO.count);
	}

}
