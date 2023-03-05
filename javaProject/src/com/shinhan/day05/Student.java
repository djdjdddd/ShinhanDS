package com.shinhan.day05;

// 2.27 아침 복습(9시)

// 접근권한 : ppdp, public > protected > (생략) > private
// 활용방법 : static, final
public class Student { // extends Object가 생략돼있다. 

	// 1. field (data 저장하기 위한 변수들 정의)
	// (1) 인스턴스 변수 : 학생마다 다 다른 값을 갖고 있어~ (= 객체별로 값이 다른 경우)
	// (2) 클래스 변수 : 학생 공통적으로 갖고 있어~ (객체 모두 값이 같은 경우)
	private String stdId; // private : 이 클래스(Student) 내에서만 접근가능
	public String name; // public : 모든 패키지에서 접근가능
	String major; // (생략) : 같은 패키지에서 접근가능
	protected int score; // protected : 같은 패키지에서 접근가능 + 다른 패키지면 자식은 접근가능(상속 받으면 접근가능) 
	public final String schoolName = "신한금융대학"; // 초기화가 1회 필요 (선언시 or 생성시)
	public static final String NATION = "대한민국"; // 마찬가지로 초기화 1회 필요 (선언시)
	public static int count; // class변수 
	
	public Student(String stdId, String name) {
		// default 생성자는 컴파일러가 컴파일시 자동으로 .class에 추가된다. 
		// 단, 재정의하면 생성 안됨.
		this(stdId, name, null, 0); // ★내가 아는 건 stdId, name밖에 없고 전공과 점수는 모르니까 그냥 초기값을 줘버리는 것!
	}
	
	public Student(String stdId, String name, String major) {
		this(stdId, name, major, 0); // ★마찬가지로 아직 점수는 모르니까 그쪽은 초기값 0을 줘버린 것. 
	}

	public Student(String stdId, String name, String major, int score) {
		// super();
		this.setStdId(stdId);
		this.name = name;
		this.major = major;
		this.score = score;
		// super(); 이건 XX, super();는 (생성자 맨 윗줄에? 즉 객체를 생성하는 ~) super가 생략돼있다. 
		         // 근데 이렇게 아래쪽에 super();를 또 쓰는 건 '부모를 여러번 생성하겠다'라는 뜻인데, 이건 에러다.
		count++;
	}

	// private한 변수인 StdId의 getter & setter
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	// 학생 정보를 한번에 알려주는 그걸 사용했다. toString() !!
	@Override
	public String toString() {
		return "Student 정보 [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}
	
	
	
}
