package com.shinhan.day03;

public class EnumTest {
	
	// 상수: 고정값
	final static double PI = 3.141592; 
	// final : 상수, 즉 값을 바꿀 수 없다?
	// static : 객체를 생성하지 않아도 메모리에 올라가서 ???
	
	static final int MONDAY = 1; // 상수는 대문자로!!
	static final int SUNDAY = 2;
	static final int SUCCESS = 2;
	

	public static void main(String[] args) {
		// 5.12 열거(Enum) 타입 (책 194)
		
		// Enum : ★관련있는 상수들의 묶음!! (ex. 요일, 로그인 성공 여부 등)
		
		// 예를 들어, 위처럼 요일에 대한 값과 성공 여부에 대한 값이 서로 같은 경우가 있을 수도 있잖슴?
		// 그래서 Enum을 써서 '관련있는 것들만 묶는다'
		// 생성 방법 : 클래스 만들 듯이 Tree에서 새로 만들면 된다. 
		
		f4();
		f3();
		//f2(LoginEnum.FAIL);
	}

	private static void f4() {
		
	}

	private static void f3() {
		WeekEnum[] weeks = WeekEnum.values(); // .values() : 값들을 다 가져오라는 함수
		
		for(WeekEnum week : weeks) {
			System.out.println(week.ordinal() + "=>" + week.name());
			String weekName = f4(week);
			System.out.println(weekName);
			System.out.println("**************************");
		}
	}

	private static String f4(WeekEnum week) { // 매개변수를 int 이런게 아니라 WeekEnum 타입을 따로 만들어준 거임. 우리가 직접
			                                  // 그러면 week == "     " 에 들어갈 값들이 우리가 정해준 MONDAY ~ SUNDAY 만 가능하므로
		                                      // 에러가 날 확률이 적겠
		
		String result = null;
		
		if(week == WeekEnum.MONDAY) {
			result = "월요일";
		}
		if(week == WeekEnum.TUESDAY) {
			result = "화요일";
		}
		if(week == WeekEnum.WEDNESDAY) {
			result = "수요일";
		}
		
		return result;
	}

	private static void f2(LoginEnum login) {
		// Enum(열거)으로 따로 묶어줬기 때문에 
		// 우리가 정한 SUCCESS 와 FAIL 만 있지
		// SUNDAY가 있진 않다. 
		
		System.out.println(login == LoginEnum.SUCCESS);
		System.out.println(login == LoginEnum.FAIL);
		
		LoginEnum[] arr = LoginEnum.values(); // .values : 값들을 의미하는 듯??
		for(LoginEnum aa : arr) {
			System.out.println(aa.ordinal() + "==" + aa.name()); // .ordinal : 순서, .name : 이름
		}
	}

	private static void f1() {
		System.out.println(PI);
		
		// final로 지정된 상수니까 아래처럼 내가 임의로 바꿀 수 없다.
		// PI = 3.12;
		
		int input = 2;
		System.out.println(input == SUNDAY);
	}

}
