package com.shinhan.day09;

// 두 계좌의 잔액 합계를 출력한다.(3번 반복)
public class PrintThread extends Thread{ // Thread로 사용하고 싶으니까 'extends Thread'

	ShareArea share;
	
	public PrintThread(ShareArea share) {
		this.share = share;
	}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) { // 3번 반복해서 잔액을 출력할 거니까 for문장
			
			synchronized(share) { // **마찬가지로 여기도 락
			// 잔액출력
			System.out.println("잔액은 : " + (share.lee.getBalance() + share.sung.getBalance()));
			
			}
		}
	}
	
	
}
