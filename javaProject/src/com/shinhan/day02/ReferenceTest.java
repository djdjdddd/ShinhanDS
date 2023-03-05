package com.shinhan.day02;

import java.util.Arrays;

public class ReferenceTest {

	
	public static void main(String[] args) { // 이 블럭 각각을 프레임이라고.
		f4(); 
	}

	private static void f4() {
		// 문자열 분리
		String subjects = "자바, DB, HTML, CSS, JavaScript, React, Spring";
		String subjects2 = "자바, DB# HTML, CSS# JavaScript, React, Spring";
		String[] arr = subjects.split(","); // ,로 분류돼있는 놈을 split 하겠다는 메소드
	    String[] arr2 = subjects2.split(",|#| "); // 이렇게 쓰면 꼭 ,로만 분류된 게 아니라 #과 공백으로 분류된 것도 split 해주겠다는 뜻 
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		
		for(String s : arr) { // 생활코딩에서 배운 for-each문이네
							  // : 우측엔 여러개?, : 좌측엔 하나 (이렇게 하면 여러개에서 하나씩 하나씩 뽑아주는 문장이다)
		
			System.out.println(s);
		}
	}

	// 책 5.5 문자열 타입 예시
	private static void f3() {
		String subject = "이것이 자바다";
		for(int index = 0; index < subject.length(); index++) { // 참조형인 String 타입의 길이를 의미하는 .length() 메소드
			System.out.println(subject.charAt(index));
			System.out.println(subject.substring(index, index + 1));
			System.out.println("----------------");
			
		}
		System.out.println(subject.replace("이", "AA"));
		System.out.println(subject); // 이거의 결과를 보면 String이 '고정'문자열이라는 의미를 잘 알 수 있다. 
		                             // 즉, replace를 했다고 해서 '고정'문자열인 String의 값 자체가 바뀌진 않는다는 것. 저때만 바뀌고
	
		System.out.println(subject.indexOf("자바"));
	}
	

	private static void f2() {
		String name = null; // null은 힙에 생성된 객체는 없다. 
			                // 스택 영역엔 생겼는데, 아직 힙 영역에 생성된 객체가 없는 상태라서 '몇 번지'를 가르키고 있는지가 아직 없는 상태. (책 보고 정확히 공부)
		
	}

	private static void f1() {
		int a = 10;
		String s1 = "자바"; // "자바"가 compile시 class의 상수pool에 들어간다. (왜냐면 컴파일하면 .java가 .class가 되니까 그때)
		String s2 = "자바"; // 그리고 load시에 method영역의 상수pool에 들어간다. 
		System.out.println(s1 == s2); // 둘의 주소가 같다. (왜 같은 거지...?)
		
		String s3 = new String("자바"); 
		String s4 = new String("자바");
		System.out.println(s3 == s4); // 주소 다르다. (new를 이용해서 그때 그때 서로 다른 객체를 만든 것임 이 경우는)
		
		// ★★★ 기본형과 달리 참조형은 단순히 == 을 통해 값을 비교할 수 없다. 
		// 위처럼 주소가 같은지 다른지를 비교한다.
		
		// 따라서 참조형의 값을 비교하기 위해선 다음과 같은 기능을 쓴다. 
		System.out.println(s3.equals(s4)); // .equals()
	}

}
