package com.shinhan.day06;

public class LoginException extends Exception{ // '어느 예외 클래스를 사용할지'도 정할 수 있다. (ex. RuntimeException 등)

	String errMessage;
	
	public LoginException(String errMessage) {
		super(errMessage); // 그래서 이렇게 썼음. super 이용해서
//		this.errMessage = errMessage; // 이렇게 해도 되긴 하지만, 이 경우는 이미 'Exception 클래스' 안에 존재하더라
	}
	
	public void printMessage() {
		System.out.println("로그인: " + getMessage());
	}
}
