package com.shinhan.day10.project;

import java.util.ArrayList;
import java.util.List;

import com.shinhan.day08.Car;

// Service를 만들고 있다. 
// Service : Controller가 요청한 정보를 DAO로 전달하고
//           DAO에서 응답 받은 내용을 Controller에 다시 전달하는 역할.
//           DB 상관없는 Business logic을 수행한다. 
public class DeptService {
	
	private DeptDAO dao = new DeptDAO(); // 
	
	// 아래 함수들은
	// Controller가 요청한 정보를 DAO에 전달하기 위해 있는 걸까?
	// DAO에서 응답 받은 내용을 Controller에 다시 전달하기 위해 있는 걸까?
	List<DeptVO> selectAll() {
		return dao.selectAll();
	}
	
	DeptVO selectById(int deptid){
		return dao.selectById(deptid);
	}
	
	void insert(DeptVO dept){
		dao.insert(dept);
	}
	
	
}
