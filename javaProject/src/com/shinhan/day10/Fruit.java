package com.shinhan.day10;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@EqualsAndHashCode
public class Fruit implements Comparable<Fruit>{
	
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit obj) {
		int result1 = this.price - obj.price;
		if(price == obj.price) {
			int result2 = name.compareTo(obj.name);
			return result2;
		}
		return result1;
	}

	@Override
	public String toString() {
		return "과일의 종류는 " + name + ", 가격은 " + price + "원";
	}
	
	

}
