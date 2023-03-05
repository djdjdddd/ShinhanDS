package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class Car implements Comparable<Car>{

	
	public Car(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	// 이번엔 '가격'으로 분류할 수 있게끔 해보자.
	@Override
	public int compareTo(Car obj) {
		
		int result = price - obj.price;
		
		if(result == 0) { // == 0 : 만약 car 가격이 서로 같을 때를 대비해서 모델명으로도 분류할 수 있게끔 해보자.
			return obj.model.compareTo(model);
			
		}
		return result;
	}
	
	String model;
	int price;
	
	
}
