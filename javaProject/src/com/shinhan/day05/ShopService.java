package com.shinhan.day05;

// 문제 18. 싱글톤 패턴을 사용해서 ShopService 클래스를 작성해보세요. 
public class ShopService {
	
	// 싱글톤 패턴 사용 (★원리를 이해하면서 코드 짜기)
	
	// 1. 
	private static ShopService singleton = new ShopService();
	
	// 2. ??? 이 코드도 필수적으로 써야하는 건가?
	
	
	// 3. 
	public static ShopService getInstance(){
		
		return singleton;
		
	}
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
			
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
