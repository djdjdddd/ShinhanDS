package examReview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1_쌤 {
		
		public static void main(String[] args) {
			String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
			printMaxScore(array);
		}	
		
		
		
		
		private static void printMaxScore(String[] array){
			// 구현하세요.
			
			// (1) 123+45+78 때 배웠던 것처럼
			
			int maxScore = -1; // 반복문으로 max 구하기 위해 일단 초기화
			String maxName = "";
			
			for(String str : array) {
				
				char[] charArr = str.toCharArray(); // toCharArray
				
				String name =""; // 변수 초기화 위해
				String score = "";
				
				for(int i=0; i<charArr.length-1; i++) {
					if(Character.isDigit(charArr[i])) { // isDigit : ch가 숫자인지 묻는 메소드
						score += charArr[i];            // ch. 하면 기능이 안 나오니까 Character. (즉, Wrapper class를 쓴)
					
					}else {
						name += charArr[i];
					}
					int s = Integer.parseInt(score);
					if(Integer.parseInt(score) > maxScore) {
						maxScore = s;
						maxName = name;
					}
					
				}
				
				System.out.println("최고점수는 ");
			}
			
			
			// (2) 정규표현식으로 (12장)
			int maxScore2 = -1; // 반복문으로 max 구하기 위해 일단 초기화
			String maxName2 = "";
			
			for(String str : array) {
				String regExp = "([가-힣A-Za-z]+)([0-9]+)점"; // '점'을 고정이라 보고 그룹핑해서 뽑아낼려고 하시는 듯?
				Pattern pat = Pattern.compile(regExp);
				Matcher mat = pat.matcher(str);
				if(mat.find()) {
					String name = mat.group(1); // 1번째 그룹
					String score = mat.group(2);
					
					int iscore = Integer.parseInt(score);
					if(iscore > maxScore2) {
						maxScore2 = iscore;
						maxName2 = name;
					}
				
				}
			}
			System.out.println("최고점수는 " + maxName2 + "님 " + maxScore2 + "입니다.");
}
		
}
