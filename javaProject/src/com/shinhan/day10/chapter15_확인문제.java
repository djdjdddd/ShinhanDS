package com.shinhan.day10;

import java.util.*;

import chapter15.Board;
import chapter15.Student;
import chapter15.Student2;

public class chapter15_확인문제 {

	public static void main(String[] args) {
		Problem10();

	}

	/*
	 * 1번. 4 2번. 3 3번. 4 4번. 3 5번. List<Board> 변수 = new ArrayList<Board>(); 6번.
	 * Map<String, Integer> 변수 = new HashMap<>(); 11번. 4 12번. 3 13번. 4
	 */

	private static void Problem10() {
//		public class Student2 implements Comparable<Student2>{ // '같은 객체끼리 비교할 메소드'를 오버라이드 해줘야 하므로 Comparable<T> 을 implements 했다!!
//			
//			public String id;
//			public int score;
//			
//			public Student2(String id, int score) {
//				this.id = id;
//				this.score = score;
//			}
//
//				
//			// Student의 score 필드값을 기준으로 자동 정렬되도록 구현하고 싶다. 
//			// => **왜냐면 Student2 클래스, 객체엔 뭘, 어떻게 비교할지에 대한 기능 자체가 없는 상태이기에 추가해줘야 한다. 
//			@Override
//			public int compareTo(Student2 obj) {
//				return score - obj.score; // 이런 식으로 o1 - o2 하면 Ascending
//			}
//			
//			// TreeSet의 last() 메소드를 호출했을 때 가장 높은 score의 Student객체가 리턴되도록 하고 싶다. 
//			
//
//		}
	}

	private static void Problem8() {
//		public class Student {
//			
//			public int studentNum;
//			public String name; 
//			
//			public Student(int studentNum, String name) {
//				this.studentNum = studentNum;
//				this.name = name;
//			}
//
//			
//			
//			// 여기에 코드를 작성하세요. 
//			
//			// 학번(studentNum)이 같으면 동등 객체로 보게끔 => equals(), hashCode()를 오버라이딩 (따라서 name엔 체크 안하고 만들었음)
//			@Override
//			public int hashCode() {
//				return Objects.hash(studentNum);
//			}
//
//			@Override
//			public boolean equals(Object obj) {
//				if (this == obj)
//					return true;
//				if (obj == null)
//					return false;
//				if (getClass() != obj.getClass())
//					return false;
//				Student other = (Student) obj;
//				return studentNum == other.studentNum;
//			}
//
//		}
	}

	private static void Problem7() {

//		public class BoardDao {
//			
//			List<Board> getBoardList(){
//				List<Board> board = new ArrayList<>();
//				
//				board.add(new Board("제목1", "내용1"));
//				board.add(new Board("제목2", "내용2"));
//				board.add(new Board("제목3", "내용3"));
//				
//				return board;
//			}
	}

	private static void Problem9() {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// 1. 평균점수 출력 (iterator 사용)
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			int score = map.get(it.next());
			totalScore += score;
		}
		System.out.println(totalScore / map.size());

		// 2. 최고점수 출력
		// maxScore 초기화 했으니까

		// (1) for문 이용
		for (int max : map.values()) {
			if (maxScore < max) {
				maxScore = max;
			}
		}
		System.out.println(maxScore);

		// (2) 이용
		System.out.println(Collections.max(map.values()));

		// 3. 최고점수를 받은 아이디를 출력
		System.out.println(map.containsValue(maxScore));

		if (map.containsKey(maxScore)) {
			System.out.println(map.containsKey(map.containsValue(maxScore)));
		}

		// value를 사용하여 key를 찾는 방법 (1:N)
		// 우리가 배운 내용의 반대 과정??
		// 왜냐면 우리가 배운 건 key로 value를 찾는 메소드밖에 없으니까...get() 메소드
		List<String> keyList = new ArrayList<String>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(maxScore)) {
				keyList.add(entry.getKey());
			}

		}
		System.out.println(keyList.toString());
		System.out.println("최고 점수를 받은 아이디: " + keyList);

		// 준범 풀이
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
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
