package com.shinhan.day08;

import java.util.Objects;

public class MySum {
	
	int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;

        
       
    }

	@Override
	public String toString() {
		// return "MySum [first=" + first + ", second=" + second + "]";  //기본적으론 이렇게 찍힘 (우클릭으로 자동으로 만들면)
		// return first+second+""; // (1) 잔머리
		return String.valueOf(first+second); // 정석적인 방법?
		
		// .valueOf(arg) 함수 : Returns the string representation of (넣어준 값, int면 int, double이면 double 등등)
	}

	

	@Override
	public boolean equals(Object obj) {
		MySum my = (MySum)obj;
		
		// (1) 이 방법도 있고
//		return first+second == (my.first + my.second);
				
		// (2) 이런 방법도 있다.
		// this의 toString과 my의 toString을 비교하는
		return toString().equals(my.toString()); 
	}

		// (3) 자동으로 만들어서 하는 방법
	
    
    
    
    
}
