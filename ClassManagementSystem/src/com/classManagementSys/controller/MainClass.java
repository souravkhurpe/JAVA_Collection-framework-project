package com.classManagementSys.controller;

import java.util.Scanner;

import com.classManagementSys.service.Services;
import com.classManagementSys.service.Utility;


public class MainClass {

	static Scanner sc = new Scanner(System.in);

	static void menu() {
		System.out.println();
		System.out.println("********* WELCOME TO CLASS MANAGEMENT SYSTEM ***********");
		System.out.println();
		System.out.println("******** ENTER YOUR CHOICE ***********");

		System.out.println("1) ADD COURSE");
		System.out.println("2) DISPLAY COURSE");
		System.out.println("3) ADD FACULTY");
		System.out.println("4) DISPLAY FACULTY");
		System.out.println("5) ADD BATCH");
		System.out.println("6) DISPLAY BATCH");
		System.out.println("7) ADD STUDENT");
		System.out.println("8) DISPLAY STUDENT");
		System.out.println("0) TO EXIT APPLICATION");
	}

	public static void main(String[] args) {
		boolean flag = true;
		Utility u = new Services();
		while (flag) {
			menu();

			boolean flag2 = true;
			while (flag2) {
				int ch = sc.nextInt();

				switch (ch) {
				case 1:
					u.addCourse();
					flag2 = false;
					break;
				case 2:
					u.displayCourse();
					flag2 = false;
					break;
				case 3:
					u.addFaculty();
					flag2 = false;
					break;
				case 4:
					u.displayFaculty();
					flag2 = false;
					break;
				case 5:
					u.addBatch();
					flag2 = false;
					break;
				case 6:
					u.displayBatch();
					flag2 = false;
					break;
				case 7:
					u.addStudent();
					flag2 = false;
					break;
				case 8:
					u.displayStudent();
					flag2 = false;
					break;
				case 0:
					flag = false;
					flag2 = false;
					
					break;

				default:
					System.out.println("### Enter valid choice ###");
				}
			}
			
		}
		System.out.println();
		System.out.println("******** Thanks for visiting ********");

	}

}
