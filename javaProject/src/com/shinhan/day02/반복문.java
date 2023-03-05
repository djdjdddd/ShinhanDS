package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
		forTest5();

	}

	private static void forTest5() {
		// continue문
		// (2) 짝수가 아니면 안 하겠다는 의미. 
		
		int su = 1;
		int total = 0;
		for (; su <= 10; ++su) {
			if (su % 2 != 0) continue; // 반복문을 빠지지 않고 아래 문장들 무시, 계속 진행
				total += su;
				
				//total += su; // total = total + su;
				System.out.print(su); // 그냥 print만 써서 한줄로 썼다.
				System.out.print(su == 10 ? "" : "+"); // 10 뒤에 +가 붙는 걸 막기 위해 요러한 코드를 짠 것 (삼항연산자)
			

		}
		System.out.println("=" + total);
	}

	private static void forTest4() {
		// (1) 짝수일 때만 문장들을 수행하겠다는 의미. 
		int su = 1;
		int total = 0;
		for (; su <= 10; ++su) {
			if (su % 2 == 0) { // 짝수를 지칭하는 코드! ( a % 2 == 0)
				total += su;
				
				//total += su; // total = total + su;
				System.out.print(su); // 그냥 print만 써서 한줄로 썼다.
				System.out.print(su == 10 ? "" : "+"); // 10 뒤에 +가 붙는 걸 막기 위해 요러한 코드를 짠 것 (삼항연산자)
			}

		}
		System.out.println("=" + total);
	}

	private static void whileTest3() {
		// do-while문
		int i = 1;
		do {
			System.out.println(i);
			System.out.println("-------------");
			i++;
		} while (i <= 10);
		System.out.println(i);
	}

	private static void forTest3() {
		// 심지어 요것도 가능

	}

	private static void forTest2() {
		// 이렇게 하는 것도 가능하다. (변수의 선언과 초기화를 아예 밖에서 하는 것도)
		int i = 1;
		for (; i <= 10; ++i) {
			System.out.println(i);
		}
	}

	private static void forTest() {
		// 4.4 for문

		int i;
		// 1~10까지 출력한다.
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		// 반복문을 써보자
		for (int ii = 1; ii < 10; ++ii) {
			System.out.println(ii);
		}

		for (i = 1; i <= 10; ++i) {
			System.out.println(i);
		}
		System.out.println("method end..." + i); // for 안에서 i를 선언했으므로 접근 불가능.
		// 따라서 밖에서 선언하면 에러가 없어진다.
	}

}
