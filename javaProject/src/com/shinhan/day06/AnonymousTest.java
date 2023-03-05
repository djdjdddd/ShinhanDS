package com.shinhan.day06;

public class AnonymousTest {

	public static void main(String[] args) { // public이니까 AnonymousTest.main 으로 호출 가능
		f4();
	}

	
	// 익명 객체 예제2
	public static void f4() { // public으로 바꿔줬으니 => 외부에서 AnonymousTest.f4 라고 호출 가능
		RemoteControl tv = new RemoteControl() { // 이렇게 interface 이름으로 

			// *만약 아래처럼 override외에 새로 필드와 메소드를 추가했다면, 얘네가 호출이 될 수 있을까??
			int a = 10;
			public void method() {
				System.out.println("구현 class에서 메소드 추가");
			}
			// => *No. 당연히 {} 내부에서 선언? 정의? 됐으니 내부에서밖에 못 쓴다. 
			// 딱 {} 여기 내부에서만 사용가능한 듯.
			
			@Override
			public void turnOn() {
				System.out.println("전원켠다" + a);
			}

			@Override
			public void turnOff() {
				System.out.println("전원끈다");
			}
		};
		// *따라서 {} 밖에서는 사용 못한다.
		tv.turnOff();
		tv.turnOn();
		// * 당연히 RemoteControl이라는 인터페이스에 선언된 위 2가지 메소드밖에 호출 못한다. 
	}

	private static void f1() {
		// 1. 일반적인 방법
		Book book = new Book();
		book.title = "이것이자바다";
		book.setForeground("white"); // setter를 이용해서 책의 앞면, 뒷면 색깔을 설정해주는 코드.
		book.setBackground("blue");
		
		Cup cup = new Cup();
		cup.size = 10;
		cup.setForeground("white");
		cup.setBackground("blue");
		// 뭣하러 굳이 book. cup.
		
		// 2. 익명 객체
		// '익명 객체' 만드는 첫번째 방법 (cf. 여러번 쓸 거면 이렇게 빠르게 변수에 담아서 쓰는 방법)
		Colorable a = new Colorable() { // (1) 이렇게 interface를 이용해서 new를 하고?! (책 더 읽고 정확히)
			
			@Override
			public void setForeground(String color) {
				System.out.println("익명...setForeground" + color);
			}
			
			@Override
			public void setBackground(String color) {
				System.out.println("익명...setForeground" + color);
			}
		};
		// (2) 그 a를 통해 이렇게 바로 함수를 불러 읽을 수 있는 것. (아주 빠르고 쉽다)
		a.setBackground(null);
		a.setForeground(null);
		
		
		
		// 두번째 방법 : **아예 이 아래 문구 전체를 ( )로 감싼 후에 .(도트 연산자)로 쉽게 불러올 수 있는 구조. (cf. 한번만 쓸 거면 이 방법도 ㄱㅊ)
		(new Colorable() { // (로 닫은 곳
			
			@Override
			public void setForeground(String color) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBackground(String color) {
				// TODO Auto-generated method stub
				
			}
		}).setBackground(null);;  // )로 닫은 곳
	}

}
