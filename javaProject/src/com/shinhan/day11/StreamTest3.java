package com.shinhan.day11;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day09.Account;

public class StreamTest3 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		f12();
	}

	
	private static void f12() {
		int[] arr = {2,4,6,8,10,1,3,5,7,9};
		
		// allMatch
		boolean result1 =
		Arrays.stream(arr)
		.allMatch(su -> su%2 == 0); // 짝수인 놈들을 모두매칭(allMatch)하는지 여부
		System.out.println(result1); // 따라서 false 뜸
		
		// anyMatch
		boolean result2 =
		Arrays.stream(arr)
		.anyMatch(su -> su%2 == 0); // 짝수인 놈들을 하나라도 매칭(anyMatch)하는지 여부
		System.out.println(result2);
		
		// noneMatch
		boolean result3 =
		Arrays.stream(arr)
		.noneMatch(su -> su%2 == 0); // 모두 만족하지 않는지 여부를 묻는
		System.out.println(result1);
		
		
		//
		Double d =
		Arrays.stream(arr)
		.filter(su -> su % 2 == 0)
		.average()
		.orElse(0);
		
		System.out.println(d);
		
		
	}


	private static void f11() {
		List<Student> data = new ArrayList<Student>();
		
		data.add(new Student("김1", 100));
		data.add(new Student("박4", 90));
		data.add(new Student("김3", 70));
		data.add(new Student("정5", 60));
		data.add(new Student("김2", 80));
		
		// (1) 이렇게 Student에서 구현한 Comparable에 따라 sorting 할 수도 있고
		data.stream()
		.sorted()
		.forEach(st -> System.out.println(st));
		
		// (2) 내가 직접 비교방식을 부여해서 sorting 할 수도 있고 (이게 책에 나와있는 Comparator<T> 인가???)
		data.stream()
		.sorted((a,b) -> b.compareTo(a)) // **내가 부여한 비교방식
		.forEach(st -> System.out.println(st));
	}


	// 17.7 요소 정렬
	private static void f10() {
		Integer[] arr = {100,88,99,50,60};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// ★★람다식을 이용해서 정렬한 경우
		Arrays.sort(arr, (a,b) -> b-a);
		System.out.println(Arrays.toString(arr));
		
		// 어제 본 그 람다식은 안되나??
//		Arrays.sort(arr, (a1,a2) -> );
		System.out.println(Arrays.toString(arr));
	}


	// 요소를 여러개의 요소로 변환
	// flatMapXxx() 메소드
	private static void f9() {
		List<String> data = new ArrayList<>();
		
		data.add("This is Java");
		data.add("I am a best developer");
		
		// 
		data.stream()
		.flatMap(sentence -> Arrays.stream(sentence.split(""))) // sentence를 공백("")으로 split한 걸 => 배열 형태의 stream으로 매핑하고(flatMap 메소드로)
		.forEach(word -> System.out.println(word));             // 그걸 일일이 출력한 것. 
			
		
	}


	// 17.6 매핑 (element 변환)
	private static void f8() {
		int[] arr = {10,20,70,90};
		
		//
		Arrays.stream(arr)
		.asDoubleStream() // **stream으로 들어오는 element들을 Double형으로 바꿀 수 있는 메소드구만. 
		.forEach(d -> System.out.println(d));
		
		// 
		Arrays.stream(arr)
		.boxed() // 얘는 int 타입인 stream을 Integer 형태로 Boxing 해주는 메소드
		.forEach(d -> System.out.println(d));
		
	}


	// 17.5 필터링 (element 걸러내기)
	private static void f7() {
		List<Student> data = new ArrayList<Student>();
		
		data.add(new Student("김1", 100));
		data.add(new Student("박4", 90));
		data.add(new Student("김3", 70));
		data.add(new Student("정5", 60));
		data.add(new Student("김2", 80));
		
		// 점수가 70점보다 큰 놈들만 필터링 하고 싶다. 
		data.stream() // 1) 우선 stream을 구하고? 생성하고? 실행하고? 불러오고?
		.filter(student -> student.getScore() > 70) // 2) 학생의 점수를 얻고, 70점보다 큰지 비교하라는 뜻. (리턴은 boolean 타입이겠지. Predicate를 쓴 거니까)
		.forEach(s -> System.out.println(s)); // 3) ForEach : 그냥 하나씩 뽑아서 syso를 실행하고 싶어서 썼음. 별 의미없음. 
		
		
		// 이름이 김씨인 사람만 추출
		data.stream()
		.filter(student -> student.getName().startsWith("김")) // equals를 쓰려 했더니 완벽히 같은 게 없어서
		                                                      // startWith를 써서 "김"으로 시작하는 사람들을 리턴했음. 
		.forEach(s -> System.out.println(s));
		
		
		// 이름이 김씨인 사람들 중에... 평균 점수를 추출 
		// => (1)김씨로 시작하는 사람을 필터링하고, (2)**그걸 점수(int)로 타입 변환을 해줘야 하니 mapToInt
		data.stream()
		.filter(student -> student.getName().startsWith("김"))
		.mapToInt(stu -> stu.getScore()) // **
		.average()
		.ifPresent(avg -> System.out.println(avg)); // 존재할 때만 처리할거면 'ifPresent'
		                                            // 존재하지 않을 때에도 처리해줄 거면 'ifPresentOrElse'
	}


	// 17.5 필터링 (요소 걸러내기)
	private static void f6() {
		List<String> data = new ArrayList<>();
		
		data.add("홍길동1");data.add("홍길동1");data.add("홍길동1");data.add("홍길동1");
		data.add("홍길동2");data.add("홍길동2");data.add("홍길동3");data.add("홍길동4");
		
		// 중복제거 : distinct()
		// 조건 필터링 : filter()
		data.stream()
		.distinct()
		.filter(str -> str.endsWith("3")); // "3"으로 끝나는 str만 필터링한다는 뜻. (endsWith, startWith 이러한 메소드들이 있음)
		
	}


	// 책 734 예제
	private static void f5() throws URISyntaxException, IOException {
		Path path =
		Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		
		System.out.println(path);
		System.out.println(Charset.defaultCharset());
		
		Stream<String> streamData =
		Files.lines(path, Charset.defaultCharset());
		
		streamData.forEach(line -> {
			System.out.println(line);
		});
		
	}


	private static void f4() throws IOException {
		FileReader fi = new FileReader("src/com/shinhan/day11/data.txt"); // ()안에는 파일 이름을 주면 된다. (경로도 줘야 된다??)
	
		int i;
		while((i = fi.read()) != -1) {
			System.out.println((char)i);
		}
	
	}


	private static void f3() {
		
		// 내부반복자
		IntStream.range(1, 10).forEach(su -> {
			System.out.println(su + "");
		});
		// range와 rangeClosed 차이점은 '읽어보면 나오지만', 끝값을 포함할거냐 말거냐의 차이 (endinclusive와 endexclusive)
		IntStream.rangeClosed(1, 10).forEach(su -> {
			System.out.println(su + "");
		});
		
		// 외부반복자 (기존에 계속 썼던)
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}


	private static void f2() {
		List<Account> data = new LinkedList<>();
		
		data.add(new Account("123", "홍1", 1000));
		data.add(new Account("124", "홍2", 2000));
		data.add(new Account("127", "홍6", 3000));
		data.add(new Account("128", "홍5", 4000));
		data.add(new Account("126", "홍4", 5000));
		data.add(new Account("125", "홍3", 6000));
		
		// 하고 싶은 것 : 모든 계좌의 잔고의 합을 출력하기
		// (1) stream 사용 X (외부반복자 for, iterator 이용한 경우)
		int total = 0;
		for(Account acc : data) {
			total += acc.getBalance();
		}
		System.out.println("외부반복자를 이용한 합계: " + total);
	
		
		
		// (2) stream 사용 (병렬, parallel도 가능하고 속도도 빠르고 등등)
		
		// 모든 계좌 잔고의 합을 얻어보자. 
		long total2 =
		data.stream().mapToLong(account -> account.getBalance())
		.sum(); // sum의 결과가 long 타입이니까 long 타입의 total2에 넣어주고
		System.out.println("내부반복자를 이용한 합계: " + total2);
		
		// 계좌 owner의 수를 구해보자.
		long total3 = 
		data.stream().map(account -> account.getOwner()) // 해석: map(Function의 형태)니까 
		                                                 // 매개값으로 account를 내가 넣어주면
		                                                 // return값으로 계좌주를 얻겠다는 뜻 (getOwner 메소드)
		.count(); // 그렇게 얻은 계좌주의 수를 카운트하겠다. 
		System.out.println(total3);
		
		// parallelStream을 쓰면 병렬로 처리하니까 '순서가 제각각일 수 있는데', 이때 ForEachOrdered 쓰면 순서가 보장되게끔 리턴되나 봄. 
		// forEach : 순서보장 X
		// forEachOrdered : 순서보장 O
		data.parallelStream().map(account -> account.getOwner())
		.forEach(owner -> System.out.println(owner + " 예금주님"));
		
	
	
	}


	// 데이터 여러 건을 저장할 때: 배열, Collection(List, Set, Map)
	private static void f1() {
		
		List<Student> data = new ArrayList<Student>();
		
		data.add(new Student("김1", 100));
		data.add(new Student("김4", 90));
		data.add(new Student("김3", 70));
		data.add(new Student("김5", 60));
		data.add(new Student("김2", 80));
		
		// 중간처리, 최종처리를 해보자. (data를 stream으로 만들어서)
		data.stream().forEach((student)->{}); // Consumer니까 ()안에 우리가 넣어줄 변수(student)가 꼭 있어야 하는 케이스다.
		
		data.stream().forEach((student)-> { 
			System.out.println(student);
			System.out.println(student.getName() + student.getScore());
		});
		// 중간처리에 해당하는 부분 (점수 출력해봤음)
		data.stream()
		.mapToInt(student -> student.getScore()) // Function 중에 'ToIntFuction' 이용: 객체 T를 int로 매핑, int applyAsInt(T value)
		.forEach(score -> System.out.println(score)); // IntConsumer 이용
		
		// 최종처리에 해당하는 부분 (최종적으로는 평균점수를 구해봤음)
		data.stream()
		.mapToInt(student -> student.getScore())
		.average()
		.getAsDouble();
		
		// **Optional test 
		data.stream()
		.mapToInt(student -> student.getScore())
		.average() // **average 메소드의 리턴 타입이 OptionalDouble 형태라서 => 경우에 따라 아래와 같은 작업을 해줘야 할 수도 있음. 
		.ifPresent(result -> System.out.println(result)); // If a value is present, performs the given action with the value,otherwise does nothing. 
	
		// **Optional test 2
		data.stream()
		.mapToInt(student -> student.getScore())
		.average() 
		.ifPresentOrElse(avg -> {System.out.println(avg);}, ()->{System.out.println("평균 계산에 실패");}); 
		// DoubleConsumer action, Runnable emptyAction
		// If a value is present, performs the given action with the value,otherwise performs the given empty-based action.
	
		// **Optional test 3		
		Optional<T> option = 
		data.stream()
		.mapToInt(student -> student.getScore())
		.average()
		
		
		
	} // run 메소드의 경우, 매개값도 리턴값도 없자너

}
