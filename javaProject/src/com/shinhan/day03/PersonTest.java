package com.shinhan.day03;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person(29, "김용희");
		
		person1.selfIntroduce();
		person2.selfIntroduce();
		System.out.println(person1.getPopulation());
		
		
		// 배열을 이용할 수도 있다. 
		Person[] persons = new Person[100];
		
		persons[0] = new Person();
		persons[1] = new Person(30, "홍길동");
		persons[2] = new Person(20, "김길동");
		
		for(Person p : persons) {
			p.selfIntroduce();
		}
	}

}
