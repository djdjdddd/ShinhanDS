package com.shinhan.day12;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>, Serializable{
	private String name;
	private int score;
	
	

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name); // 이름으로 sorting 하고 싶어서 일단 이렇게 써봤음. 
	}



	public Student(String name, int score, int j) {
		this.name = name;
		this.score = score;
		
	}

	
	
	
	
	
}
