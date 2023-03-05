package com.shinhan.day06;

// 9.6 중첩 인터페이스 예제 (410)
public class Button {
	
	// 필드
	private ClickListener listener;
	
	// 메소드
	// setter (listener가 private하니까)
	public void setListener(ClickListener listener) {
		this.listener = listener;
	}
	// getter
	public ClickListener getListener() {
		return listener;
	}
	public void buttonClick() {
		listener.onClick(); // 좀 복잡하네 구조가;;
		                    // Button 클래스에는 buttonClick이라는 함수가 있는데, 이걸 실행하면 listener.onClick 함수를 구현하겠다는 뜻인 듯?
		                    // 귀찮아도 이렇게 좀 해석하면서 코드 쓰자
	}
	
	// 내부 인터페이스 (**일종의 버튼 전용 규격서라고 생각하자. 
	//                 OK버튼, Cancel버튼 모두 onClick(버튼 누르기)했을 때 어떠어떠한 동작을 갖고 있어야 한다고 일종의 규격을 주는 것.)
	// ***솔직히 아주 잘 이해는 안 가지만 그림도 그리고 하면서 다시 복습
	static interface ClickListener{
		void onClick();
	}

	
	
}
