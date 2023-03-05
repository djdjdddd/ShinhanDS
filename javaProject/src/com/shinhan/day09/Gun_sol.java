package com.shinhan.day09;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Gun {
    static int AnswerN;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input4.txt"));
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int k=0; k<testCase; k++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			char[][] arr = new char[row][col];
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					arr[i][j] = sc.next().charAt(0);
					//System.out.print(arr[i][j]);
				}
				//System.out.println();
			}
			//구현하시오.
			
			System.out.println("#" + k + ":" + AnswerN);
		}
		
		
	}
	
}
