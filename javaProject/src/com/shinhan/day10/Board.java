package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"subject", "writer"})
public class Board implements Comparable<Board>{
	
	private int boardNo;
	private String subject;
	private String content;
	private String writer;
	
	@Override
	public int compareTo(Board obj) {
		
		int result1 = subject.compareTo(obj.subject);
		if(result1 == 0) {
			int result2 = writer.compareTo(obj.writer); // 객체(참조형)니까 compareTo 쓴거고
			if(result2 == 0) {
				return boardNo - obj.boardNo; // writer까지 같으면 boardNo로 비교
			}
			return result2; // subject이 같으면 writer로 비교한다는 뜻
		}
		return result1; // 그런 거 아니면 subject로 비교
	}

}
