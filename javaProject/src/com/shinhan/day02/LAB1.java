package com.shinhan.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		method5();
		
	}

	public static void method5() {
		// 문제5. 입력 받은 수 만큼 ‘*’로 직각 역삼각형을 출력하는 프로그램을 작성하십시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("직각 역삼각형을 출력할 줄 수 : ");
		
		int rowCount = sc.nextInt();
		
		// 쌤 방법
		for(int row = 1; row <= rowCount; row++) {
			for(int col =1; col <= rowCount+1-row; col++)
			System.out.print("*");
			
		}
		System.out.println();
	}

	private static void method3() {
		// 문제3. 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 
		// SumTest 클래스의 main 메쏘드를 완성하십시오. 
		
		int end, total=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마지막 값을 정수로 입력하세요. :");
		
		end = sc.nextInt();
		
		int start = end % 2 == 0? 2 : 1; // 삼항연산자
		for(int i = start; i <= end; i += 2) {
			
		}
		System.out.printf("총합은 %d 입니다", total);
		sc.close();
		
		
	}

	private static void method2() {
		// 문제 2. 
		
		Scanner sc = new Scanner(System.in); // (문자열)을 입력해야 하므로 스캐너 만들었다?
		System.out.print("문자열을 입력하세요. :");
		
		String inputString = sc.nextLine(); // next가 아닌 nextLine을 해야 하는 이유는 : '한줄'을 다 읽어라 (next는 문자만 읽어버림. 그래서 띄어쓰기를 못 읽는 건가?)
		inputString = inputString.toUpperCase(); // 문자열을 아예 대문자로 바꿔버리는 기능
		
		for(int i = 0; i <= inputString.length(); i++) { // 가운데 i <= inputString.length(); 는 문자열의 길이보다 작거나 같을 때까지 반복하겠다. 작다만 하면 아마 끝 자리가 짤릴 껄? HELLO 예제 생각해봐
			System.out.println(inputString.subSequence(0, i));
		}
		
		//System.out.println(inputString.length());
		//System.out.println(inputString.substring(0, 2)); // 왼쪽 숫자는 <=, 오른쪽은 < (즉, 0보다 크거나 같고 2보다 작은)
		//System.out.println(inputString.toUpperCase()); // 대문자가 UpperCase니까 
		
		sc.close(); // 스캐너를 닫아야 한다. 왜?? 
	}

	private static void method1() {
		// 문제 1. ★모르겠으면 알고리즘을 먼저 그림으로 그려서 코드 어케 짤지 생각해보기.
		
		int start, end, increment, total=0; // 초기화가 되지 않으면 사용될 수 없으니까 tota = 0; 이라고 굳이 초기화 한 것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초기값을 정수로 입력하세요. :");
		start = sc.nextInt();
		
		System.out.print("마지막 값을 정수로 입력하세요. ");
		end = sc.nextInt();
		
		System.out.print("증가분을 정수로 입력하세요."); 
		increment = sc.nextInt();
		
		for(int i = start; i <= end; i += increment) {
			total += i;
		}
		
		System.out.printf("총합은 %d 입니다", total);
		
		sc.close();
		
	}

}
