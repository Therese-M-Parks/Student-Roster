


/**
 * Classes to manipulate a student roster for the 
 * Solves C169 Final Project
 * COPYRIGHT (C) 2016 Therese M. Parks. All Rights Reserved.
 * @author Therese M. Parks
 * @version 1.01 2016-12-26
 */
public class Student 
{
	// instance variables that describe each student
	private String studentID;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private int [] grades;
	
	// constructor using all input parameters
	public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) 
	{
	
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.grades = grades;
	}

	 // includes an accessor (i.e., getter) for each instance variable above
	
	 /**
	 * @return
	 */
	public String getStudentID() 
	{
		return studentID;
	}
	
	/**
	 * @return
	 */

	public String getFirstName() 
	{
		return firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() 
	{
		return lastName;
	}
	
	/**
	 * @return
	 */

	public String getEmailAddress() 
	{
		return emailAddress;
	}
	
	/**
	 * @return
	 */
    public int getAge() 
    {
		return age;
	}
    
    /**
	 * @return
	 */
	public int [] getGrades() 
	{
		return grades;
	}
	
	
	// include a mutator (i.e., setter) for each instance variable above

    
	/**
	 * @param studentID
	 */
	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}
	
	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	/**
	 * @param emailAddress
	 */
	public void setEmailAddress(String emailAddress) 
	{
		this.emailAddress = emailAddress;
	}
	
	/**
	 * @param age
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	/**
	 * @param grades
	 */
	public void setGrades(int [] grades) 
	{
		this.grades = grades;
	}
	
	/**
	 *print() to print specific student data (e.g., student ID, first name, last name) 
	 *using accessors (i.e., getters)
	 */
	
	public void print() 
	{
		
	System.out.println("Student ID:\t" + getStudentID() +
			"\tFirst Name:\t" + getFirstName() + 
			"\tLast Name:\t" + getLastName() + 
			 "\tEmail:\t" + getEmailAddress() + 
			 "\tAge:\t" + getAge());
	}
	
		
}











