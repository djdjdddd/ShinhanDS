package com.shinhan.day04;

// 손님들이 요구하는, 사용하는 클래스의 느낌
public class BookCustomerShopping {
	public static void main(String[] args) {
	    BookVO[] b = new BookVO[5];
		b[0] = new BookVO("Java Program",30000);
		System.out.println(b[0]); // 단순히 이렇게 출력하면 '주소'가 나온다 (com.shinhan.day04.BookVO@7c30a502)
		System.out.println(b[0].toString()); // 이렇게 해야 '정보'를 알 수 있는 것!
		
		b[1] = new BookVO("JSP Program",25000);
		b[2] = new BookVO("SQL Fundamentals",20000);
		b[3] = new BookVO("JDBC Program",32000);
		b[4] = new BookVO("EJB Program",25000);
		
		BookService bm = new BookService(b);
		bm.printBookList();
		bm.printTotalPrice();
	}
}
