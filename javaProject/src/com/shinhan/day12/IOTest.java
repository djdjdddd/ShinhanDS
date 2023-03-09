package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;

import com.shinhan.day09.Account;

// 18장. IO (데이터 입출력)

public class IOTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		f11();
	}
	
	
	// File 클래스와 Files 클래스 
	private static void f11() {
		String fileName = "src/com/shinhan/day12/scoredata.txt";
		
		File file = new File(fileName);
		
		System.out.println(file.exists()); // 파일이 존재하는지 boolean
		System.out.println(file.lastModified()); // 
		Date d = new Date(file.lastModified());
		
	}



	// java.io.NotSerializableException
	
	private static void f10() throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("serialize.dat"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		oos.writeObject(new Account("123", "김1"));
		oos.writeObject(new Account("124", "김2"));
		oos.writeObject(new Account("125", "김3"));
		oos.close();
		
		FileInputStream fis = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fis); 
		
		Student s1 = (Student)ois.readObject();
		Student s2 = (Student)ois.readObject();
		Student s3 = (Student)ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		ois.close();
		fis.close();
		
	}

	
	// 18.10 객체 스트림 (+ Serializable 인터페이스를 implements 하는 이유)
	private static void f9() throws IOException, ClassNotFoundException {
		
		// output 해보자.
		FileWriter fw = new FileWriter("asdf.dat"); 
		FileOutputStream fos = new FileOutputStream("serialize.dat"); // 2) 따라서 fw가 아닌 fos를 써줘야 하더라. 
		                                                              // 왜??
		                                                              // 뒤에 이름이 부모(상속)네 : OutputStream. 
		                                                              // Writer는 OutputStream 과 아예 다른 부모. 
		
//		ObjectOutputStream oos = new ObjectOutputStream(fw); // 1) 그냥 넣어주려 했더니 에러가 나더라. 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		oos.writeObject(new Student("김1", 100, 99));
		oos.writeObject(new Student("김2", 100, 99));
		oos.writeObject(new Student("김3", 100, 99));
		oos.close();
		// 3) 그냥 실행하면, java.io.NotSerializableException 예외가 발생한다. => implements Serializable 해줘야~
		
		
		// input도 해보자.
		FileInputStream fis = new FileInputStream("serialize.dat");
		// **마찬가지로 객체를 읽으려면 ObjectInputStream 을 보조스트림으로 사용해줘야 한다. 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		
		// 단, 강제형변환도 해줘야 한다. (Object -> 클래스)
		Student s1 = (Student)ois.readObject();
		Student s2 = (Student)ois.readObject();
		Student s3 = (Student)ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		ois.close();
		fis.close();
		
	}


	private static void f8() throws IOException {
		FileWriter fw = new FileWriter("print.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.close();
		fw.close();
	}


	// 18.8 기본 타입 스트림 (입출력한 타입을 그대로 유지해주는 방법과 메소드를 알아보자)
	private static void f7() throws IOException {
		// 1. 출력 파트
		// (1) OutputStrema
		FileOutputStream fos = new FileOutputStream("primitiveData.txt"); // primitiveData 란 파일에다가 출력하겠다는 뜻
		// (2) DataOutputStream
		DataOutputStream dos = new DataOutputStream(fos); // fos를 보조스트림인 dos에 넣어주고~
		
		// 기본 타입 출력해보자
//		dos.write(123); // 그냥 write 메소드를 쓰면 타입 유지가 X
		dos.writeInt(123);
		dos.writeBoolean(false);
		dos.writeDouble(3.14);
		dos.writeChar('A');
		
		dos.close();
		fos.close();
		
		// 2. 입력 파트 : 내가 만든 파일로부터 입력스트림을 받아서 syso 해보자
		FileInputStream fis = new FileInputStream("primitiveData.txt");
		// **내가 입력한 기본 타입을 그대로 유지하기 위해서 필요!
		DataInputStream dis = new DataInputStream(fis);
		
		// 단, 위의 write와 read 순서(타입)를 같게 해줘야 제대로 작동하더라. (stream이니까 들어온대로 나가야지 상식적으로)
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		
		dis.close();
		fis.close();
	
	}

	private static void f6() throws IOException {
		String fileName = "src/com/shinhan/day12/scoredata.txt";
		
		Path path = Paths.get(fileName);
				
		// 이번엔 java.nio.file.Files (무슨 패키지, 클래스지??)
		Files.lines(path).forEach((row->{
			System.out.print(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for(int i=1; i<arr.length; i++) {
			try { // NumberFormatException 대비해서 try-catch 해줬다. 
				total += Integer.parseInt(arr[i]);
			}catch(NumberFormatException ex) {
			}
			
			}
			System.out.println("\t" + total + "\t" + total/(arr.length-1));
			}));
			}

	private static void f5() throws IOException {
		String path = "src/com/shinhan/day12/scoredata.txt";

		//
		FileReader fr = new FileReader(path);
		//
		BufferedReader br = new BufferedReader(fr);

		// (1) Buffered 안쓰고 읽은 경우 (readLine 아니라 단순히 read 메소드 쓴)
//		int i;
//		while(true) {
//			i = fr.read();
//			System.out.print((char)i);
//			if(i == -1) break;
//		}

		// (2) 한줄씩 읽는 readLine 메소드(Buffered 소속)를 이용하였음.
		String j; // read가 아니라 readLine을 이용했기 때문에 String 타입
		while ((j = br.readLine()) != null) {
			System.out.println(j);
		}

		// (3) 이번엔 아예 읽고 후처리까지 한 케이스
		String row;
		String title = br.readLine();
		System.out.println(title.replaceAll("/", "\t") + "\t총점\t평균");
		while ((row = br.readLine()) != null) {
			System.out.print(row.replaceAll("/", "\t")); // println이냐 print냐에 따라 결과가 심히 다르긴 하네

			// 총점 계산해보자.
			String[] arr = row.split("/");
			int total = 0;
			for (int i = 1; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println("\t" + total + "\t" + total / (arr.length - 1));
		}

		br.close();
		fr.close();

	}

	// 절대경로, 상대경로
	private static void f4() {
		// 1.class기준
		Path path1 = Paths.get(IOTest.class.getResource("data.txt").toURI());

		// 2.절대경로 : /로 시작한다.
		Path path2 = Paths.get(IOTest.class.getResource("/com/shinhan/day11/data.txt").toURI());

		// 3.상대경로 : 현재위치를 기준으로한다.
		// 방법1 :
		Path path3 = Paths.get("");
		System.out.println(path3.toAbsolutePath());
		// 방법2 : getProperty 이용
		String absolute = System.getProperty("user.dir") + "/data.txt";
		// 2)
		// Path path = Paths.get(absolute);
		String s = path4.toAbsolutePath().toString();
		path4 = Paths.get(s + "/data.txt");
		System.out.println("현재 작업 경로: " + s);
		System.out.println(Charset.defaultCharset());
	}

	private static void f3() throws IOException {

		// *'상대'경로를 쓴 케이스 (*맨 앞에 /가 없다.)
		String path = "src/com/shinhan/day11/data.txt";

		// 입력스트림 중 '문자 입력스트림'
		FileReader fr = new FileReader(path);

		// 출력스트림 중 '문자 출력스트림'
		FileWriter fw = new FileWriter("data2.txt");

		int i;
		while ((i = fr.read()) == -1) {
			System.out.println((char) i);
		}

		fw.close(); // 뭘 먼저 닫을지는 상관 없다고 함. (항상 그런가??)
		fr.close();

	}

	// Reader
	private static void f2() throws IOException {

		// * '절대'경로를 쓴 케이스 (*맨 앞에 /가 있다.)
		String path = System.getProperty("user.dir"); // 이거 뭐냐? => 현재 프로젝트의 경로를 알 수 있다?
		System.out.println(path); // 이렇게 뜸 => C:\Users\fzaca\OneDrive\바탕 화면\fzaca\javaProject

		path += "/src/com/shinhan/day11/data.txt";

		FileInputStream fi = new FileInputStream(path); // path에 들어있는 파일을 열어라

		// 18.5 보조스트림
		InputStreamReader ir = new InputStreamReader(fi); // Stream => Reader로 바꿔주도록 '보조스트림'을 이용하였음.

		// (1) 책에 나와있는 방법
		int data;
		while (true) {
			data = fi.read();
			System.out.println(data);
			if (data == -1)
				break;
		}

		// (2) 쌤
		int data2;
		while ((data2 = fi.read()) == -1) {
			System.out.println((char) data2);
		}

		ir.close(); // 보조스트림인 ir 친구도 닫아줘야 한다던데?

		fi.close(); // close : 입력 스트림을 닫고, 사용 메모리 해제

	}

	// InputStream
	private static void f1() throws IOException {
		// InputStream, OutputStream : 1바이트씩 처리
		// Reader, Writer : 2바이트씩 처리

		// 요 앞에 File, Data, Buffered 등 여러가지가 붙는 듯
		// ex) FileReader, FileInputStream 등등

		// 이렇게는 만들 수 없음. (InputStream 자체는 추상 클래스라 new할 수 없더라고)
//		new InputStream 
		// 따라서 입력스트림(InputStream) 만들 거면 아래처럼
		InputStream is = System.in; // 1) 내가 입력한 값을

		int i = is.read(); // 2) 읽고(.read)
		System.out.println(i); // 3) 출력해봤음
		System.out.println((char) i);
		// ** read()는 1바이트를 읽고 리턴하기에 => 내가 123을 입력해줘도 1만 읽고 출력한 거임 (1이 49래)

		byte[] arr = new byte[100];
		int j = is.read(arr);
		System.out.println(j + "바이트 수"); // 엔터키(윈도우는 13, 10)까지 바이트 수를 세서 출력.
		System.out.println(Arrays.toString(arr));
		for (int a = 0; a < j - 2; a++) {
			System.out.println((char) arr[a]);
		}

	}

}
