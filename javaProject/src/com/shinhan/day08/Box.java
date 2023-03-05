package com.shinhan.day08;

public class Box {

	Object kind; // 타입이 뭐가 될지 몰라 Object타입을 줬다고 치자. 
	int price;
	
	public Box(Object kind, int price) {
		super();
		this.kind = kind;
		this.price = price;
	}
	public Object getKind() {
		return kind;
	}
	public void setKind(Object kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
