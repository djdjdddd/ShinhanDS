package com.shinhan.day06;

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


public class DiceGame {

	public static void main(String args[]) {
		
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) {
		
		int count = 0; // 책 66 복습...(변수 사용 범위) 쥰내 헷갈리네 
		               // 얘는 지역변수? 멤버변수? 이름이 뭐임?
		
		// 면이 8개인 주사위 2개를 생성한다.
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		
		// 주사위 2개를 동시에 n번 던졌을 때, 같은 눈이 나오는 횟수를 계산한다.
		dice1.play();
		dice2.play();
		
		for(int i = 0; i < n; i++) {
			if(dice1.play() == dice2.play()) {
				// 난 처음에 여기다가 int count = 0; 이라고 할라 했는데
				// 오늘 배운 지역변수는 "값이 쓰일 때 final의 특성을 가진다..."
				// 따라서 값이 변하는 count를 쓸 거면 {블럭 내부}가 아닌 밖에다가 변수를 선언(int count;) 및 초기화(count = 0;) 해야 한다.
				// (cf. 변수는 쓸려면 꼭 초기화를 해야...)
				
				count += 1; // ★★★내가 헷갈렸던 건 '1'이 아니라 'i'를 넣었던 건데, 이렇게 되면 i번째 이건데 
				            // 값이 똑같은 경우의 수를 셀 거면 i가 아니라 1을 더해야 한다. 
				            // i를 쓰는 건 => i번째 (ex. 3번째, 7번째가 같았으면 3과 7을 더해버리겠지 빠가야로야)
		}
		}
		return count;
	
	}

}
