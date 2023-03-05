package com.shinhan.day03;

public class ComputerTest {
	
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Computer com1 = new Computer(); // 매개변수 없는 객체 생성했죠? 
										// 그러니까 (자동으로 생성되는) 기본 생성자가 이에 맞춰 대응?되는 구조인가
		
		Computer com2 = new Computer("삼성 모델"); // arg 1짜리 생성자에 접근
		
		Computer com3 = new Computer("윈도우", 100); // arg 2
		
		Computer com4 = new Computer("LG 그램", "윈도우", 100); // arg 3
		
		
		
		
		// syso 도 귀찮다. 이걸 왜 굳이 반복해서 쓰냐? 
		// 반복해서 쓸 거면 아예 '이걸 하는 display라는 함수를 만들어보자!'
		display(com1);
		display(com2);
		display(com3);
		display(com4);
		
	}

	private static void display(Computer com) {
		System.out.println("--------------------------");
		System.out.println(com.getModel());
		com.ComputerInfoPrint();
	}

}
