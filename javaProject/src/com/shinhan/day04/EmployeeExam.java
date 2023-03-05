package com.shinhan.day04;

// 문제 1
public class EmployeeExam {

	public static void main(String[] args) {
		
		// 배열 형태로 객체를 만든 케이스 (길이가 4짜리)
		Employee[] emps = new Employee[4];
		
		emps[0] = new Employee("이부장", "부장", 1500000);
		emps[1] = new Employee("김과장", "과장", 1300000);
		emps[2] = new Employee("최대리", "대리", 1200000);
		emps[3] = new Employee("박사원", "사원", 1000000);
		
		// 위에처럼 4개 문장 쓰는 거 너무 귀찮다.
		// for문으로 간소화시키자.
		for(Employee emp : emps) {
			// *** 이게 지금은 Employee 클래스의 getTotalSalary 함수가 private이 아니기 때문에 다른 클래스에서도 저 함수에 접근이 가능한데
			// 만약 private으로 돼있어서 접근 불가능하면(에러뜨고) => 아예 생성자에서부터 getTotalSalary 함수를 실행시키는 방법도 있다. (이게 가능한 이유는 static으로 선언된 게 없어서 그렇다는데 아직 이해는 잘 안되고만 ㅋ)
			emp.getTotalSalary(); 
			emp.print();
		}
		
	}

}
