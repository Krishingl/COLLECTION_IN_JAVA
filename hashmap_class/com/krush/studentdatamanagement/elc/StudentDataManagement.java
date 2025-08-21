package com.krush.studentdatamanagement.elc;

import java.util.HashMap;
import java.util.*;

public class StudentDataManagement {

	public static void main(String[] args) {

		HashMap<String, Integer> listOfStudent = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {

			System.out.println("------ Student Management Menu ------\r\n" + "1. Add Student\r\n"
					+ "2. Update Marks\r\n" + "3. Delete Student\r\n" + "4. Search Student\r\n"
					+ "5. Display All Students\r\n" + "6. Show Topper\r\n" + "7. Show Lowest Scorer\r\n"
					+ "8. Show Total and Average Marks\r\n" + "9. Exit\r\n");
			System.out.print("Enter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {

			case 1 -> {
				System.out.print("Enter the Student Name : ");
				String name = sc.nextLine();
				System.out.print("Enter the " + name + " Marks : ");
				int marks = Integer.parseInt(sc.nextLine());
				if (!(listOfStudent.putIfAbsent(name, marks) == null)) {
					System.err.println(name + "Student record already Available.");

				} else {
					System.out.println("Student added successfully!");
				}

			}
			case 2 -> {
				System.out.print("Enter student name to update the marks : ");
				String name = sc.nextLine();
				System.out.print("Enter new marks:");
				int marks = Integer.parseInt(sc.nextLine());

				if (listOfStudent.containsKey(name)) {
					int privMarks = listOfStudent.put(name, marks);
					System.out.println(name + " Student before updated Marks is " + privMarks
							+ " After udation Marks is " + marks);

				} else {
					System.err.println(name + " student record not found!!");
				}

			}
			case 3 -> {
				System.out.print("Enter student name to delete: ");
				String name = sc.nextLine();

				if (listOfStudent.remove(name) != null) {

					System.out.println("Student record deleted.");
				} else {
					System.err.println("Student record not found to delete.");
				}

			}
			case 4 -> {
				System.out.println("Enter student name to search:");
				String name = sc.nextLine();
				if (listOfStudent.containsKey(name)) {
					System.out.println(name + " Scored " + listOfStudent.get(name));

				} else {
					System.err.println("Student Record Not Found..!!");
				}

			}
			case 5 -> {
				System.out.println("---- Student Records ----");

				listOfStudent.forEach((key, value) -> System.out.println(key + " => " + value));

			}
			case 6 -> {

				String key = Collections
						.max(listOfStudent.entrySet(), (v1, v2) -> v1.getValue().compareTo(v2.getValue())).getKey();

				System.out.println("Topper: " + key + " ==> " + listOfStudent.get(key));

			}
			case 7 -> {
				String key = Collections
						.min(listOfStudent.entrySet(), (v1, v2) -> v1.getValue().compareTo(v2.getValue())).getKey();
				System.out.println("Lowest Scorer: " + key + " ==> " + listOfStudent.get(key));

			}
			case 8 -> {
				int totalMarks = 0;
				for (int marks : listOfStudent.values()) {
					totalMarks += marks;
				}

				double avg = (double) totalMarks / listOfStudent.size();

				System.out.println("Total Marks: " + totalMarks + "\nAverage Marks: " + avg);

			}

			case 9 -> {
				System.out.println("Exiting... Thank you!");
				exit = true;

			}
			default -> System.err.println("Select Valid Option Please..");
			}

		}
		sc.close();
	}

}
