package com.shinhan.day04;

public class SingletonTest {

	public static void main(String[] args) {
		
		// 이거 안 된다. 왜? MyServlet이 'private'으로 접근 제한되서
		MyServlet a = new MyServlet;
		
		// 따라서 new가 아니라 클래스 자체로 접근해야겠다 (이 클래스는 public이니까 접근가능)
		MyServlet b = MyServlet.getInstance();
		
		System.out.println(b);
	}

}
