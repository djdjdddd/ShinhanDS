package com.shinhan.day10;

/**
 * 단답형
 * 1) 4
 * 2) 3
 * 3) 4
 * 4) 3
 * 5) List<Board>, ArrayList<>();
 * 6) Map<String, Integer>, HashMap<>();
 * 11) 4
 * 12) 3
 * 13) 4
 */
​
// 7)
class BoardDao {
	List<Board> getBoardList() {
		List<Board> board = new ArrayList<>();
		board.add(new Board("제목1", "내용1"));
		board.add(new Board("제목2", "내용2"));
		board.add(new Board("제목3", "내용3"));
		return board;
	}
}
​
// 8)
class Student08 {
	public int studentNum;
	public String name;
	public Student08 (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	// 8)
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student08 other = (Student08) obj;
		return studentNum == other.studentNum;
	} // 여기까지 8번
}
​
// 9)
class P9 {
	void p09() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		 
		String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0;   // 최고 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
//		=============p09===============
		for (String key : map.keySet()) {
			int score = map.get(key);
			if (maxScore < score) {
				maxScore = score;
				name = key;
			}
			totalScore += score;
		}
		System.out.println("평균 점수: " + (totalScore / map.size()));
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
	}
}
​
// 10)
class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student (String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public int compareTo(Student otherStudent) {
		return score - otherStudent.score;
	}
}

public class Chapter15_슬랙참조 {

}
