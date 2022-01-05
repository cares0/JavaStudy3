package com.cares.s1.student;

public class Student {
	// 학생 데이터 저장
	
	String name;
	int number;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	public void makeTotal() {
		total = kor + eng + math;		
		// this는 생략 가능
		// 만약 멤버메서드 내에 total과 이름이 똑같은 변수가 있으면 써야하고 아니면 생략
		//hello(); // 이런식으로 this 생략하고 같은 클래스 안의 메서드를 선언 가능
	}
	
	public void hello() {
		System.out.println("안녕하세요.");
		// makeTotal(); // 위에 hello()가 선언되었는데, 여기에 또 makeTotal을 써버리면 
		// stack 영역 내에 자꾸 쌓여서 stackoverflow 발생
		
	}
	
	
//	public void hi() {
//		System.out.println("hi");
//		bye();
//	}
//	public void bye() {
//		System.out.println("bye");
//		hi();
//	}
	
	

}
