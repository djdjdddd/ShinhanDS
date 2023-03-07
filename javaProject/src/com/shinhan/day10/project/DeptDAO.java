package com.shinhan.day10.project;

import java.util.*;

// CRUD 작업 
// DAO (Data Access Object)
public class DeptDAO {

	// < > 에다가 우리가 만든 VO(또는 DTO)를 넣어줄 것이기에.
	private List<DeptVO> data = new ArrayList<>();

	// 모두 조회
	List<DeptVO> selectAll() {
		// DB가서 data가져오기 code 추가될 예정. select * from departments;
		return data;
	}

	// 부서의 번호를 찾아서 return하기
	DeptVO selectById(int deptid){ // 이번엔 List 형태가 아니라 하나만 리턴하니까 DeptVO 라고 쓰더라고
//		DeptVO deptvo = new DeptVO();
//		deptvo.getDepartment_id();
		
		// 1. 반복문으로 찾아도 되고
		for(DeptVO dept : data) {
			if(dept.getDepartment_id() == deptid) return dept;
		}
		return null; // 반복 다 돌렸는데도 없으면 null을 주기 위해 썼음. 
	}

	//
	void insert(DeptVO dept) {
		data.add(dept);
	}

}
