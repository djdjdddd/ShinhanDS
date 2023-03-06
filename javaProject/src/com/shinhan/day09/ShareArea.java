package com.shinhan.day09;

// ppt (critical section의 동기화 예제)

// 공유자원으로 이용할 class
// 2개의 계좌가 있다.
public class ShareArea {

	public ShareArea(Account account1, Account account2) {
		lee = account1;
		sung = account2; // 여기 대입을 실수했었네;;
	}

	Account sung; // 성춘향의 계좌
	Account lee;

	
	// 쌤) 
	// 근데 굳이 TransferThread, PrintThread에 아래와 같은 기능을 나눌 필요가 없이
	// ShareArea(공유영역에)에 이체와 출력 함수를 만드는 방법도 있다.
	// **그리고 이땐 synchronized 블럭이 아닌 메소드 형태를 사용했는데, 복습하면서 다양한 방법을 익히자
	synchronized void transfer() {
		
			// 출금한다.
			int amount = lee.withdraw(100); 
			System.out.println("lee계좌에서 " + amount + "출금");
			// 입금한다.
			sung.deposit(100);
			System.out.println("lee계좌에 " + amount + "입금");
		
	}

	synchronized void printBalance() {
		for (int i = 0; i < 3; i++) { // 3번 반복해서 잔액을 출력할 거니까 for문장

			// 잔액출력
			System.out.println("잔액은 : " + (lee.getBalance() + sung.getBalance()));

		}
	}
}
