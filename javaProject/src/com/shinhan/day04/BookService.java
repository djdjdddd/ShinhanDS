package com.shinhan.day04;

// 이 BookMgr 클래스는 Service의 느낌이다
// Service : Business logic을 구현 
public class BookService {

	// 1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다.
	BookVO[] booklist;

	// 2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다.
	public BookService(BookVO[] booklist) {
		this.booklist = booklist;
	}

	// 3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다.
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(BookVO book : booklist) {
			System.out.println(book.getTitle()); // ** Book 클래스의 title 변수를 가져오고 싶은데 private때문에 안 보이고, getter로 설정해준 getTitle만 보인다??
			System.out.println(book); // *** 이렇게 하면 굳이 위에처럼 book.getTitle() 과 같은 메서드 여러개를 귀찮게 치지 않아도.. 한꺼번에 내가 원하는 정보를 알 수 있다. toString을 이용해서!
		}
	}
	
	// 4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
	public void printTotalPrice() {
		int total = 0;
		for(BookVO book : booklist) {
			total += book.getPrice();
		}
		System.out.println("전체 책 가격의 합: " + total);

	}
}
