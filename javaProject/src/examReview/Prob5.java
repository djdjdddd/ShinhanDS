package examReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prob5 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		
		
		// 구현하시오 - 숫자들의 개수를 세어 저장하는 코드를 작성한다.
		
		// 쌤 설명
		// => counter라는 배열이 길이가 4짜리인 놈이니까 숫자1은 배열 0번째에, 숫자2는 배열 1번째에 ~~ 넣으라는 것을 의미한다. 
		
		// 방법 1
		for(int num : answer) {
			counter[num - 1]++; // 내 숫자보다 1이 더 작은 방에 ++하면 되니까 
		}
		
		// 방법 2
		// 스트림으로 구현한다면
		Arrays.stream(answer).forEach(value -> counter[value-1] += 1); // 스트림을 돌려서 1을 counter[1작은 방]에다가 넣겠다는 뜻. 
		
		
		// 구현하시오 - 출력결과와 같이 나오도록 작성한다.
		

	}
}
