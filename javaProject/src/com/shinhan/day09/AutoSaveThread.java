package com.shinhan.day09;

// 14.8 데몬 스레드 (daemon)

public class AutoSaveThread extends Thread{

	public void save() {
		System.out.println("작업내용을 저장합니다.");
		
	}
	
	public void run() {
		while(true) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			save();
		}
	}
	
}
