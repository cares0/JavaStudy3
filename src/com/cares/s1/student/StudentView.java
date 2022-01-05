package com.cares.s1.student;

public class StudentView {
	// 출력 전용

	public void viewStudents(Student [] students) {
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println("---------------------------------------------------");
		for (int i=0;i<students.length;i++) {
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].number + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].total + "\t");
			System.out.print(students[i].avg + "\t");
			System.out.println();

		}
	}
	public void viewStudent(Student student) {
		
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println("---------------------------------------------------");
		System.out.print(student.name + "\t");
		System.out.print(student.number + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.eng + "\t");
		System.out.print(student.math + "\t");
		System.out.print(student.total + "\t");
		System.out.print(student.avg + "\t");
		System.out.println();
	}
	
	public void viewMessage(String message) {
		System.out.println("=======================");
		System.out.println(message);
		System.out.println("=======================");
	}
}
