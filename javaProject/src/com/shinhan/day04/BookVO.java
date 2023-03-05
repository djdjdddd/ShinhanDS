package com.shinhan.day04;


// Book 클래스엔 '속성'만, BookMgr 클래스엔 '동작'만을 구분했다.

// 이렇게 Book처럼 업무로직이 없는 클래스를 일컬어서
// VO(Value Object) : data를 저장하는 가방이라는 뜻
// DTO(Data Transfer Object) : data를 저장해서 전송하려는 목적으로 만든 클래스라는 뜻
// (ex) BookVO, BookDTO 이렇게 쓴다.
// => *멤버변수는 private으로 설정하고, 멤버메서드는 public으로 설정한다.

// *JspSevlet, Spring, Mybatis framework에서 사용된다.
public class BookVO {

	private String title;
	private int price;
	
	// 책이 몇 권 있는지 궁금한데?
	static int count; // ***** 이렇게 선언하고
	
	// 책 252~255
	// (1) final 변수 : 수정불가 (★한번 초기화하면 값을 바꿀 수 없어! 라는 뜻)
	final String isbn = "12345"; // $방법1. 선언할 때 초기화 해도 되고
	final String isbn2;
	// final : 변수(값수정 불가), 메서드(오버라이드 불가), 클래스(상속 불가)
	
	// (2) static final : 수정불가 & 상수 (★이렇게 하면 상수pool에 들어간다는 뜻)
	static final String PUBLISHER = "한빛"; // 1. 이렇게 선언시 초기화하는 게 일반적 (관례상 상수는 대문자로 쓴다)
	
	
	// 3. 멤버변수를 모두 초기화하는 생성자 메서드가 있어야 한다. 
	// 이번엔 우클릭으로 생성자 만드는 방법 이용해봤음.
	public BookVO(String title, int price) {
		super();
		this.title = title;
		this.price = price;
		count++; // ***** 생성자에 추가해줬다. (수량 체크하고 싶어서)
		         // 이렇게 되면 생성자가 생성될 때마다 체크가 되겠다??
		isbn2 = "67890"; // $방법2. 생성할 때 초기화 하는 방법도 있고
	}
	
	// 4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
	// ★ '설정'할거면 : setter 필요 
	// ★ '리턴'할거면 : getter 필요
	// 마찬가지로 우클릭으로 만들었음.
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	// *** 여기서도 toString 이용해보자.
	// '주소'가 아닌 '정보'를 편하게 얻기 위해
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + "]";
	}
	
}
