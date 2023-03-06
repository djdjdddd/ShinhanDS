package com.shinhan.day09;

public class BookTest {

	public static void main(String[] args) {
		Book<String> b1 = new Book<>("이것이자바다", 30000, "한빛미디어", new String[] {"신용권", "임경균"}); // title, price, publisher, author 순서
		Book<String> b6 = new Book<>("이것이자바다", 30000, "한빛미디어", new String[] {"신용권", "임경균"}); // title, price, publisher, author 순서
	
		Book<Integer> b2 = new Book<>(999, 30000, "한빛미디어", new String[] {"신용권", "임경균"});
		
		Book<String> b4 = Book.makeBook("자바웹구현", 25000);
//		Book<String> b5 = Book.makeBook(new Box(), 25000);
		
		int result = b1.compareTo(b4); // (Book 클래스에서) compareTo 함수를 this.price - obj.price 로 구현해놨으니
		System.out.println(result); //  이값은 5000이 나옴.
		
		System.out.println(b1.equals(b6));
		System.out.println(Book.getCount() + "권");
		
		
		
		
		
		
	}

}
