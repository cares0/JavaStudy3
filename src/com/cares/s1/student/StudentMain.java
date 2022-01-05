package com.cares.s1.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentController sc = new StudentController();
		
		Student student = new Student();
		student.name = "aa";
		student.makeTotal();
		System.out.println("참조변수 student : " + student);

		Student student2 = new Student();
		System.out.println("참조변수 student2 : " + student2);
		student2.makeTotal();
		
		// sc.start();
		
		
			


		
	}

}
