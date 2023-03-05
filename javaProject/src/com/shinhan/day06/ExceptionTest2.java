package com.shinhan.day06;

// 11. 6 사용자 정의 예외
// 만드는 이유 : 업무상 Exception 처리를 일관성 있게 해주기 위해.
// 따라서 extends Exception 해야 한다.
// extends 상위Exception : ??

// ★예를 들어서, Exception을 상속 받으면 : 이 예외를 Exception으로 만들고 싶다는 거고,
// ★예를 들어서, RuntimeException을 상속 받으면 : 이 예외를 RuntimeException으로 만들고 싶다는 거다. 왜?? (이건 상속으로 이해해야 하나??)


// throw != throws
// 발생하다(throw) : 어떤 일이 '강제로' 발생한다.
public class ExceptionTest2 {

	public static void main(String[] args) {
		
		
		// 0~1 실수
		double a = Math.random();
		// 1~10 정수
		int b = (int)(a*10); // 0 <= b < 10 의 수가 나온다. 근데 정수형이니까 정수만 나오는 거고
		
		
		
		
		
		
		
		
		// Exception : 자동발생, 강제발생 2가지가 있다.
		
		// 예를 들어, int a = 10/0; 은 '자동발생'
		
		// 강제발생 예시
		String pass = "123456";
		
		// 예를들어, 비밀번호 첫번째 자리(0번째)를 영어대문자로만 하고 싶을 경우
		
		// 마찬가지로 2가지 방법 있음. 
		
		// (1) try catch로 내가 해결하는 방법
		char ch = pass.charAt(0);
		
		try {
			if(ch < 'A' || ch > 'Z') {
				throw new LoginException("대문자 시작해야 한다"); // LoginException은 우리가 만든 클래스.
			}}catch(LoginException ex) {
				ex.printMessage();
			}
			System.out.println("main 끝");
			}
	
		
		// (2) throws로 떠넘기는 방법
		// 되는 건가?????????? (쌤 질문)
	    // **그니까 예외 '처리'는 되는데, 우리의 진짜 목적이라고 할 수 있는 '정상적인 종료'가 될 순 없겠구만??
		// **그러니까 '정상적으로 종료' 시킬려면 try-catch 이용해야 하고.
	}

