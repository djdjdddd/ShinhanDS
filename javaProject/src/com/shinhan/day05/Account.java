package com.shinhan.day05;

// 7.2 클래스 상속 ~ 7.3 부모 생성자 호출 (책 288)
//

// (1) 부모 class로 쓸 예정
public class Account {
	
	// 1. field
	private String accNo;
	private String owner;
	private int balance;
	
	// 2. 생성자
	public Account() { // 기본 생성자
		super(); // 사실 이게 숨겨져있다.
		
	} 

	public Account(String accNo, String owner, int balance) {
		
		this.accNo = accNo;
		this.setOwner(owner);
		this.setBalance(balance);
		// super(); : ★꼭 맨 첫줄에 써야하는 이유는 바로, 다른 줄에 쓰면 super();를 또 쓴 것으로 인식하기 때문에 
	}
	
	// 3. 메서드
	public void deposit(int amount) {
		setBalance(getBalance() + amount);
	}
	
	public int withdraw(int amount) {
		if(amount > getBalance()) { // 만약 잔고보다 출금하려는 금액이 더 크면 안되겠지?
			System.out.println("잔고부족");
			return 0; // 그래서 이러한 statement를 쓴 것. 
		}
		setBalance(getBalance() - amount);
		return amount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
