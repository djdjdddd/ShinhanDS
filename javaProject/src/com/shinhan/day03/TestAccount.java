package com.shinhan.day03;

public class TestAccount {
	public static void main(String[] args) {
		Account acc = new Account("078-3762-293", 1000000);
		
		// ★아래 형식 : ' int a '= acc.deposit(200000); 이게 아니고, 
		// ★함수를 부르기만 하는 형태니까 void 형태인 걸 알 수 있다.
		acc.deposit(1000);
		acc.withdraw(500);
	}

}

