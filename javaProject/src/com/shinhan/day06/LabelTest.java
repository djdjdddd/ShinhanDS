package com.shinhan.day06;

public class LabelTest {

	public static void main(String[] args) {
		
		Label v1 = new Label("이름입력", 20, 5, "black", "large");
		Resizable2 v2 = new Label("이름입력", 20, 5, "black", "large");
		Colorable v3 = new Label("이름입력", 20, 5, "black", "large");
		Changeable v4 = new Label("이름입력", 20, 5, "black", "large");
		
		work(v1);
		work(v2); // v2, v3는 Changeable보다 더 상위에 있는 거라서?
		work(v3); // => (정정) 얘도 '강제 형변환'됨. Changeable v333 = (Changeable) v3;
		// 에러) 타입 변환하라고 나오네.
		Changeable v333 = (Changeable) v3;
		work(v4);
		
		
	}

	static void work(Changeable aa) { // 매개변수로 또 변수를 선언하자~
		if(aa instanceof Label) {
			Label label = (Label) aa;
			label.setBackground(null);
			label.setForefround(null);
			label.setFont(null);
			label.size(0, 0);
		}
	}
	
	
}
