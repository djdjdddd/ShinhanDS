package com.shinhan.day10.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor // 앵간하면 기본생성자 만들어주는게 좋다. 
@Getter
@Setter
@ToString
public class DeptVO {
	
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;

}
