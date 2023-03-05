package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Container<T>{
	T data;
	
	void set(T t){
		
	}
	
	T get(){
		return data;
	}
	
	// 
//	String get(){
//		return kind;
//	}
}

public class ContainerExmaple2 {

	public static void main(String[] args) {
		Container<String> container1 = new Container<>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer>	container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}

}
