package com.shinhan.day05;

public class 김용희6장 {
	
	
	// 문제 13, 14
	class Member{
		String name;
		String id;
		String password;
		int age; // 왜 에러가 나지?
		
		name = 이름;
		id = 아이디;
		password = 패스워드;
		age = 0;
		
	}
	
	// 문제 15.
	class MemberService{
		
		boolean login(String id, String password){
			
			if(id.equals("hong") && password.equals("12345")) { // 습관적으로 , 를 썼는데... 그게 아니라 '&& ||' 이런 걸 써야 함
				System.out.println("로그인 되었습니다");
				return true; // boolean 타입으로 return 해야 하니까 => ' return true; '
			}else {
				System.out.println();
			}
		}
		
		void logout(String id){
			System.out.println(id + "님이 로그아웃 되었습니다");
		}
	}
	
	
	
	}
	
}
