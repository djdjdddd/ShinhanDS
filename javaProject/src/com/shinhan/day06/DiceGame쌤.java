package com.shinhan.day06;

// 상속관계 : Exception <- RuntimeException <- IllegalArgumentException

class Dice {
	int size;
	Dice(int size){
		this.size = size;
	}
    int play(){
 	int number = (int)(Math.random() * size) + 1;
        return number;
    }
}


public class DiceGame쌤 {

	public static void main(String args[]) {
		DiceGame쌤 game = new DiceGame쌤();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		try {
			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("main end");
	}

	int countSameEye(int n) {

		if(n < 0) throw new IllegalArgumentException("던지는 횟수는 음수불가");
		
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			int su1 = d1.play();
			int su2 = d2.play();
			
			if(su1 == su2) {
				count += 1;
			}
		}
		return count;
		
		
		
		
	}
}
