package com.shinhan.day09;

import lombok.AllArgsConstructor;

//14.6 스레드 동기화 
//공용 화장실을 예시로 해서 이해해보자!

@AllArgsConstructor
public class BathThread extends Thread{
	
	BathRoom room;
	String userName;
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) { // 일부러 반복 사용하기 위해 for문 쓴 거임. 별 이유 없음.
			room.use(userName);
		}
	}
	
	

}
