package com.shinhan.day04;

// 6.15 싱글톤 패턴 (책 273)

// Servlet : JAVA(주인공) + HTML, 서버에서 수행되는 자바프로그램
// JSP : HTML(주인공) + JAVA, 실행하면 JSP가 Servlet으로 바뀐다.
// 요약: JSP, Servlet 둘 다 Servlet이다. 다만, 주인공이 누구냐에 따라 분류한 듯?

// Servlet은 싱글톤으로 동작한다. 즉, new를 1회만 한다. 
// 즉, 
public class MyServlet {
	
	// 아래 전체가 싱글톤 '패턴'임. (왜 패턴이겠냐)
	public static MyServlet my;
	
	private MyServlet() {
		System.out.println("MyServlet이 생성됨");
	}
	
	// 요것도 static을 붙여야 한다. 그래야 굳이 객체 생성 안해도 이 함수를 부를 수 있겠지.
	public static MyServlet getInstance() { // **뜻 : getInstance()[이름무관] 라는 함수는 MyServlet 형태로 return하는 함수이다.
		                                    // ** 난 이게 처음에 MyServlet getInstance 전체가 함수 이름인 줄 알았는데
		                                    // ** 그게 아니고 리턴 형태가 MyServlet인 getInstance()란 함수. 
		                                    // ** ★절대~ 함수 앞은 '리턴 타입'이란 걸 잊지 마!
		if(my == null) { // null, 즉 아무것도 만들어진 게 없을때, 처음 만들 때만 new를 하고 
			my = new MyServlet();
			
		}
		return my; // 그 이후부턴 그냥 return으로 빠져나가버리는, 즉 new를 안하게 만든 구조구나?
	}
}
