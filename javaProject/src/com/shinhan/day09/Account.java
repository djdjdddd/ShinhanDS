package com.shinhan.day09;

//부모class로 사용할 예정
public class Account{
	//1.field
	private String accNo;
	private String owner;
	private int balance;
	
	//생성자
	public Account() {
		
	}
	public Account(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	//메서드
	public void deposit(int amount) {
		balance += amount;
	}
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔고부족");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		//
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
