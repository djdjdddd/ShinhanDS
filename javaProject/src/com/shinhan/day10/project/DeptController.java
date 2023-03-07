package com.shinhan.day10.project;

import java.util.List;

// Controller : 사용자의 요청을 받아서 Service에 보낸다. 
//              Service의 응답결과를 이용해서 view를 통해 display한다. 
public class DeptController {
	
	
	public static void main(String[] args) {
		
		// 사용자의 요청을 받아서 Service에 보내줘야 하므로
		DeptService deptservice = new DeptService();
		
		DeptVO[] arr = { // 이건 그냥 예시를 위해 여기서 직접 넣은 듯? (원래는 DB에서 정보를 가져와야 하는 건데?)
				new DeptVO(10, "개발부", 100, 1700),
				new DeptVO(20, "영업부", 100, 1700),
				new DeptVO(30, "총무부", 100, 1700),
				new DeptVO(40, "R&D", 100, 1700),
				new DeptVO(50, "SI사업부", 100, 1700),
		};
		
		// 사용자의 요청: 입력
		for(DeptVO dept : arr) {
			deptservice.insert(dept);
		}
		
		// 사용자의 요청: 조회
		List<DeptVO> deptlist = deptservice.selectAll(); // 조회하고
		DeptView.print(deptlist); // 출력하고
		
		// 사용자의 요청: 찾기
		DeptVO searchVO = deptservice.selectById(40); // 찾고
		DeptView.print(searchVO); // 출력하고
	}

}
