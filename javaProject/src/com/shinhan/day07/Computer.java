package com.shinhan.day07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// (책 507) lombok, 롬복 사용하기 -> 편하긴 하네


//2. 이렇게 @ 를 써서 내가 만들고 싶은 놈을 빠르게 만들 수 있다. (@Data 써도 되고, **방법(2) 아니면 이렇게 직접 내가 annotation 해줘도 되고)
@NoArgsConstructor // arg 없는 생성자
@AllArgsConstructor // arg 있는 모든 생성자 (ㄷㄷ;)
@Getter
@Setter
@EqualsAndHashCode(of = {"model"}) // 모델만 같으면 같다고 설정해주는 방법 ( of 를 쓰고 { } )
@ToString

@Data // (책 509 설명) **방법(1) class 선언 위에 @Data를 붙이면, 컴파일 과정에서 기본생성자와 함께 getter, setter, hashCode(), equals(), toString() 함수가 자동 생성된다!!
public class Computer {

	public Computer(String string) {
		// TODO Auto-generated constructor stub
	}
	// 1. 원래라면 private이라서 getter, setter 등 여러가지가 많이 필요할텐데...
	private String model;
	private int price;
	private String maker;
}
