package com.shinhan.day08;

public class GenericExample {

	public static void main(String[] args) {
		wildCardTest();
		
		
	}

	private static void wildCardTest() {
		// ?, extends, super
		Course.registerCourse(new Applicant<Person>(new Person()));
		Course.registerCourse(new Applicant<Worker>(new Worker()));
		Course.registerCourse(new Applicant<Student>(new Student()));
		Course.registerCourse(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
	}

}
