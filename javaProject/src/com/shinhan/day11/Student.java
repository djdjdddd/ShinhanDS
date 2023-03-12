package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student 정보 [name=").append(name).append(", score=").append(score).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name); // 이름으로 sorting 하고 싶어서 일단 이렇게 써봤음. 
	}
	
	
	
	
	
}
