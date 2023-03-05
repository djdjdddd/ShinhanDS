package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = {"kind"}) // kind가 같으면 동등한 객체라고 따로 선언해주는 코드!!
@Setter
@Getter
@ToString
@AllArgsConstructor
@Data // 얘만 하면 AllArgs 는 안 만들어지는 듯. 
public class Product<t, MA> { // 타입 이름으론 뭘 줘도 무방.
	
	t kind;
	MA model;

}
