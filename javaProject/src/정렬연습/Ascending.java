package 정렬연습;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ascending {
	
	public static void main(String[] args) {
		f4();
	}

	
	// 4. 내림차순 만들어보기3 (람다 이용하여 짧게 표현)
	private static void f4() {
		Integer[] array = new Integer[] {1,3,45,183,2154,5645623};

		Arrays.sort(array, (i1, i2) -> i2 - i1); // 이게 람다표현식인가??
		
		System.out.println(Arrays.toString(array));
	}


	// 3. 내림차순 만들어보기2 (Collections.reverseOrder() 이용해서)
	private static void f3() {
		Integer[] array = new Integer[] {1,3,45,183,2154,5645623};
		
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(array));
		System.out.println(array.toString());
	}

	
	// 2. 내림차순 만들어보기 (Comparator 인터페이스로부터 익명객체 만들어서)
	private static void f2() {
		Integer[] array = new Integer[] {1,3,45,183,2154,5645623};
		
		// Comparator 인터페이스를 이용해서 비교방법을 override하는 것.
		Arrays.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		
		System.out.println(Arrays.toString(array));
	}

	
	// 1. 오름차순 연습
	private static void f1() {
		int[] array = new int[] {1,3,45,183,2154,5645623};
		
		Arrays.sort(array);
		
//		for(int i : array) {
//			System.out.print(i + ",");
//		}
		
		System.out.println(Arrays.toString(array));
		
	}

	@Override
	public String toString() {
		return "Ascending [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
