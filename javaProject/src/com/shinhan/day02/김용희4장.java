package com.shinhan.day02;

public class 김용희4장 {

	public static void main(String[] args) {
		method5();

	}

	private static void method5() {
		// 문제 5. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는
		// 코드를 작성해보세요. 단, x와 y는 10 이하의 자연수입니다. 
		
	}

	private static void method4() {
		// 문제 4. while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)
		// 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을
		// 멈추는 코드를 작성해보세요.
		int num1 = (int) (Math.random() * 6 + 1);
		int num2 = (int) (Math.random() * 6 + 1);
		
		while (num1 + num2 != 5) {
			System.out.println("주사위를 계속 굴립니다");
		}
		System.out.printf("%d, %d", num1, num2); // ln이 안된다고 뜨네. f를 써야 하나?
	}

	private static void method3() {
		// 문제 3. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}

		}
		System.out.println(sum);
	}
}
