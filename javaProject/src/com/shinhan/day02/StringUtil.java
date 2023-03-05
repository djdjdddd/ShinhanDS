package com.shinhan.day02;

// slack에 아래 코드를 조금 더 간소하게 만드는 방법 올라와 있음. (삼항연산자 이용했더라고)
// 삼항연산자를 통해 for문 여러번 쓴 걸 간소화한.

public class StringUtil {
	
	// 함수 정의 
    public static void hokeyGraphics(char cell, int size, boolean isRect) // 매개변수에 뭐가 들어올지 정해놓은 것 (그동안 빈 공간만 썼다면)
    {
        //특정 도형을 출력하는 메소드 구현
    	if(isRect) {
    		System.out.println("사각형");
    		for(int row = 1; row <= size; row++) {
    			for(int col = 1; col <= size; col++){
    				System.out.print(cell);
    			}
    			System.out.println(); // 아무것도 찍지 않고 줄만 바꾸고 싶어서 넣은 코드
    		}
    	
    	}else {
    		System.out.println("삼각형");
    		for(int row = 1; row <= size; row++) {
    			for(int col = 1; col <= row; col++) {
    				System.out.print(cell);
    		
    			}
    	
    		}
    	}
    }
    
    
   
    
    
    public static void main(String args[])  {                 
        hokeyGraphics( '@', 10, true); // 주의) 워드에서 ' 옮기면 서로 다른 문자라서 에러남. 꼭 고치자
        
    }


		
	}


