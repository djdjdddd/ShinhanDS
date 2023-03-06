package com.shinhan.day09;

// 동기화 책 예제 (611)

// Calculator는 2개의 쓰레드가 공유하는 공유영역.
import lombok.Getter;

@Getter
public class Calculator {
	
	int memory;

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "===> 메모리저장값: " + this.memory);
	}

}
