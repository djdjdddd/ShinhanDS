package com.shinhan.day05;

// 7.4 메소드 재정의 (책 293)
public class CreditLineAccount extends Account{
	
	int creditLine;
	
	// (캡쳐 참조) 쉽게 생성자 만드는 법 : 우클릭 - ... - ★arg가 있는 놈 선택해서 만들기!
	public CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance);
		this.creditLine = creditLine;
	}

	// override(덮어쓰기, 재정의) : 시그니처가 같아야 한다.
	// 이름, 매개변수, return타입 3가지가 모두 같아야 한다. (단, modifier는 같거나 더 넓어져야 한다)
	// 마찬가지로 ' 우클릭 - Source - Override/Implement Methods - ★재정의 하고 싶은 놈 고르기 '로 쉽게 만들기
	
	// (1) 오버라이드 예시 1
	@Override // (cf. Annotation, 자바 제공 기능, 나중에 framework할 때 많이 보게 된다)
	public int withdraw(int amount) {
		int total = getBalance() + creditLine;
		
		if(amount > getBalance()) { 
			System.out.println("잔고부족");
			return 0;
		}
		setBalance(getBalance() - amount); // ** 이쪽 로직 다시 찬찬히 (ppt 보면서 이해좀)
		return amount;
	}
	// 결과적으로 부모가 갖고 있던 withdraw 함수의 기능이 바뀌었음. 
	
	
	// (2) 오버라이드 예시 2
	public void deposit(int amount) {
		System.out.println("입금하다... override test");
		super.deposit(amount);
	}
	// 설명 : 이건 뭐냐면, 부모가 갖고 있는 deposit 함수가 있는데, 자식 클래스에 오버라이드(재정의)한 것임.
	// 이로써 ' 부모의 deposit도 실행되고, 자식의 deposit도 실행이 된다!! '
	// **(정정) 이 경우는 super.deposit(amount); 즉 부모 클래스의(super) deposit을 실행하겠다는 코드가 있어서 부모 것도 실행을 시킨 케이스임.
	// 그게 아니면 자식 것만 실행을 시키게 됨. 
	

	void test() {
		System.out.println(getAccNo); // 얘에 대해선 내가 getter 안 만들어놔서 읽지 못하는 상태임.
		System.out.println(getOwner());
		
		deposit(100);
		withdraw(100);
		
	}

	
}


