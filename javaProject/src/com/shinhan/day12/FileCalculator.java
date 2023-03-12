package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;

// 18장 LAB4 

public class FileCalculator {

	
	private static void addCalculateResult(String inputFileName) throws IOException {
		inputFileName = "src/com/shinhan/day12/data.txt";
		
		// 텍스트의 각 라인에 있는 정수 숫자들의 합과 곱을 계산 후, 해당 파일의 가장 마지막 부분에 합과 곱의 결과를 순서대로 각각의 라인에 추가하여 저장합니다. 단, 여기서 모든 숫자는 반드시 정수(소수점이 없는 수)이어야 함.
	
		FileReader fr = new FileReader(inputFileName);
		FileInputStream fis = new FileInputStream(inputFileName);
//		DataInputStream dis = new DataInputStream(fis); // DOS로 저장 후에 DIS로 가능하기 때문에???????
		BufferedReader br = new BufferedReader(fr);
		
		// 쌤 방법
		String s;
		int sum = 0, multiply = 1;
		while((s = br.readLine()) != null) {
			System.out.println(s);
			sum += Integer.parseInt(s);
			multiply *= Integer.parseInt(s);
		}
		System.out.println(sum + "====" + multiply);
		
		fr.close();
		br.close();
		
		// 파일을 출력 목적으로 열기
		FileWriter fw = new FileWriter(inputFileName, true); // append 여부 : true를 썼다는 건 'append하겠다는 거'
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine(); // 줄 바꾸기
		bw.write(sum + "");
		bw.newLine();
		bw.write(multiply + "");
		
		bw.close();
		fw.close();
		
		FileInputStream isr = new FileInputStream(inputFileName);
		DataInputStream dis = new DataInputStream(isr);
		
//		int data;
//		int sum2 = 0;
//		int multiply2 = 0;
//		while(true) {
//			data = dis.readInt();
//			sum2 += data;
//			multiply2 *= data;
//			System.out.println(sum2);
//			System.out.println(multiply2);
//		}
		
//		int data;
//		int sum = 0;
//		int multiple = 0;
//		while(true) {
//			data = dis.readInt();
//			if(data == -1) break;
//			
//			sum += data;
//			multiple *= data;
//			
//			List<Integer> list = new ArrayList<>();
//			list = data;
//		} 
//		
//		System.out.println(sum);
//		
//		Files.createFile(null, null);
//		
//		
//		FileOutputStream fos = new FileOutputStream(inputFileName);
//		DataOutputStream dos = new DataOutputStream(fos);
//		
//		dos.
//		
//		
//		
//		dos.close();
//		fos.close();
	}	
	}


	

