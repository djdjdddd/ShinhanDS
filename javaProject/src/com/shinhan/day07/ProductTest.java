package com.shinhan.day07;

// 문제: 매개변수로 들어온 객체의 배열로부터 가격이 특정 금액 이상인 상품만 추출하여 새로운 배열에 담아서 리턴하는 메서드를 구현하시오. 

// *코드 조금 틀림. 복습하면서 고쳐보자..

//import ProductVO; // *같은 패키지라서 import를 할 필요가 없는 듯?

public class ProductTest {
	public static void main(String[] args) {
		
		// (1) 배열에 값을 한번에 주는 코드
		ProductVO[] productList = {new ProductVO("마이쭈", 25000, "Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"),
				new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		
		// (2) 그동안 우리가 했던 건 따로따로 값을 주는 코드였고. 아래와 같이.
//		ProductVO[] productList = new ProductVO[5];
//		productList[0] = {"꿈틀이", 32000, "Samsong"};
//		productList[1] = {"짱구", 32000, "Samsong"};
//		productList[2] = {"새우깡", 32000, "Samsong"};
		
		
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}

	// **상속 : (아래 매개변수를 보면 타입이 Object임) Object 타입으로 바꿀 수 있음. 
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		// ***구현하시오.
		
		// 우선 배열을 다시 만들어주었음.
		ProductVO[] plist1 = new ProductVO[productList.length]; // 길이가 최대개수(product.length)인 배열로 (굳이 필요 없나..?)
		int index = 0;
		
		// (1) 첫번째 for문 : 먼저 조건에 맞는 개수(여기선 index)를 구하는 과정이고
		for(Object obj : productList) { // productList 값 하나하나를 -> Object 타입의 변수에 넣어줘야죠.
			// 방법 1. 
//			ProductVO product = (ProductVO)obj; // ★강제 형변환 해줬음 -> **왜냐면.. Object가 아닌 ProductVO 타입의 메소드를 써주고 싶어서 (getPrice와 같은)
			
			// 방법 2. instanceof를 사용하여 강제형변환과 동시에 조건문도 써버리는 장점.
			if(!(obj instanceof ProductVO product)) { // 왜 ! 을 썼을까?
				continue; // continue문 의미 다시 공부
			}
			if(product.getPrice() >= i) {
				index++;
			}
		}
		
		// (2) 두번째 for문 : index를 알아냈으니, index 길이만큼의 배열을 '또' 새로 만들어서 반복을 한 것임. 
		// 왜냐면 조건에 안 맞는 배열은 걸러지면서 값이 'null'이 떠버렸거든. (직접 해보면 앎)
		// => *배열의 단점임. (그래서 Collection의 List를 쓰면 좋다고?)
		ProductVO[] plist2 = new ProductVO[index];
		for(Object obj : productList) { 
			if(!(obj instanceof ProductVO product)) {
				continue; 
			}
			if(product.getPrice() >= i) {
				plist2[index] = product;
				index++;
			}
		}

		return null;
	}
}
