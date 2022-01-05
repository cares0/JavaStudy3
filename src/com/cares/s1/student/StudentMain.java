package com.cares.s1.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentController sc = new StudentController();
		
		Student student = new Student();
		student.name = "aa";
		student.number = 1;
		student.kor = 10;
		student.eng = 10;
		student.math = 10;
		student.makeTotal();
		
		
		System.out.println(student.total);

		Student student2 = new Student();
		System.out.println("참조변수 student2 : " + student2);
		
		
		
		
		sc.start();
		
		
		 


		
	}

}
