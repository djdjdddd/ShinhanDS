package com.shinhan.day09;

// 14.5 쓰레드 상태
// yield() 예제

public class WorkThread extends Thread{
	
	public boolean work = true;
	
	public WorkThread(String name){
//		super(name); // 이렇게 이름을 줘도 되고
		setName(name); // setName으로 이름 줘도 되고
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + "...작업처리");
			}else {
				Thread.yield(); // 다른 쓰레드에게 실행을 양보하고, 실행 대기 상태가 된다. 
			}
		}
		
	}

	
}
