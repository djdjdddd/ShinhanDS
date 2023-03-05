package com.shinhan.day03;

public class Account {
	
	// Account 클래스는 계좌 번호를 나타내는 accNo 데이터와 잔고를 나타내는 balance 데이터를 갖고 있습니다.
	private String accNo;
	private int balance;
	// 만약 private이 없으면 '언제든지 계좌번호, 잔고를 바꿀 수 있는 형태'가 돼버린다.
	
	
	// 생성자
	Account(){}
	
	Account(String accNo, int balance){ // 왜 이렇게 만들었냐면, 문제에서 Account acc = new Account("~~~", 숫자); 
		 							  // 이런 형태니까 좌측 코드처럼 (String accNo, int balance) 한 것이다.
		
		// this : 객체 자신을 의미
		// this 언제 사용?
		// (1) 아래처럼 매개변수와 멤버변수 충돌시 구분 위해
		// (2) 생성자가 오버로딩 되어있는 경우 (??? 책)
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// 함수로는 입금을 의미하는 deposit 함수와 출금을 의미하는 withdraw 함수 및 잔고를 확인하는 getBalance 함수와 계좌 번호를 확인하는 getAccNo 함수를 가지고 있습니다.
	void deposit(int amount){
		
		balance += amount; // 이거 어제 준범쓰 코드에서 본 그거다.
		System.out.println(accNo + " 계좌에  "
				+ amount
				+ "원이 입금되었습니다.");
		
	}
	
	void withdraw(int amount){
		
		balance -= amount;
		System.out.println("계좌에 "
				+ amount
				+ "원이 출금되었습니다.");
	
	}
	
	// getter ??
	int getBalance(){
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "원입니다.");
		
		return balance;
		// (cf. 그냥 return; 은 된다. 이건 그냥 "함수를 빠져나가겠습니다." 의 의미니까 break; 처럼)
	}
	
	String getAccNo(){
		
		return accNo;
	}
	
	private void print(String message) { // print라는 함수. (입력값으로 String형태의 message변수를 갖는!)
		System.out.println(accNo + message);
		System.out.println(accNo + "계좌의 잔고는 "
				+ balance
				+ "원입니다.");
	}
}

/*
 * [TestAccount 실행결과]
078-3762-293 계좌가 개설되었습니다.
078-3762-293 계좌의 잔고는 1000000원입니다.
078-3762-293 계좌에 2000000원이 입금되었습니다.
078-3762-293 계좌의 잔고는 3000000원입니다.
078-3762-293 계좌에 500000원이 출금되었습니다.
078-3762-293 계좌의 잔고는 3500000원입니다.*/
