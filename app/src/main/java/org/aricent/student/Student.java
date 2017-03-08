/***********************************************************************
                         Aricent Technologies Proprietary
 
This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies
 
File Name			  :Student.java
Principal Author	  :PRAVEEN KUMAR KRISHNAMOORTHY
Subsystem Name        :Core Java Training
Module Name           :
Date of First Release : Jan 16, 2017 2017 9:47:51 AM
Author                :PRAVEEN KUMAR KRISHNAMOORTHY
Description           :

Version               :1.0
Date(DD/MM/YYYY)      :Jan 16, 2017 2017 9:47:51 AM
Modified by           : PRAVEEN KUMAR KRISHNAMOORTHY
Description of change :Initial Version
 
***********************************************************************/

package org.aricent.student;

import org.aricent.Operations.CollegeOperations;

/**
 * @name	: Student Class
 * @author  : PRAVEEN KUMAR KRISHNAMOORTHY
 * @see	    : college
 * @version : Text 1.0
 * @since	: Jan 16, 2017 2017 9:47:51 AM
 */
public class Student implements Comparable<Student> {

	private	String lastName;
	private	String firstName;
	private	double midtermGrade;
	private	double finalGrade;

	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the midtermGrade
	 */
	public double getMidtermGrade() {
		return midtermGrade;
	}
	/**
	 * @param midtermGrade the midtermGrade to set
	 */
	public void setMidtermGrade(double midtermGrade) {
		this.midtermGrade = midtermGrade;
	}
	/**
	 * @return the finalGrade
	 */
	public double getFinalGrade() {
		return finalGrade;
	}
	/**
	 * @param finalGrade the finalGrade to set
	 */
	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}

	/**
	 * @name compateTo method 
	 * @param Student Stu
	 * @return description : INT
	 * @see Student
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */
	
	public int compareTo(Student Stu)
	{
		CollegeOperations object = new CollegeOperations();
		
		if(object.CalculateGrade(Stu) == (object.CalculateGrade(this)))
		{
			return Stu.getLastName().compareTo(this.getLastName());
		}
		else if (object.CalculateGrade(Stu) > object.CalculateGrade(this))
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
