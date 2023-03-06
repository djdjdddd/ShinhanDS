package com.shinhan.day09;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SumThread extends Thread{
	
	private long sum;
	
	int begin; 
	int end;

	SumThread(int begin, int end){
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i=begin; i<=end; i++) {
			sum += i;
		}
	}
	
	
	
}
