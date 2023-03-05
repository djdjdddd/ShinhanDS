package 스캐너연습;

import java.util.Scanner;

// 5장 9번

public class Scanner2_답지 {

	public static void main(String[] args) {
		boolean run = true;
		
		int studentNum = 0; // 일단 0으로 초기화
		int[] scores = null; // 배열도 null로 초기화 (**선언 및 초기화까지만)
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo==1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum]; // **그리고 여기서 new로 생성. (왜냐면 길이를 얼마로 할지 여기서 결정나니까..)
			}else if(selectNo==2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					int score = Integer.parseInt(sc.nextLine());
//					scores[studentNum] = score;
					scores[i] = score;
				}
			}else if(selectNo==3) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					System.out.println(scores[i]);
				}
			}else if(selectNo==4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max < scores[i])? scores[i] : max;
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}else if(selectNo==5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		
	}
	
	
	
}