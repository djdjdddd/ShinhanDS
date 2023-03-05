package com.shinhan.day06;

public class InnerInterfaceTest {

	public static void main(String[] args) {
		
		
		Button b1 = new Button();
		// (1) OK 리스너 객체를 생성한 상태.
		Button.ClickListener listener = new OkListener();
		b1.setListener(listener);
		b1.buttonClick();
		
		// (2) Cancel 리스너 객체를 생성한 상태
		Button.ClickListener listener2 = new CancelListener2();
		b1.setListener(listener2);
		b1.buttonClick();
		
		// **그럼 이제 test 함수 사용해서 코드 간소화 가능
		Button.ClickListener listener3 = new OkListener(); // ★★★여기서 앞서 배운 '자동 형변환'을 이용한, 인터페이스의 사용 목적을 볼 수 있는 대목이구만
		Button.ClickListener listener4 = new CancelListener2(); // ★★★여기서 앞서 배운 '자동 형변환'을 이용한, 인터페이스의 사용 목적을 볼 수 있는 대목이구만
		test(b1, listener3);
		test(b1, listener4);
		// ***test에 static 붙인 이유는 따로 객체 생성 없이도 함수 사용하고 싶어서. 그냥 그런 이유임.
	}
	
	
	// **아 근데 일일이 호출하는 코드 너무 복잡하다. 이 문장들도 함수로 묶어버리자!
	static void test(Button b1, Button.ClickListener listener) {
		b1.setListener(listener);
		b1.buttonClick();
	}
}
