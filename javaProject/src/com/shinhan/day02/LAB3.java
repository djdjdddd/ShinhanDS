package com.shinhan.day02;

public class LAB3 {

	// public : 모든 패키지에서 접근 가능하다는 의미.
	// static ★★★ : >java LAB3 라고 써서 실행하면, 실행하기 전에 LAB3 class의 '바이트코드'가 'method 영역'에 올라간다.
	// 그때 static이 붙은 method(함수), variable(변수)들도 method 영역에 올라간다. (non-static은 안 올라가고 뭐 어쩐다 그랬는데)
	// void : return값이 없다. 함수 수행 후 돌아갈 때 값을 가지고 가지 않는다는 의미. 
	public static void main(String[] args) {
		int result = sum(1, 3); // 1.이렇게 내가 원하는 구절을 일단 써
			                    // 2.그리고 이클립스가 만들어주는 걸 적극 이용. 
		
		System.out.println(result);
	}

	private static int sum(int start, int end) { // 3.그러면 이와 같은 문장이 새로 생긴다. 
										         // 4.이번에는 return 값이 있으므로 void가 아니라 int형으로 바꿔져있음. (이는 호출하는 데이터 타입과도 같아야 한다고 했는데 생활코딩 참조)
		int total = 0; // 일단 0이라고 초기화까지 해놓고
		
		for(int loop = start; loop <= end; loop++) {
			total += loop;
		}
			
		return total; // 위에서 계산한 total 값을 return 하겠다. (== 함수 수행 후 돌아갈 때 값을 가지고 가겠다~)
		
	}

	

}
