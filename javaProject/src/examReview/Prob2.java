package examReview;
public class Prob2 {

	public static void main(String[] args) throws IllegalSizeException {
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));
		
	}

	 

	public static String leftPad(String str, int size, char fillChar) /*throws IllegalSizeException */ {
		//구현하시오.....return값 수정할것
		String result = "";
		
		// Exception 처리를 내가 해줘야 하는 케이스니까 
		// try catch 이용해서 만들어줘야 했던 것. 
		try {
			if(str.length() > size) throw new IllegalSizeException("문자열의 길이보다 size가 큽니다");
		}catch(IllegalSizeException e) {
			System.out.println(e.getMessage());
		}
		for(int i=0; i<size-str.length(); i++) {
			result += fillChar;
		}
		result += str;
		
		return result;
	}

	
	
}

//구현하시오.
class IllegalSizeException extends Exception {
	 
	IllegalSizeException(String message){
		super(message); // Exception에 String args를 받는 그게 있어서 생성자를 이렇게 만들어줬다는데?
		                // "문자열의 길이보다 size가 큽니다"란 메세지를 받아주기 위해서 
	}
	 
}



