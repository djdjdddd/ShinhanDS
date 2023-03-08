package com.shinhan.day11;

public class Person {
	
	public void action(Workable workable) {
		// 매개변수에서 Workable 인터페이스를 선언했으므로
		workable.work("홍길동", "프로그래밍"); // 이와 같이 Workable에 있는 work라는 함수를 사용할 수 있는 거구나.
	}
	
	public void action2(Speakable speakable) {
		
		// **리턴이 있으니 어디다 대입할지를 써주고(result)
		String result = speakable.speak("안녕하세요");
		System.out.println(result);
	}

}
