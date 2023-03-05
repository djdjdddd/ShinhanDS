package com.shinhan.day02;

import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {
		gcd(2, 5); // 호출한 곳으로 돌아간다*
		
	}


	private static void gcd(int i, int j) {
		
	}


	private static void numDay(int year, int month) { // int month : 5라고 입력한 데이터를 받을 공간이 필요하므로 int형 데이터 타입의 방을 설정한 것임. 
		// void : return 값이 없다. 
		// static : class가 메모리에 load될 때 method 영역에 올라간다. (어제 그 메모리 영역 3개 그놈들)
		// public : 모든 패키지에서 이 함수를 호출할 수 있다. 
		
		int lastDay = 0;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7: 
		case 8:
		case 10:
		case 12: lastDay = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30;
			break;
			
		case 2: method9(year); // 아까 아래서 한 윤년 함수(메소드)를 만들었자너? 그걸 이용하는 거임.
							   // ★대신 그러면 9번 함수가 'void'가 아니라 다른 형태여야겠지?
			break;
			
			default : System.out.println(lastDay == 0? "잘못된 월입니다." : lastDay);
				break;
				
		}
	}

	private static boolean method9(int year) { // void가 아닌 다른 형태로 바꿔줬다. 
		// 문제 9. 윤년 
		/* [윤년의 조건]
		 * 1) 4의 배수인 해는 윤년.
		 * 2) 4의 배수이면서 100의 배수인 해는 윤년이 아님.
		 * 3) 100의 배수이면서 400의 배수인 해는 윤년.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하신 연도는 : ");
		
		// 쌤 방법 (슬랙 참조)
		
		// 고민 중 (아니 왜 결과 값이 안 뜨냐?)
		int year1 = sc.nextInt();
		boolean result = false; // 우리가 설정을 '4의 배수이면서 100의 배수인 해는' 윤년이 아니라고 했으니 false라고 설정했음.
		
		if(year1 % 4 == 0 && year1 % 100 == 0) {
			boolean result2 = result;
			if(year1 % 400 == 0) {
				System.out.println(result2? "윤년" : "윤년이 아님");
				
				
			}
		return result2; // return OO;
		}
		return result; // 에러나서 이클립스가 추가해준 문장
		
		/* 내 방법
		 * int i = sc.nextInt();
		if(i % 4 == 0) {
			if(i % 100 == 0) {
				System.out.println("윤년이 아님");
				
			}else if(i % 400 == 0) {
				System.out.println("윤년");
			}else {
				System.out.println("윤년");
		}*/
		
		
		}

	private static void method4_3() {
		// 이건 왜 답이 틀리게 나왔는지 고민해보기!!
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		
		int input = sc.nextInt();
		int count = 0, sum = 0;
		for(int i = 0; i <= 1000; i += input) {
			count += 1;
			sum += i;
			
		}
		System.out.println(input + "의 배수 개수 = " + count);
		System.out.println(input + "의 배수 합 = " + sum);
	}

	/*private static void method4_2() {
		// 1부터 1,000까지의 수 중에서 입력 받은 정수의 배수의 개수와 배수들의 합을 계산하십시오
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int input = sc.nextInt();
		int cnt = 1000 / input;
		System.out.println("7의 배수 개수 = " + cnt);
		​
		int sum = 0;
		for (int i = 1; i <= cnt; i++) {
			sum += input * i;
		}
		System.out.println("7의 배수 합 = " + sum);		
	}*/

	private static void method4_1() {
		// 문제 4. 슬랙
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int num = sc.nextInt();
		int count = 0; //배수의 개수
		int sum = 0; //배수의 합
		
		for(int i=1; i<=1000; i++) { // 문제에서 1부터 1000까지의 수 중에서 ~~한다고 했으니
			if(i<num | i%num !=0) {
				continue;
			}else {
				count += 1;
				sum += i;
			}
		}
		
		System.out.printf("%d의 배수 개수 = %d\n", num, count);
		System.out.printf("%d의 배수 합= %d\n", num, sum);
	}
	

	private static void method4() {
		// 문제 4. 임의의 정수를 입력 받아서, 
		// 1부터 1,000까지의 수 중에서 입력 받은 정수의 배수의 개수와 배수들의 합을 계산하십시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : "); 
		
		int num = sc.nextInt();
		
		
		for(int i = num; num <= 1000; num *= i) {
			System.out.println("7의 배수 개수 = " + i);
			
			int answer2 = (num += num);
			System.out.println("7의 배수 합 = " + answer2);
			
		}
		
		sc.close();
	}

	private static void method3() {
		// 문제 3. 임의의 숫자를 입력 받아 아래와 같은 실행 결과가 나타나는 프로그램을 작성하십시오. 
		// 정수 n의 팩토리얼(factorial)은 1부터 n까지의 모든 정수를 곱한 것으로 n!로 표시합니다.
		// 단 2보다 작거나 9보다 큰 정수가 입력될 경우에는 “잘못된 숫자가 입력되었습니다.”라는 경고 메시지를 출력하고 프로그램을 종료합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		
		int number = sc.nextInt();
		
		if(number < 2 || number > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다");
			return;
		}
		
		int answer = 1;
		for(int i = 1; i <= number; i++) {
			answer *= i;
			System.out.println(i + "! = " + answer);
		}
		sc.close(); // 이건 왜 함?
	}

	private static void method2() {
		// 문제 2. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 100 사이의 정수를 입력하세요. :");
		
		// 쌤 방법
		int number = sc.nextInt();
		boolean isPrime = true; // Prime : 소수 라는 뜻
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) { // number를 i로 나눠서 딱 떨어지면 소수가 아닌 거니까
				isPrime = !isPrime; // 여기서 !을 이용해서 boolean 타입이었던 걸 바꿔준 듯
				break; // 반복문 빠지기
			}
			
		}
		System.out.println(isPrime? "소수" : "소수가 아니다");
		
		// 내 방법
		/*int a = sc.nextInt();
		
		if(a % i == 0) {
			
			System.out.println(a + "는(은) 소수입니다");
			System.out.println(a + "는(은) 소수가 아닙니다");*/
		
		
	}

	private static void method1() {
		// 문제1. 입력받은 숫자의 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :"); // 굳이 줄바꿈 안 하려고 그냥 print 씀
		
		int dan = sc.nextInt();
		
		// 쌤 방법
		if(dan < 2 || dan >= 10) {
			System.out.println("잘못된 숫자가 입력되었습니다");
			return; // return이란 '함수 빠지기' & 호출한 곳으로 돌아간다*
		// break : switch 빠지기, 반복문장 빠지기
		}
		
		for(int gop = 1; gop <= 9; gop++) {
			System.out.printf(" %d * %d = %d\n", dan, gop, dan*gop); // 줄바꾸기 위해 \n
		}
	}

}
