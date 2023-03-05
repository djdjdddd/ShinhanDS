package com.shinhan.day05;

public class AccountTest {

	public static void main(String[] args) {
		f2();
	}

	private static void f2() {
		CheckingAccount acc = new CheckingAccount("112-1888", "jin", 1000, "9999");
		acc.deposit(2000);
		int amount = acc.withdraw(100);
		System.out.println(amount + "출금");
	}

	private static void f1() {
		Account acc = new Account("112-1888", "jin", 1000);
		
		acc.deposit(2000);
		int amount = acc.withdraw(100);
		System.out.println(amount + "출금");
		
		
	}

}
