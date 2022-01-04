package com.cares.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student[] makeStudents() {
		// 학생의 수를 입력 받음
		// 학생의 수만큼 정보를 받는다
		// 학생들의 정보를 리턴
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정보를 입력할 학생의 수를 입력하세요.");
		int num = sc.nextInt();
		Student [] students = new Student[num];
		
		for(int i=0;i<students.length;i++) {
			Student stu = new Student();
			System.out.println("학생의 이름을 입력하세요.");
			stu.name = sc.next();
			System.out.println("학생의 번호를 입력하세요.");
			stu.number = sc.nextInt();
			System.out.println("학생의 국어점수를 입력하세요.");
			stu.kor = sc.nextInt();
			System.out.println("학생의 영어점수를 입력하세요.");
			stu.eng = sc.nextInt();
			System.out.println("학생의 수학점수를 입력하세요.");
			stu.math = sc.nextInt();
			students[i] = stu;
		}
		return students;		
	}
	
	public void printStudents(Student [] stuArr) {
		for (int i=0;i<stuArr.length;i++) {
			System.out.println("이름 : " + stuArr[i].name);
			System.out.println("번호 : " + stuArr[i].number);
			System.out.println("국어점수 : " + stuArr[i].kor);
			System.out.println("영어점수 : " + stuArr[i].eng);
			System.out.println("수학점수 : " + stuArr[i].math);
		}
	}
	

	public Student makeStudent() {
		// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력만!
		// 입력받은 값을 리턴
		
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		System.out.println("학생의 이름을 입력하세요.");
		stu.name = sc.next();
		System.out.println("학생의 번호를 입력하세요.");
		stu.number = sc.nextInt();
		System.out.println("학생의 국어점수를 입력하세요.");
		stu.kor = sc.nextInt();
		System.out.println("학생의 영어점수를 입력하세요.");
		stu.eng = sc.nextInt();
		System.out.println("학생의 수학점수를 입력하세요.");
		stu.math = sc.nextInt();
		
		return stu;
	}
	
	public void printStudent(Student stuP) { 
		// 매개변수명 그냥 stu로 써도 되지만, 그림을 그릴 때 헷갈리지 않게 stuP로 구분을 하겠다
		System.out.println("이름 : " + stuP.name);
		System.out.println("번호 : " + stuP.number);
		System.out.println("국어점수 : " + stuP.kor);
		System.out.println("영어점수 : " + stuP.eng);
		System.out.println("수학점수 : " + stuP.math);
	}
	
}
