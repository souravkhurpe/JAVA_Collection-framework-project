package com.classManagementSys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.classMahagementSys.model.Batch;
import com.classMahagementSys.model.Course;
import com.classMahagementSys.model.Faculty;
import com.classMahagementSys.model.Student;

class InvalidCourseID extends RuntimeException {

	InvalidCourseID(String s) {
		super(s);
	}
}

public class Services implements Utility {

	List<Course> Lcourse = new ArrayList<Course>();
	List<Faculty> Lfaculty = new ArrayList<Faculty>();
	List<Batch> Lbatch = new ArrayList<Batch>();
	List<Student> Lstudent = new ArrayList<Student>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {
		System.out.println("How many course you want to add: ");
		int courseNo = sc.nextInt();

		for (int i = 0; i < courseNo; i++) {
			Course c = new Course();
			System.out.println("Enter course id: ");
			int cid = sc.nextInt();
			System.out.println("Enter course name: ");
			String cName = sc.next();
			c.setCid(cid);
			c.setCname(cName);
			Lcourse.add(c);

		}
		System.out.println("Course added Successfully...!!");

	}

	@Override
	public void displayCourse() {
		for (Course course : Lcourse) {
			System.out.println(course);
		}

	}

	@Override
	public void addFaculty() {
		System.out.println("How many faculty u want to add: ");
		int facultyNo = sc.nextInt();
		for (int i = 0; i < facultyNo; i++) {
			Faculty f = new Faculty();

			System.out.println("Enter faculty id: ");
			int id = sc.nextInt();
			f.setfId(id);
			System.out.println("Enter faculty name: ");
			String name = sc.next();
			f.setfName(name);

			boolean flag = true;
			while (flag) {
				displayCourse();

				System.out.println("Which Course u want to add. Enter course ID: ");

				int n = sc.nextInt();
				for (Course course : Lcourse) {

					if (n == course.getCid()) {
						f.setCourse(course);
						flag = false;
						break;
					}
				}
				if (flag) {
					try {
						throw new InvalidCourseID("Please enter valid course ID");
					} catch (InvalidCourseID e) {
						e.printStackTrace();
					}
				}
			}
			Lfaculty.add(f);
		}

		System.out.println("Faculty added successfully....!!");
	}

	@Override
	public void displayFaculty() {
		for (Faculty f : Lfaculty) {
			System.out.println(f);
		}

	}

	@Override
	public void addBatch() {

		System.out.println("How many batch u want to add: ");
		int s = sc.nextInt();

		for (int i = 0; i < s; i++) {

			Batch b = new Batch();

			System.out.println("Enter batch id: ");
			b.setbID(sc.nextInt());
			System.out.println("Enter Batch Name: ");
			b.setbName(sc.next());
			boolean flag = true;
			while (flag) {
				displayFaculty();
				System.out.println("Choose faculty. Enter faculty Id");
				int n = sc.nextInt();

				for (Faculty faculty : Lfaculty) {
					if (n == faculty.getfId()) {
						b.setFaculty(faculty);
						flag = false;
						break;

					}
				}
				if (flag) {
					System.out.println("Invalid Faculty ID. Please enter valid faculty id");
				}
			}

			Lbatch.add(b);
			System.out.println("Batch added successfully...!!");
		}

	}

	@Override
	public void displayBatch() {
		for (Batch b : Lbatch) {
			System.out.println(b);
		}

	}

	@Override
	public void addStudent() {
		System.out.println("How many student you want to add: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			Student s = new Student();
			System.out.println("Enter Student id: ");
			s.setsId(sc.nextInt());
			System.out.println("enter Student name: ");
			s.setsName(sc.next());
			boolean flag = true;
			while (flag) {
				displayBatch();
				System.out.println("Choose your batch. Enter Batch Id: ");
				int id = sc.nextInt();
				for (Batch batch : Lbatch) {

					if (id == batch.getbID()) {
						s.setBatch(batch);
						flag = false;
						break;

					}
				}
				if (flag) {
					System.out.println("Invalid batch id. Please enter valid Batch Id");
				}
			}
			
			Lstudent.add(s);
			
			System.out.println("Student added successfully...!!");
		}

	}

	@Override
	public void displayStudent() {
		
		for(Student s: Lstudent) {
			System.out.println(s);
		}

	}

}
