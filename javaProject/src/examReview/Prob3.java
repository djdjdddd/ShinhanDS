package examReview;

class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge{	
	//구현하시오.
	
	// 필드
	private String user;
	private int call;
	private int sms;
	private int data;
	private int total;
	
	// 생성자
	public PhoneCharge(String user, int call, int sms, int data) {
		// 같은 이름의 멤버변수 값으로 초기화하는 문장을 정의한다. 
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data; // 통신요금
	}
	
	// 메소드
	public int calcCharge() {
		// 지역변수
		int callFee = 0;
		int smsFee = 0;
		int dataFee = 0;
		
		callFee = (call * 10);
		if(call >= 200) callFee = call * 20;
		
		smsFee = sms * 20;
		if(sms >= 300) smsFee = sms * 80;
		
		dataFee = data * 1000;
		if(data >= 7) dataFee = data * 2000;
		
//		smsFee = if(sms < 300) {
//			sms * 20;
//		}else(sms >= 300){
//			sms * 80;
//		}
//		
//		dataFee = if(data < 7) {
//			data * 1000;
//		}else(data >= 7){
//			data * 2000;
//		}
		
		total = callFee + smsFee + dataFee;
		return total;
	}
	
	public void printCharge() {
		
		// () 안에 함수 호출하는 것도 가능하구나. 
		System.out.println(user
				+ " 사용자는 이번달에 사용하신 전화요금이 "
				+ calcCharge()
				+ "원 입니다.");
		
	}
	
		
}
 