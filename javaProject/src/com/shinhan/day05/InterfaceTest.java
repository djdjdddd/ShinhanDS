package com.shinhan.day05;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {

	public static void main(String[] args) {
		f5();
	}

	private static void f5() {

		// 배열의 단점 : 개수가 정해져있음. 바꾸려면 그거 해야됨.
		String[] arr = new String[] { "자바", "SQL", "WEB", "Spring" };

		// 가변적인 걸 쓰고 싶을 땐 아래와 같은 Collection을 쓰면 좋다. (종류에 따라 기능이 조금씩 다름)
		// List, Set, Map
		// List (List라는 interface) : 순서있고 중복허용 (ex. ArrayList, Vector, LinkedList)
		// Set : 순서없고 중복허용X
		List<String> data = new ArrayList<String>();
		data.add(10); // 처음에 List만 썼을 땐 add될 수 있었음(그게 List의 특징) / <String> 라는 generics를 쓰니까
					  // 'String 타입만 자동으로 걸러서 add'시켜주는 기능.
		data.add("자바");
		data.add("WEB");
		data.add("자바"); // List는 중복 허용하니까 add됨.
		data.add("SQL");

		print(data);
	}

	
	 static void print(ArrayList<String> data) { // *** 근데 이렇게 ArrayList라는 클래스로 받아버리면 나중에 Vector로 바꾸고 싶으면 매개변수부터 싹 다 바꿔줘야 하는 번거로움... 
		 for(String s : data) {
			 System.out.println(s);
		 }
	 }
	
	 
		

	static void print(List<String> data) { // *** 그래서 이렇게 아예 List란 인터페이스로 받는게 유지보수가 쉽다.
												
		for (String s : data) {
			System.out.println(s);
		}

	}

	private static void f3() {
		f4(new Television()); // 텔레비전 객체를 생성
		f4(new Audio()); // 오디오 객체를 생성
	}

	// ★위의 f4 함수를 동시에 수행할 수 있게끔 하기 위해 '인터페이스'를 사용한 것!!
	// 자동형변환 + override ==> 다형성 (사용법은 같고 결과는 다양한)
	private static void f4(RemoteControl remote) {
		remote.powerOn();
		remote.powerOff();

		// 이번엔 이 display 라는 기능도 추가 시키고 싶다. 어떻게 하면 될까?
		// RemoteControl이란 인터페이스에 추가하면 된다~
		remote.display();

		// 이렇게 하려니까 안 되고
		remote.display2(); // (cf. 오버라이드도 아님)
		RemoteControl.display2(); // static 호출 방법: 이렇게 Interface 이름으로 호출해야 한다.
		// 왜냐면 매개변수가 'RemoteControl remote' 이기 때문에 그런 거임.

		// 만약 Audio의 display2 함수를 쓰고 싶다면~
		// 매개변수를 'Audio audio'로 해야죠.
		if (remote instanceof Audio audio) { // 쌤은 이렇게 썼는데, 나는 '강제적 형변환'으로 옛 방식으로 하자. 
			audio.display2();
			audio.wifiTurnOn();
		}
		
		if(remote instanceof WIFI wf) { // 얘는 인터페이스라서 이렇게 선언해야 하는 건가;;
			
			wf.wifiTurnOn();
		}
	}

	private static void f2() {
		String s1 = "A";
		String s2 = "B";

		// .compareTo() : 많이 씀. 뒤에서 다시 함.
		System.out.println(s1.compareTo(s2));
	}

}
