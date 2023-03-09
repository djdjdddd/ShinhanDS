package exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Prob1 implements Comparable<String>{
	
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
		printMaxScore(array);
	}	
	
	
	
	
	private static void printMaxScore(String[] array){
		// 구현하세요.
		
		
		
		int score = 0;
		
		for(int i=0; i<array.length; i++) {
			String str = array[i];
			char ch1 = str.charAt(3);
			char ch2 = str.charAt(4);
			score = (int)ch1 + (int)ch2;
			
		
		}System.out.println(score);
		
		
		
		
//		Arrays.sort(array, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}});
//			
//		//  OOO  점 을 없애고 점수를 비교?
//			
//		System.out.println(array[0]);
//	}
//
//	@Override
//	public int compareTo(String o) {
//		
//		this.
		
		
		return ;
	}	
}
