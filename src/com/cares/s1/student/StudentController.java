package com.cares.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		// switch case		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil su = new StudentUtil();
		su.initUtil();
		StudentView sv = new StudentView();
		Student [] students = null;

		while (check) {


			System.out.println("1. 학생정보입력");
			System.out.println("2. 전체학생조회");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 학생정보삭제");
			System.out.println("6. 프로그램종료");
			int select = sc.nextInt();


			switch (select) {
			case 1 :
				students = su.makeStudents();

				break;

			case 2 :
				if (students == null) {
					sv.view("학생 정보를 먼저 입력해주세요");
				} else {
					sv.view(students);
				}

				break;

			case 3 :
				if(students == null) {
					sv.view("학생 정보를 먼저 입력해주세요.");
					continue;
				}
				boolean check2 = true;
				
				while (check2) {
					Student stu;
					stu = su.search(students);
					if (stu == null) {
						System.out.println("없는 번호입니다.");
						System.out.println("다시 검색하시겠습니까?");
						System.out.println("1. 예");
						System.out.println("2. 아니오");
						int select2 = sc.nextInt();
						if (select2 == 2) {
							check2 = false;
						}
					} else {
						sv.view(stu);
						check2 = false;
					}
				}
				break;

			case 4 : 
				System.out.println("학생 정보를 추가합니다.");
				Student [] add = null;
				add = su.makeStudents();
				Student [] origin = students;
				students = new Student [add.length+origin.length];
				
				for (int i=0;i<origin.length;i++) {
					students[i] = origin[i];
				}
				for (int i=0;i<add.length;i++) {
					students[i+origin.length] = add[i];
				}				
				break;

			case 5 :
				System.out.println("학생 정보를 삭제합니다.");
				Student [] delete = null;
				
				break;

			case 6 :
				check = false;
				break;

			default :
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			}

		} // while 끝
	} // Main 끝
} // Class 끝
