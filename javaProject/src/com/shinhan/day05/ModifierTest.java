package com.shinhan.day05;

// 05 패키지에서 04 패키지를 import 해서 쓰겠다는 의미죠.
import com.shinhan.day04.Phone;

// 6.13 접근 제한자 (책 262)
public class ModifierTest {

	public static void main(String[] args) {
		Phone p = new Phone();
		
		System.out.println(p);
		// 만약 Phone 이라는 클래스가 (1)public이 아니라 (2)생략 형태이면 위처럼 가져다 쓸 수 없게 된다!
		// 이게 바로 접근 제한자의 역할 (근데 워낙 많이 다뤄서 이제 익숙하긴 하네)
	}

}
