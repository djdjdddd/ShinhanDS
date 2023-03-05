package com.shinhan.day05;

// (cf. (1) 직접 extends OO 써도 되고, (2) class 만들 때 상속 '받을' 클래스 이름을 쓸 수도 있음)

// ** 여긴 코드 하나 하나 보면서 이해 좀 해야겠는데

// 상속 개념 : 기존 class(심지어 변경도 가능) + 필드, 메서드, 생성자를 받는 것.
public class CheckingAccount extends Account {

	// 필드
	String cardNo;

	// 자식 생성자 (책 289)
	CheckingAccount(String accNo, String owner, int balance, String cardNo) { // *이건 이런 형태를 사용하고 싶어서 생성자를 선언한 거고
		super(accNo, owner, balance); // 명시적으로 부모생성자를 호출해서 초기화 한 것. (*이건 ????하기 위해 명시적으로 부모생성자를 호출한 경우인가? 책 참조)

//			this.accNo = accNo;      이렇게 부모 생성자에 있는 걸 똑같이 쓰는 것보다는 위처럼 super(accNo, owner, balance);
//			this.owner = owner;      를 써서 명시적으로 부모생성자를 호출하는 게 훨씬 좋지. 간소화
//			this.balance = balance;

		this.cardNo = cardNo;
	}

	public int pay(String carNo, int amount) {
		if (this.cardNo.equals(cardNo)) {
			return withdraw(amount);
		} else {
			System.out.println("카드번호오류");
			return 0;

		}
	}

	void test() {
		// 상속을 받았으므로 부모 클래스에 있던 놈들을 사용할 수 있구나~
		System.out.println(accNo);
		System.out.println(getOwner()); // 이렇게 owner라는 값을 읽을거면 'getter'가 필요 (수정하고 싶으면 'setter' 필요)
		System.out.println(getBalance());
		
		setOwner("김용희"); // 이렇게 여기서 setOwner라는 setter를 이용해서 값을 수정할 수 있는 것!
		
		deposit(1);
		withdraw(2);
	}

}
