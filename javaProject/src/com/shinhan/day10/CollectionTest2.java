package com.shinhan.day10;

import java.util.*;

import com.shinhan.day04.Employee;
import com.shinhan.day09.Account;

public class CollectionTest2 {

	public static void main(String[] args) {
//		f14();
		f11();
		f12();
	}

	private static void f12() {
		// (3) 배열로부터 만드는 방법
		// Arrays.asList( ) 
		
		String[] arr = {"A", "B", "C"};
		List<String> immutableList = Arrays.asList(arr); // 이렇게 Arrays 클래스를 이용한다. 
	}

	private static void f14() {
		Set<Fruit> data = new HashSet<>();
		
		data.add(new Fruit("귤2", 20000));
		data.add(new Fruit("귤1", 40000));
		data.add(new Fruit("귤4", 10000));
		data.add(new Fruit("귤3", 30000));
		data.add(new Fruit("귤5", 70000));
		
		// (2) copyOf 를 이용하여 수정 불가능한 컬렉션으로 만듦. 
		Set<Fruit> immutableList = Set.copyOf(data);
		
		// 따라서 add같은 거 못함
//		immutableList.add(null);
		
	}

	private static void f11() {
		// 15.8 수정 불가한 Collection (책 684)
		
		// 방법 1 (검증 됨) : int가 아닌 Integer(Wrapper class) 써야 함. 
		Integer[] arr = new Integer[] {100,88,99,55,80};
		List<Integer> listData = List.of(arr);
		System.out.println(arr);
		
		// 방법 2 (쌤)
		int[] arr2 = new int[] {100,88,99,55,80};
		List<int[]> listData1 = Arrays.asList(arr2);
		
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		// (1) of
		List<Integer> listData2 = List.of(arr);
		// 이렇게 unmodifiable 컬렉션으로 만들었기 때문에
		// add하게 되면 아래처럼 Exception이 난다. 
		listData2.add(10);
		
		// (2) copyOf
//		String[] arr3 = new String[] {"df", "dfdfdf", "dfkdfjkdjfk"};
//		List<Integer> listData3 = List.copyOf(arr); 
		// The method copyOf(Collection<? extends E>) in the type List is not applicable for the arguments (String[])
		// 이 오류가 뭔 말이지?
				
				
	}

	
	private static void f10() {
		// Queue (FIFO, 선입선출)
		Queue<Fruit> data = new LinkedList<>(); // ** 큐는 인터페이스라서 new LinkedList로 객체 생성 후 
		                                        // 타입을 Queue에다가 넣어서 만든다~~

		data.offer(new Fruit("귤2", 20000));
		data.offer(new Fruit("귤1", 40000));
		data.offer(new Fruit("귤4", 10000));
		data.offer(new Fruit("귤3", 30000));
		data.offer(new Fruit("귤5", 70000));

		// 따라서 출력을 해보면 "나중에 넣은 귤5"가 가장 먼저 출력된다.
		while (!data.isEmpty()) {
			Fruit f = data.poll();
			System.out.println(f);
		}
	}

	private static void f9() {
		// Stack (LIFO, 후입선출, 나중에 넣은 걸 먼저 빼는)
		Stack<Fruit> data = new Stack<>(); // ** 스택은 클래스라서 new Stack 하여 만들지만

		data.push(new Fruit("귤2", 20000));
		data.push(new Fruit("귤1", 40000));
		data.push(new Fruit("귤4", 10000));
		data.push(new Fruit("귤3", 30000));
		data.push(new Fruit("귤5", 70000));

		// 따라서 출력을 해보면 "나중에 넣은 귤5"가 가장 먼저 출력된다.
		while (!data.isEmpty()) {
			Fruit f = data.pop();
			System.out.println(f);
		}

	}

	private static void f6() {
		Set<Board> data = new TreeSet<>();

		data.add(new Board(1, "회식", "술마셔도되나요?", "jin"));
		data.add(new Board(2, "자율학습", "저녁개방", "jin"));
		data.add(new Board(3, "아침", "빨리와", "jin"));
		data.add(new Board(4, "회식", "술마셔도되나요?", "jin"));
		data.add(new Board(5, "회식", "술마셔도되나요?", "jin"));

		for (Board board : data) {
			System.out.println(board); // **출력값(비교결과)은 Comparable의 compareTo 메소드를 어떻게 구현했냐에 따라 달라짐.
		}

	}

	private static void f5() {
		TreeMap<String, Integer> data = new TreeMap<>();

		data.put("홍길동5", 88);
		data.put("홍길동1", 99);
		data.put("홍길동4", 66);
		data.put("홍길동3", 77);
		data.put("홍길동3", 100);

		for (String key : data.keySet()) { // 그냥 data만 쓰면 에러나네. ( data.keySet() 으로 )
			// 해석: 'data의 키들' 이라는 뜻
			System.out.println(key + " ===> " + data.get(key));
		}
		System.out.println("firstKey: " + data.firstKey());
		System.out.println("firstKey의 값: " + data.get(data.firstKey()));
		System.out.println("Entry의 값은 쌍으로 나온다: " + data.lastEntry());
		System.out.println("Entry의 값은 쌍으로 나온다: " + data.firstEntry());

		// TreeMap 메소드 연습
		NavigableMap<String, Integer> nm1 = data.descendingMap();

		NavigableSet<String> nm2 = data.descendingKeySet();

		for (String key : nm1.keySet()) {
			System.out.println(key + " ===> " + nm1.get(key));
		}

		for (String key : nm2) {
			System.out.println(key + " ===> " + nm2); // *nm2.get(key) 이거 자체가 안되네
														// value가 아닌 key의 값만 구할 수 있다는 게 차이점인 듯??
		}

	}

	// TreeSet 복습
	private static void f4() {
		TreeSet<Integer> scoreSet = new TreeSet<>();
		Set<Integer> scoreSet2 = new TreeSet<>(); // **당연히 이렇게 타입을 다르게 줄 수도 있긴 함.

		scoreSet.add(100);
		scoreSet.add(20);
		scoreSet.add(50);
		scoreSet.add(80);
		scoreSet.add(80);

		for (Integer jumsu : scoreSet) {
			System.out.println(jumsu);
		}

		// 다 책에 있는 메소드들 (**근데 그러면 아래 메소드를 못 쓰는 거 같더라? Set이라는 인터페이스엔 저 메소드가 없나봄?)
		System.out.println("first: " + scoreSet.first()); // 첫번째
		System.out.println("last: " + scoreSet.last()); // 마지막
		System.out.println(" > : " + scoreSet.higher(50)); // 50 초과의 수를 리턴
		System.out.println(" >= : " + scoreSet.ceiling(50)); // 50 이상
		System.out.println(" < : " + scoreSet.lower(50)); // 50 미만
		System.out.println(" <= : " + scoreSet.floor(50)); // 50 이하

		SortedSet<Integer> data1 = scoreSet.tailSet(50); // tailSet : 이상
		for (Integer i : data1) {
			System.out.println(i);
		}

		SortedSet<Integer> data2 = scoreSet.headSet(20);
		for (Integer i : data2) {
			System.out.println(i);
		}

	}

	private static void f3() {
		Set<Employee> data = new TreeSet<>();

		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원1", "인턴", 1000));
		data.add(new Employee("직원5", "대리", 2000));
		data.add(new Employee("직원6", "과장", 3000));
		data.add(new Employee("직원3", "사장", 1200));

		for (Employee s : data) {
			System.out.println(s);
		}
	}

	private static void f2() {

		Set<Account> data = new TreeSet<>();

		data.add(new Account("12", "kim", 1000));
		data.add(new Account("123", "kim55", 2000));
		data.add(new Account("1234", "kim66", 3000));
		data.add(new Account("1235", "kim77", 5000));
		data.add(new Account("12", "kim", 1000));

		// *그냥 실행하면 에러가 난다.
		// 왜? 비교를 해서 왼쪽 자식 노드에 넣을지, 오른쪽 자식 노드에 넣을지 구분해야 하는데
		// 그 기능이 결정돼있지 않아서 에러가 난 것임.
		for (Account s : data) {
			System.out.println(s);
		}

		// 따라서 (Account라는 객체끼리 비교할 거니까) Account 클래스에 Comparable 인터페이스를 구현하고
		// 그 인터페이스의 메소드 중 compareTo를 재정의해주자.

	}

	// 15.5 검색 기능을 강화시킨 컬렉션 : Tree (책 664)
	private static void f1() {
		Set<String> data = new TreeSet<>();

		data.add("월1");
		data.add("월1"); // 중복된 값은 add되지 X
		data.add("월5");
		data.add("월7");
		data.add("월2");

		for (String s : data) {
			System.out.println(s);
		}
	}

}
