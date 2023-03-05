package com.shinhan.day05;

public class CarTest {
	
	void go(Tire tire) { // Tire tire 이렇게 해야,  'KumhoTire tire 또는 HankookTire tire' 이런 식으로 해버리면 유지보수가 힘들다. 
		
		tire.roll();
		
		// 이렇게 아래처럼 하면 안 되고
		// KumhoTire kum = (KumhoTire)tire;
		
		// 이렇게 해라!
		if(tire instanceof KumhoTire) {
			KumhoTire kum = (KumhoTire)tire;
			System.out.println(kum.intro);
			kum.method2();
		
		}else if(tire instanceof HankookTire) {
			HankookTire han = (HankookTire)tire;
			System.out.println(han.info);
			han.method1();
		}
	}

}
