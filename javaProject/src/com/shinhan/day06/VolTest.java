package com.shinhan.day06;

public class VolTest {

	public static void main(String[] args) {
		
		public static void main(String args[]){
			 Volume[] v = new Volume[3];
			 v[0] = new Speaker();
			 v[1] = new Radio();
			 v[2] = new TV();
			 for(int i = 0; i < v.length; i++){
				 for(int j = 1; j <= 3; j++){
			       		v[i].volumeUp(200);
			      }
				 for(int j = 1; j <= 3; j++){
				  	v[i].volumeDown(300);
				 }
			 }
			}
			

//			[실행결과]
//			speak볼륨 올립니다.100
//			speak볼륨 올립니다.100
//			speak볼륨 올립니다.100
//			speak볼륨 내립니다.0
//			speak볼륨 내립니다.0
//			speak볼륨 내립니다.0
//			Radio볼륨 올립니다.200
//			Radio볼륨 올립니다.400
//			Radio볼륨 올립니다.600
//			Radio볼륨 내립니다.300
//			Radio볼륨 내립니다.0
//			Radio볼륨 내립니다.-300
//			TV볼륨 올립니다.200
//			TV볼륨 올립니다.400
//			TV볼륨 올립니다.600
//			TV볼륨 내립니다.300
//			TV볼륨 내립니다.0
//			TV볼륨 내립니다.0

		
	}

}
