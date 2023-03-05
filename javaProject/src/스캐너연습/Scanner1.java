package 스캐너연습;

// 아니 시부럴 "예금액>" 이게 왜 자꾸 반복해서 뜨는거야 미치겠네 진짜 

import java.util.Scanner;

public class Scanner1 {
	
	private static int balance = 0;
	
	public static void main(String[] args) {
		start();
	}

	private static void start() {
		print();
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int choiceNum = Integer.parseInt(num);
		
		while(true) {
			if(choiceNum == 1) {
				deposit();
			}else if(choiceNum == 2) {
				withdraw();
			}else if(choiceNum == 3) {
				checkBalance();
			}else if(choiceNum == 4) {
				System.out.println();
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println();
				System.out.println("1부터 4까지의 숫자만 입력해주세요.");
				break;
			}
		}
		
	}
	
	private static void checkBalance() {
		System.out.print("잔고>");
		System.out.println(balance);
		
		print();
	}

	private static void withdraw() {
		System.out.print("출금액>");
		
		Scanner sc = new Scanner(System.in);
		String money = sc.nextLine();
		int amount = Integer.parseInt(money);
		
		balance -= amount;
		
		print();
	}

	private static void deposit() {
		System.out.print("예금액>");
		
		Scanner sc = new Scanner(System.in);
//		String money = sc.nextLine();
		int amount = Integer.parseInt(sc.nextLine());
		
		balance += amount;
		
		print();
	}

	public static void print(){
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택>");
	}

}
