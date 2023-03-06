package com.shinhan.day09;

import java.util.Arrays;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = {"title", "price"})
@ToString
@Setter
@Getter 
//@AllArgsConstructor
//@NoArgsConstructor
public class Book<T> extends Object implements Comparable<Book>{
	
	private T title; // *
	private int price;
	private String publisher;
	private String[] author; // 하나의 책을 쓴 사람이 여러명일 수 있으니 (공저)
	private static int count; // 개수를 세기 위해
	private static final String COMPANY = "신한출판사"; // final은 필드나 생성자에서 초기화 반드시 (SF는 거의 필드에서?)
	
	// static일 땐 Book 앞에 <T> 이게 또 있어야 하는게 why??
	public static <T> Book<T> makeBook(T title, int price) { // *
		return new Book<>(title, price, "홍대출판사", new String[] {"김경윤", "양유진"}); // 사용(new)할 때 타입을 정하기 위해 *에선 제네릭을 사용했음. 
		
		
	}
	
	@Override
	public int compareTo(Book obj) {
		return this.price - obj.price; // price는 int라 compareTo 가 없나보다. (하긴 그럴 수밖에..)
	}
	
	// title과 price가 동일하면 => 동일한 놈(객체?)으로 보기 위해 오버라이드한 hashCode와 equals
//	@Override
//	public int hashCode() {
//		return Objects.hash(price, title);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return price == other.price && Objects.equals(title, other.title);
//	}
	
	
	
	// toString 오버라이드
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", price=" + price + ", publisher=" + publisher + ", author="
//				+ Arrays.toString(author) + "]";
//	}
	
	
	// getter, setter
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//	public String[] getAuthor() {
//		return author;
//	}
//	public void setAuthor(String[] author) {
//		this.author = author;
//	}
//	public static int getCount() {
//		return count;
//	}
//	public static void setCount(int count) {
//		Book.count = count;
//	}
//	public static String getCompany() {
//		return COMPANY;
//	}
	
	// 직접 만든 생성자들
//	public Book() {}
	
	
	public Book(T title, int price, String publisher, String[] author) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.author = author;
	}

	// 롬복으로 쓴 getter, setter는 static 안 붙은 인스턴스만 만들어주나봐 
	// 그래서 따로 만들어줬음. 
	public static int getCount() {
		return count;
	} 
	
	
	
	
	
	
}
