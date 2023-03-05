package com.shinhan.day08;

public class Util<K, V> {
	
	// 틀렸던 부분
	// **1. 좌 매개변수: <String, Integer> 가 아니라 <K, V> 로 해야 됐음. 
	// => 제네릭 메소드를 나타내기 위해 좌측에 <K, V> 그리고 우측에도 Pair<K, V> 
	
	// 2. 우 매개변수: String name이 아니라 => String key 
	// ★★3. 리턴 타입: Integer 아니고 V 타입을 리턴하겠다. (value값을 리턴 할 거니까)
	
	
	
	public static <K,V> V getValue(Pair<K, V> pair, String key) {
		// 해석 : 요건 정의 
		//        V 타입을 리턴하겠다.
		//                     K, V 타입을 갖는 Pair라는 놈
		
		// 리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고
		if(key.equals(pair.getKey())) {
			return pair.getValue();
		}		
		// 일치하지 않으면 null을 리턴하도록 Util 클래스와 getValue() 제네릭 메소드를 작성
		else {
			return null;
		}
	}
	
	// ? extedns 까지 쓸거면
	public static <P extends Pair<K,V>, K, V> V getValue2(P pair, String key) {
		if(key.equals(pair.getKey())) {return pair.getValue();}	
		return null;
		}
	}
	
	

