package com.shinhan.day08;

// 2. generics 사용 예제
public class HappyBox<T> { // **이렇게 <T> 라고 줘봤다.

	T kind; // 여기도 T 
	int price;
	
	public HappyBox(T kind, int price) { // 저기
		super();
		this.kind = kind;
		this.price = price;
	}
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
