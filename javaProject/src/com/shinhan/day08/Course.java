package com.shinhan.day08;

public class Course {

	public static void registerCourse(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 등록한과정임");
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 등록한과정임");
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 등록한과정임");
	}
}
