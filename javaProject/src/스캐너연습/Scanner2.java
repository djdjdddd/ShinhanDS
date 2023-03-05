package 스캐너연습;

import java.util.Scanner;

// 5장 9번

public class Scanner2 {
	
	int studentNum = 0;

	public static void main(String[] args) {
		start();
	}

	private static void start() {
		print();
		
		Scanner sc = new Scanner(System.in); // 키보드로 입력(system.in)한 걸 매개값으로 받는 Scanner 객체 생성하였음. (스캐너 기능 쓰기 위해서)
		
		int choiceNum = Integer.parseInt(sc.nextLine()); // 입력한 값을 스캔 뜬 걸(sc.nextLine) 정수형으로 바꾸고, 그걸 choiceNum에 대입하겠다. 
		
		boolean run = true;
		
		while(run) {
			if(choiceNum == 1) {
				numOfStudent();
			}else if(choiceNum == 2) {
				inputScore(); // 점수입력 기능을 가진 함수를 호출해라~
			}else if(choiceNum == 3	) {
				listScore();
			}else if(choiceNum == 4) {
				analyze();
			}else if(choiceNum == 5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1부터 5 사이의 수를 입력해주세요.");
				run = false;
			}
		}
	}

	private static void analyze() {
		System.out.println("최고 점수: ");
		System.out.println("평균 점수: ");
	}

	private static void listScore() {
		System.out.println("최고 점수: ");
		System.out.println("평균 점수: ");
		
	}

	private static void inputScore() {
		System.out.println("scores>");
		
		for(int i=0; i<)
		
	}

	private static void numOfStudent() {
		System.out.println("학생수>");
		
		Scanner sc = new Scanner(System.in);
		int studentNum = Integer.parseInt(sc.nextLine());
		
		int i = studentNum;
		
		int[] array = new int[i];
		
	}

	private static void print() {
		System.out.println("-------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택>");
	}

}
