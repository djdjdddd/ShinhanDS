package com.shinhan.day10;

// 이렇게 여러개 쓰지 않고 한번에 쓰고 싶으면 *을 이용
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.shinhan.day09.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class CollectionTest1 {

	public static void main(String[] args) throws IOException {
		f7();
	}

	
	// Properties (책 662)
	private static void f9() throws IOException {
		// 먼저 Properties 객체 생성
		Properties p = new Properties();
		// load 메소드로, 파일의 내용을 메모리로 로드
		p.load(CollectionTest1.class.getResourceAsStream("oracle.properties"));
		// 키를 주면 값이 리턴
		p.getProperty("yong");
		System.out.println(driver);
		
	}


	// Map : 키와 값의 쌍(Entry)이다. 
	// Map : HashMap, HashTable
	private static void f7() {
		// Key는 Set이다. (키는 set이므로 중복불가★★)
		// Set은 add시에 동등객체인지 확인. 만약 동등하면 add 불가
		// Map은 put시에 key를 찾는다. 동등한 걸 찾으면 값을 replace한다. 없으면 무조건 추가.
		
		HashMap<String, Integer> data = new HashMap<>(); // generics 쓰라고 추천해주네 이클립스가. <K, V>로
		
		data.put("김", 50); // Map은 add가 아니라 put 
		data.put("ㅂ", 90);
		data.put("ㅈ", 97);
		data.put("ㅇ", 94);
		data.put("김", 100);
		data.put("김", 200);
		
		System.out.println("키가 중복되면 마지막값만 유효 " + data.get("김")); // key가 중복되면 마지막값(value)이 유효함. (50도 100도 아니고 200)
		                                   // .get(Object key) : 입력한 key에 해당하는 value값을 리턴함. 따라서 "김"을 넣어줬음.
		
		// 1. 일반 for : 불가, 왜냐면 index불가 (key는 set이라 순서가 없음)
		
		// 2. 향상 for (1)**
		// entry는 1건을 의미, entrySet은 여러건을 의미. (그래서 entrySet을 entry에 넣은 거구만)
		for(Entry<String, Integer> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
		
		// 2. 향상 for (2)*
		// keySet()을 이용해서도 할 수 있다. 이게 훨씬 쉽네
		for(String key : data.keySet()) { // 키들(keySet)을 키(key)에 하나씩 집어 넣고
			System.out.println(key + " ==> " + data.get(key)); // value를 얻기 위해선 get(key 이름) 이용하면 되자너
		}
		
		// 3. iterator()
		Iterator<String> it = data.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); // *유의) next를 쓸때마다 순서가 다음으로 넘어가니까 여러번 안 쓰도록 
		}
		
		
		// 키 찾기, 값 찾기 (마찬가지로 containsㅁㅁ)
		System.out.println("키 찾기: " + data.containsKey("김"));
		System.out.println("값 찾기: " + data.containsValue("97"));
	}


	// Set (인터페이스) : HashSet, TreeSet (구현 클래스, 구현 객체)
	private static void f5() {
		// 순서X, 중복X (수학의 집합, 주머니 개념)
		// 단, TreeSet은 순서 있음. (그게 Tree니까,,)
		Set<String> data = new HashSet<>();
		
		data.add("월요일");
		data.add("ㅎ요일");
		data.add("ㅅ요일");
		data.add("ㅁ요일");
		data.add("월요일");
		
		// 객체를 검색해서 가져오는 방법이 여러가지가 있는데
		// 1. 일반 for
		// 2. 향상 for (얘도 사실 내부반복자 써서 만든거다)
		// 3. iterator (내부반복자)
		
		
		// 1. 일반 for : Set은 불가(TreeSet은 되냐??), 순서가 없으므로 index 사용 안됨.
		
		// 2. 향상 for 
		for(String week : data) {
			System.out.println(week); // 출력해보면 순서가 없다는 게 느껴진다.
		}
		
		// 3. iterator
		Iterator<String> it = data.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// *(책 651~652) String 같은게 아니라 객체를 상대로 HashSet 쓸때 제대로 작동하게 하려면 꼭 equals와 hashCode 재정의 해줘야 한다. 
		// ex) Account 객체라면 Account 클래스에 equals, hashCode 재정의 돼있어야 한다는 것. 
		
		
		// *원하는 객체 찾기 (contains 이용)
		String searchData = "ㅅ요일"; // 내가 찾고자 하는 searchData가 "ㅅ요일"이라고 지정해주고
		boolean result = data.contains(searchData);
		System.out.println(result? "찾음" : "not found");
		
	}


	// 
	private static void f4() {
		// ArrayList는 중간의 data를 삽입하거나 삭제시 앞으로 당기는 것때문에 처리가 느리다.
		// 그래서 이럴땐 LinkedList를 쓴다.
		
//		List<Account> data = new ArrayList<>();
		List<Account> data = new LinkedList<>();
		
		long start = System.nanoTime(); // 여기서 start에 대입하고 (나노초로)
		
		for(int i=1; i<=100000; i++) {
			data.add(new Account(i+"", "홍"+i, 100));
		}
		
		for(int i=100; i<200; i++) {
			data.remove(0); // .remove()
		}
		
		long end = System.nanoTime(); // 여기서 end에 대입해서 
		                              // start와 end 사이의 코드가 실행되기까지 몇초가 걸렸는지 잰 것임. 
		System.out.println("걸린시간 : " + (end-start)); // 숫자 괄호 꼭! (안그럼 문자열 더하기로 돼버림..)
	}



	// (2) Vector
	// **벡터는 멀티스레드에 안정적... 왜냐면 동기화된 메소드로 구성됐기에
	private static void f3() {
		// (책 644 예제)
		// 2000건을 add하고자 한다. 2개의 흐름(스레드)을 만들어서 각자 1000건씩 넣고자 한다.
		
		List<Account> data = new ArrayList<>(); // **따라서 이런 상황(멀티 스레드 환경)에선 ArrayList 대신 Vector를 쓰면 좋다.
		
		long start = System.nanoTime(); // 이건뭐냐? Time 클래스인가?
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		
		Thread t1 = new Thread() { // 이렇게 만들어도 되고 or Thread t1 = new Thread(new Runnable() {run() 오버라이드} );
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.add(new Account(i+"", "홍"+i, 100));
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.add(new Account(i+"", "박"+i, 100));
				}
			}
		};
		
		t1.start();
		t2.start();
		
		// .join 안하고 그냥 했더니 스레드(t1, t2) 다 끝나기도 전에 syso 실행해버려서 0건이 저장됐습니다. 라고 떴음.
		// 따라서 스레드 끝날 때까지 기다리는 join 메소드 사용한 거임. 
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(data.size() + "건이 저장됐습니다."); // **2000건이 아니라 매번 건수가 달라짐. 
		                                                    // 그 이유는 (책 647 설명)
		
		
		long end = System.nanoTime();
		System.out.println(end-start);
		
	}


	// *따라서 이렇게 generics를 쓰는게 바람직.
	private static void f2() {
		List<String> data = new ArrayList<>();

//		data.add(100);
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");
//		data.add(new Account("1234", "홍", 1000)); 

		System.out.println(data.size() + "개"); // .size() : element의 개수를 리턴
		
		// 1. 일반 for
		for(int i=0; i < data.size(); i++) {
			System.out.println(i + "번째: " + data.get(i)); // .get(i) : i번째 position에 위치한 element를 리턴
			
		}
		
		// 2. 향상 for
		for(String i : data) {
			System.out.println(i); // 요건 대신 위에처럼 "i번째" 이렇게는 못 나타겠네 ㄲㅂ
		}
		
		// 3. 내부반복자(iterator()) 사용
		Iterator<String> it = data.iterator(); // 커서 올리니 리턴 타입이 Iterator라고 떠서 대입해줬음. 
		                                       // Iterator<T> it = 
		// Token에서 배웠던 것처럼 while문을 이용하여 아래처럼 코드를 짠다고 함. (책 523) 
		while(it.hasNext()) { // hasMoreTokens와 유사 <= '다음 값이 존재하냐?' (남아있는 문자열 여부를 물어봤던 hasMoreTokens처럼 다음 값이 존재하냐?의 hasNext
			String s = it.next(); // nextToken 과 유사 <= '값을 하나씩 가져옴' (다음 값을 가져오라는 뜻의 next)
			System.out.println(s);
		}
	}

	
	// 1. List (인터페이스) : ArrayList, LinkedList, Vector (구현 클래스, 객체)
	private static void f1() {

		List data = new ArrayList();

		data.add(100);
		data.add("자바");
		data.add(new Account("1234", "홍", 1000)); // 심지어 객체도 들어가네

		int a = (Integer) data.get(0); // 뜻 : 0번째의 값을 get하겠다. (다만, Object to Integer 형변환 필요하다고 뜸)
		String s = (String) data.get(1);
		String acc = (String) data.get(2);
		// *다만 이렇게 generics를 사용하지 않는 건 => 바람직하지 않다! (컴파일시엔 오류 안 떠도 실행시에 뜰 수 있다)
	}

}
