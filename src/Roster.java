
import java.util.ArrayList;
/**
 * Classes to manage a student roster
 * Solves C169 Final Project
 * COPYRIGHT (C) 2016 Therese M. Parks. All Rights Reserved.
 * @author Therese M. Parks
 * @version 1.01 2016-12-26
 */

//Create a student Roster class with the following methods that contain all ArrayList method calls

public class Roster 
{
	// Demonstrate the program’s required functionality by running the following scenario:
	// print_all(); 
	// print_invalid_emails();
	// loop through the ArrayList and for each element: 
	// print_average_grade(current_loop_student); 
	// remove("3");   
	// remove("3"); 
	// expected: this should print a message saying such a student with this ID was not found.

	public static double grade1, grade2, grade3;

	// Array list
	public static ArrayList <Student> students = new ArrayList<Student>(); 

	public static void main(String[] args)throws Exception //Array
	{
		//ArrayList of student objects 
		add("1","John","Smith","John1989@gmail.com", 20, 88, 79, 59);
		add("2","Suzan","Erickson","Erickson_1990@gmailcom", 19, 91, 72, 85);
		add("3","Jack","Napoli","The_lawyer99yahoo.com", 19, 85 ,84 ,87);
		add("4","Erin","Black","Erin.black@comcast.net", 22, 91, 98, 82);
		add("5","Therese","Parks","tpark62@wgu.edu", 26, 88, 79, 90);

		print_all();
		print_invalid_emails();
		//1/5/17 - The submission includes a print_average_grade() method.
		//The method needs to print only the student being passed in.
		for (Student b : students)
		{   
			print_average_grade(b.getStudentID());
		}
		remove("3");
		remove("3");
	}

	/**
	 * that sets the instance variables from part B1 and updates the roster 
	 * @param studentID
	 * @param firstname
	 * @param lastname
	 * @param emailaddress
	 * @param age
	 * @param grade1
	 * @param grade2
	 * @param grade3
	 */
	public static void add(String studentID, String firstName, String lastName, String emailAddress,
			int age, int grade1, int grade2, int grade3)
	{
		int [] grades = {grade1, grade2, grade3};
		Student s = new Student(studentID, firstName, lastName, emailAddress, age, grades);
		students.add(s);
	}

	/**
	 * that removes students from the roster by student ID
	 * @param studentID
	 */
	public static void remove(String studentID) 
	{
		for (Student r : students)
		{
			if (r.getStudentID().equals(studentID))
			{
				students.remove(r);
				return;
			}
		}

		System.out.println("No student exists with this ID.");
	}


	/**that prints a complete tab-separated list of student data using accessory methods
	 * @param print
	 */
	public static void print_all() 
	{															
		for (int i = 0; i < students.size(); i++)
		{
			students.get(i).print();
		}
	}

	/**that correctly prints a student’s average grade by student ID 
	@param printAverage
	 */

	public static void print_average_grade(String studentID)
	{
		System.out.println("Print Average of Grades.");
		for (Student b : students)
		{
			if (b.getStudentID().equals(studentID))
			{
				double average = ((b.getGrades()[0] + b.getGrades()[1] + b.getGrades()[2]) / 3);
				System.out.println(average);
			}
		}

	}   

	/**
	 * that verifies student e-mail addresses and displays all invalid e-mail addresses to the user
	 * @param
	 */
	public static void print_invalid_emails() 
	{
		for (int i = 0; i < students.size(); i++)
		{
			String email = students.get(i).getEmailAddress();
			CharSequence cs1 = "@";
			CharSequence cs2 = ".";
			CharSequence cs3 = " ";

			/** valid email must contain the "@" symbol. 
		   if email does not have this symbol, print it out.
			 */
			boolean email_has1 = email.contains(cs1);
			if (!email_has1)
			{	
				System.out.println("Student email is invalid." + email);
			}

			/** valid email must contain the "@" symbol. 
		 if email does not have this symbol, print it out.
			 */

			boolean email_has2 = email.contains(cs2);
			if (!email_has2)
			{	
				System.out.println("Student email is invalid." + email);
			}

			/** valid email does not contain spaces
		if email has a space, print it out.
			 */
			boolean email_has3 = email.contains(cs3);
			if (email_has3)
			{	
				System.out.println("Student email is invalid." + email);
			}

		}


	}

}




























