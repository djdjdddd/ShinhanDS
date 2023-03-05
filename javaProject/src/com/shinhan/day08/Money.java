package com.shinhan.day08;

// 신입사원 시험문제

public class Money implements Comparable<Money>{ // <T>를 안쓰면 => 우리가 타입을 정해주지 않았기 때문에 generics를 쓰지 않았을 때 생기는 불편함이 초래됨. (뭔말인지 모르겠다면 직접 해보고)
	
	// <Money> 제네릭스 쓴 경우
	@Override
	public int compareTo(Money obj) {
		
		// 또는 그냥 아래처럼 '비교'만 해도 된다. (그럼 알아서 작은 놈이 앞으로 가게 된다는데??)
		return (amount - obj.amount); 
		
		          // -1, 0, 1
		          // -1 : 작으면 앞으로 간다
		          //  1 : 크면 뒤로 간다는 뜻
	}
	
	
	
	
	int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		// 더하기 구현
		
		// new를 해줘야 한다?! 왜냐면 return이 Money의 형태니까
		// 그리고 연산식 
		return new Money(this.amount + money.amount);
		
		// return 타입이 Money 니까 저렇게 new를 해서 새로 만들어준 듯? (마치 int 타입이면 int 타입의 값을 return 해주듯이)
//		new Money(this.amount + money.amount);
//		return Money();
	}

	public Money minus(Money money) {
		// 빼기 구현
		return new Money(this.amount - money.amount);
	}

	public Money multiply(Money money) {
		// 곱하기 구현
		return new Money(this.amount * money.amount);
	}

	public Money devide(Money money) {
		// 나누기 구현
		return new Money(this.amount / money.amount);
	}

	
	
	
	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}

	
	@Override
	public boolean equals(Object object) {
		// Object equals 메쏘드 재정의
		
		// 쌤 - 자동으로 만들어주는 것과 똑같이 코드를 쓰셨다고 함. 
		
		// *equals 메쏘드에서는 인자로 넘어온 Object 객체가 Money 타입인지를 확인하고
		if(this == object) return true; // 주소 같으면 같다.
		if(object == null || getClass() != object.getClass()) return false;
		
		// *Money 타입인 경우에 금액이 동일한지를 확인한다. 이 두가지 조건이 만족하는 경우에 true를 리턴한다.
		return amount == ((Money)object).amount; // object를 Money 타입으로 강제형변환 해줘야 amount 변수에 접근할 수 있어서
		
	}

	public static void main(String[] args) {
		Money five = new Money(5);
		Money two = new Money(2);
		Money three = new Money(3);
		Money ten = new Money(10);

		// 문제 조건 : "Money Class 구현을 완료 하였습니다." 가 출력될 수 있게 조작.
		if (five.equals(two.add(three)) && three.equals(five.minus(two)) && ten.equals(five.multiply(two))
				&& two.equals(ten.devide(five))) {
			System.out.println("Money Class 구현을 완료 하였습니다.");
		}
	}

	
}
