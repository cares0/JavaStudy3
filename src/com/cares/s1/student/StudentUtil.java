package com.cares.s1.student;

import java.util.Scanner;

public class StudentUtil {
	// 학생 입력용
	Scanner sc;

	public StudentUtil() {
		this.sc = new Scanner(System.in);
	}
	
	
	public Student search(Student [] students) {
		// 학생의 번호를 입력받음
		// 입력받은 번호와 일치하는 학생을 찾아서 리턴
		
		Student student = null;
		System.out.println("조회할 학생의 번호를 입력하세요.");
		int num = sc.nextInt(); // sc 앞에 this. 이 생략된것임
		
		for (int i=0;i<students.length;i++) {
			if (num == students[i].number) {
				student = students[i];
			}		
		}
		
		return student;
		
		
	}
	public Student[] makeStudents() {
				
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
			
			stu.makeTotal();
			stu.avg = stu.total / 3.0;
			
			students[i] = stu;
		}
		return students;		
	}
	
	public void deleteStudent(Student [] students) {
		Student [] delete = new Student[students.length - 1];
		
		
		
	}
}
	
