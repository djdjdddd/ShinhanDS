package com.shinhan.day08;

public class Adder {
	
	public static void main(String[] args) {
		Adder adder = new Adder();
		String expr = "3+5+9+1";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "11+45+77+3";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "33+51+12+11";
		System.out.println(expr + "=" + adder.execute(expr));
	}
	
	public int execute(String expr) {
		int result = 0;
		String strNum = ""; // 
		for (int i=0; i<expr.length(); i++) { // 문자열의 길이만큼만 반복하면 되니까 => expr.length()
			char c = expr.charAt(i); // 문자열 i번째마다 '문자'로 바꿔줄 거니까 => expr.charAt(i)
			if (c == '+') {
				result += Integer.parseInt(strNum);
				strNum = ""; // (??) 
			} else {
				strNum += c; // (??) + 가 아니면 각 문자를 더해줘야 하니까 => 1 0 0 (+) 5 1 ...
			}
		}
		return (result +Integer.parseInt(strNum)); // (??) 또 정수형으로 바꾼 뒤에 더해줘야 하니까 (라고는 하는데 잘 이해는 안되네?) (연산자 뒤에 오는 마지막 숫자를 바꿔주려고 그러는 건가?)
	}
}

//[클래스 실행결과]
//3+5+9+1=18
//11+45+77+3=136
//33+51+12+11=107
