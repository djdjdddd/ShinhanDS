package com.shinhan.day09;

public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		f10();
	}

	private static void f10() {
		AutoSaveThread t1 = new AutoSaveThread();
		
		t1.setDaemon(true); // *setDaemon은 기본값이 false인가 봄??
		                    // setDaemon을 호출하면 이 스레드를 데몬으로 만듦. 
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main end"); // main이 종료되면 데몬 스레드도 종료됨. 
	}

	private static void f9() {
		SafeThread2 t1 = new SafeThread2();

		t1.start();

		// 그냥 3초 미루려고 쓴 코드. (별 의미 없음)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t1.interrupt();

	}

	private static void f7() {
		SafeThread t1 = new SafeThread();

		t1.start();

		// 그냥 3초 미루려고 쓴 코드. (별 의미 없음)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		t1.stop(true); // **이제는 deprecated된 코드. 
		t1.setStop(true); // **조건문을 이용한 이 방법을 쓰는게 바람직하다.
	}

	// 책 예제 615
	// Thread에서 다른 쓰레드에 신호 보내는 함수 사용 예제 : wait(), notify()
	private static void f6() {
		WorkObject obj = new WorkObject();
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);

		t1.start();
		t2.start();
	}

	// ppt 예제 (성춘향, 이몽룡)
	private static void f5() {
		ShareArea share = new ShareArea(new Account("12345", "이몽룡", 2000), new Account("98453", "성춘향", 1000));

		TransferThread t1 = new TransferThread(share);
		PrintThread t2 = new PrintThread(share);

		t1.start();
		t2.start();

	}

	// 동기화 예제 (611)
	private static void f4() {
		// 익명 thread로 만들어보자 => 실패..
//		Thread t1 = new Thread() {
//			Calculator calculator;
//			void setCalculator(Calculator calculator) {
//				this.calculator = calculator;
//			}
//			
//			@Override
//			public void run() {
//				calculator.setMemory(100);
//			}
//			
//		};

		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();

		// Calculator는 공유영역 (2개의 쓰레드 t1, t2가 공유하는)
		Calculator cal = new Calculator();
		t1.setCalculator(cal);
		t2.setCalculator(cal);

		t1.start();
		t2.start();
	}

	// 동기화 (공유영역을 하나의 쓰레드가 사용 중일 때 다른 쓰레드가 접근하지 못하게)
	private static void f3() {

		// 공유영역인 BathRoom을 만들었음.
		BathRoom bathRoom = new BathRoom();

		BathThread t1 = new BathThread(bathRoom, "김씨");
		BathThread t2 = new BathThread(bathRoom, "박씨");
		BathThread t3 = new BathThread(bathRoom, "정씨");
		BathThread t4 = new BathThread(bathRoom, "최씨");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	// join 예제
	private static void f2() {
		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);
		t1.start();
		t2.start();

		// t1.join() : join 메소드를 호출한 쓰레드는 일시정지 상태가 된다.(즉 t1이 일시정지 되었다가)
		// : 실행대기 상태가 되려면 join 메소드를 가진 쓰레드(t1)가 종료되어야 한다.
		try {
//			Thread.sleep(3000); // 왜냐면 sleep(시간) 으로 기다리기엔 너무 명확하지가 않으니 join을 썼다.
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(t1.getSum() + t2.getSum()); // getter를 이용해서 Sum 값을 얻어내보자.
		System.out.println("main 끝");
	}

	// yield 예제
	private static void f1() throws InterruptedException {
		WorkThread t1 = new WorkThread("[쓰레드A]"); // 이렇게 new만 한다고 해서 쓰레드가 곧바로 실행되는 게 X
		WorkThread t2 = new WorkThread("[쓰레드B]");

		t1.start(); // 이렇게 start() 함수를 이용해서 따로 실행을 시켜줘야 한다.
		t2.start();

		// 5초간 일시정지
		t1.sleep(5000);
		// t1의 work를 false로
		t1.work = false; // 이로 인해 t1 쓰레드가 다른 쓰레드에 양보하게 됨.
		// 10초 후
		Thread.sleep(10000);
		// t1의 work를 true로
		t1.work = true;
	}

}
