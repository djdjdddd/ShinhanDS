package com.shinhan.day11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day09.Account;

public class StreamTest {

	public static void main(String[] args) {
		f6();
	}

	
	// 책 725 ParallelStream
	private static void f6() {
		// 이번엔 stream이 아니라 parallelStream을 사용해보자. 
		// 즉, 병렬 스트림을 얻고 그걸 사용해보자.
		Account[] arr = {
				new Account("1234", "김1"),
				new Account("1235", "김2"),
				new Account("1236", "김3")
		};
		List<Account> data = Arrays.asList(arr);
		
		// (1) 
		data.stream().forEach(acc -> {
			System.out.println(acc);
			System.out.println(Thread.currentThread().getName()); // 쓰레드 이름도 얻어보자 (아마 main만 뜰 것이다)
		});
		
		// (2) 병렬 스트림(병렬 처리)으로 한 경우
		data.parallelStream().forEach(acc -> {
			System.out.println(acc);
			System.out.println(Thread.currentThread().getName());
		});
		
	}


	private static void f5() {
		Set<Account> data = new HashSet<>();
		
		data.add(new Account("1234", "김1"));
		data.add(new Account("1235", "김2"));
		data.add(new Account("1236", "김3"));
		
		data.stream().forEach(null);
	}


	private static void f4() {
		// 이미 배열이 있으니
		Account[] arr = {
				new Account("1234", "김1"),
				new Account("1235", "김2"),
				new Account("1236", "김3")
		};
		
		// 그 배열을 List 컬렉션으로 만들어봤다. (asList 메소드 이용, but 수정불가능해짐. 배열이니까)
		List<Account> data = Arrays.asList(arr);
		
		//   스트림에서  forEach를 실행할 수도 있고
		data.stream().forEach(acc -> System.out.println(acc));
		
		// 바로 forEach를 사용할 수도 있다?
		data.forEach(acc -> System.out.println(acc));
		
	}


	private static void f3() {
		Account[] arr = {
				new Account("1234", "김1"),
				new Account("1235", "김2"),
				new Account("1236", "김3")
		};
		
		Arrays.stream(arr).forEach(acc -> System.out.println("ㅇㄹㅇㄹ"));
		
	}


	private static void f2() {
		// 1. 배열
		String[] arr1 = {"자바", "웹", "front", "back", "framework"};
		
		// 1. 내부반복자를 이용하고자 한다면 먼저 stream을 얻어야 한다. (배열이니까 Arrays에 있다)
		Stream<String> st = Arrays.stream(arr1); // 리턴 타입은 Stream<String> 이겠죠?
		
		// 2. 내부반복자로 값을 처리해보자.
		Consumer<String> consumerFunc = (s) -> { // (1) 처리할 내용을 변수 consumerFunc에 넣어주고
			System.out.println(s + "***");
		};
		
		st.forEach(consumerFunc); // (2) forEach라는 메소드를 통해 처리(변수 consumerFunc에 담긴)를 해주고 있는 모습. 
		// stream에 있는 여러 기능 중 forEach를 쓴 경우임.
		
	}


	// 배열로부터 스트림 얻기
	private static void f1() {
		// 1. 배열
		int[] arr1 = new int[] {100,30,70,20,50};
		
		// Arrays로부터 stream을 부를 수 있다.
		// forEach는 stream 안에 있는 메소드
		Arrays.stream(arr1).forEach(a -> System.out.println(a)); // forEach( Consumer가 들어가는데 ) : Consumer, 내가 값을 주면 소비해라
	
		// original stream
		IntStream is = Arrays.stream(arr1);
		//
		IntConsumer func1 = (a) -> {
			System.out.println("a = " + a);
		};
		is.forEach(func1);
	
	}

}
