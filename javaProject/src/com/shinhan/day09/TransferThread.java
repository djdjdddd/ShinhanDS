package com.shinhan.day09;

// 이몽룡 계좌에서 성춘향 계좌로 100만원을 이체한다. (12번 반복)
public class TransferThread extends Thread{ // Thread로 사용하고 싶으니까 'extends Thread'

	ShareArea share;
	
	public TransferThread(ShareArea share) {
		this.share = share;
	}

	@Override
	public void run() {
		for(int i = 0; i < 12; i++) { // 12번 이체할 거라고 했으니까 for문장
			
			synchronized(share) { // **for 전체에 락을 걸어버리면 12번 반복이 끝나기 전까지는 실행이 안되니까??
				                  // **이렇게 "출금과 입금이 완전히 끝나기까지만" synchronized 락을 걸었다.
			
			// 출금한다.
			int amount = share.lee.withdraw(100); // withdraw 함수가 return타입이 int형이라서 이와같은 코드 가능
			System.out.println("lee계좌에서 " + amount + "출금");
			// 입금한다.
			share.sung.deposit(100);
			System.out.println("sung계좌에 " + amount + "입금");

			}
		}
	}
	
	
}
