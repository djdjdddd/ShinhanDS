package com.shinhan.day09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 14.9 스레드풀 (627~632 예제)

public class ThreadPoolTest {
	
	// (2) Callable 인터페이스 구현하여 thread사용해보자. (return 있음)
			private static void f2() {
				
			}
			
	
	public static void main(String[] args) {
		
		f2();
		
		
		
		
	
		
		// (1) Runnable 인터페이스 구현하여 thread사용해보자. (return 없음)
	private static void f1() {
			
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com"; // 메일 보내는 사람
			mails[i][1] = "member" + i + "my.com"; // 받는 사람
			mails[i][2] = "신상품 입고...";
		}
		
		ExecutorService service = Executors.newFixedThreadPool(5); // **스레드를 5개 만들겠다??
		
		for(int i=0; i<1000; i++) {
			
			int index = i; // *
			
			service.execute(new Runnable(){ // 익명객체 만들어서 실행하였음. (5개씩이나 클래스 만드는 건 에바니까..)
				@Override
				public void run() {
					String tname = Thread.currentThread().getName();
					System.out.println(tname + 
							" from " + mails[index][0] + // *익명객체에 의해 inner class... 따라서 mails[i] 하고 싶지만 i가 final의 특성을 갖게 된다. (그게 지역변수의 특징. 값이 한번 쓰이면 final 특성을 갖게 되버리는)
							                             // 따라서 i를 index에 넣어서 따로 사용해줬다고 함. 
							                             // 쥰내 복잡하네;;;;;;;;;;;;;
							"to" + mails[index][1] +
							"content :" + mails[index][2]);
					
				} // **이렇게 하면 1000번을 반복해도 쓰레드는 5개까지밖에 생성 X
			});
		}
		
	}

	
	}

	

}

