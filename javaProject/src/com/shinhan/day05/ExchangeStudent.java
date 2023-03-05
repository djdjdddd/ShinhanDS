package com.shinhan.day05;

import java.util.Arrays;

public class ExchangeStudent extends Student {

	// language 변수를 쓰기 위해 추가하였음.
	private String[] language;

	public ExchangeStudent() {
		super(); // 이렇게 만들면 에러가 난다. 왜? '부모 클래스에 기본생성자가 정의되지 않아서!'
					// 해결 (1)부모에서 기본생성자 정의, (2)명시적으로 부모생성자를 호출
					// (2)번으로 해결한 사례임.
	}

	public ExchangeStudent(String stdId, String name) { // <- 여긴 변수 선언
		super(stdId, name); // <- 따라서 여긴 사용만 하면 되니까 이렇게 쓰는 것 (String 안 붙이고)

	public ExchangeStudent(String stdId, String name, String[] language) { // <- 여긴 변수 선언
		super(stdId, name);
		// this.setStdId(stdId); 위의 부모 생성자 호출(super)을 안 했다면 이렇게 내가 따로 불러줘야 하는데, 이는 비효율적
		// this.name = name;
		this.language = language;
	}

	void display() {
		System.out.println(getClass().getSimpleName() + "에서 추가된 메서드"); // 일종의 예시, .getClass .getSimpleName 사용한
	}

	@Override
	public String toString() {
		return "ExchangeStudent [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}

	
	
	
	
}
