package com.cares.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 메서드 호출
		// 이름, 번호, 국어, 영어, 수학이 출력!
		
		Student [] stu1;
		StudentUtil su = new StudentUtil();
		
		stu1 = su.makeStudents();		
		su.printStudents(stu1);
		
	}

}
