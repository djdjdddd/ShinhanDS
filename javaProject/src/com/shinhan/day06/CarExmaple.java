package com.shinhan.day06;

// 9장 확인 4번.

class Car{
	class Tire{}
	static class Engine{}
}

public class CarExmaple {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = myCar.new Engine(); // 아니 이거 왜 안되지?
		Car.Engine engin2 = new Car.Engine(); // 이렇게 해야 되는구나. (접근방법이 많이 다르긴 하네)
		
	}
	

}
