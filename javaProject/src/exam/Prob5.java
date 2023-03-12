package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prob5 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		
		
		// 구현하시오 - 숫자들의 개수를 세어 저장하는 코드를 작성한다.
		List<Integer> list =
		          new ArrayList<>(Arrays.asList(1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2));
		
//		long number = 0;
//		for(int i=0; i<answer.length; i++) {
//			if(answer[i] == 1) {
//				number = list.stream().count();
//			}
//			if(answer[i] == 2) {
//				number = list.stream().count();
//			}
//			if(answer[i] == 3) {
//				number = list.stream().count();
//			}
//			if(answer[i] == 4) {
//				number = list.stream().count();
//			}
//		}
		List list1 = 
				list.stream().filter(a -> a < 2).toList();
		
		List<Integer> list2 = 
				list.stream().filter(a -> a.equals(2)).collect(Collectors.toList());
		
		List<Integer> list3 = 
				list.stream().filter(a -> a.equals(3)).collect(Collectors.toList());
		
		List<Integer> list4 = 
				list.stream().filter(a -> a.equals(4)).toList();
		
		// 저장하는 코드를 작성한다. ?????????????
		
		
		// 구현하시오 - 출력결과와 같이 나오도록 작성한다.
		System.out.println("1의 갯수는 " + list1.size() + "개 입니다.");
		System.out.println("2의 갯수는 " + list2.size() + "개 입니다.");
		System.out.println("3의 갯수는 " + list3.size() + "개 입니다.");
		System.out.println("4의 갯수는 " + list4.size() + "개 입니다.");


	}
}
