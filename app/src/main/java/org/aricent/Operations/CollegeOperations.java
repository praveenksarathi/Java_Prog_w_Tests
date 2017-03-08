/***********************************************************************
                         Aricent Technologies Proprietary
 
This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies
 
File Name			  :CollegeOperations.java
Principal Author	  :PRAVEEN KUMAR KRISHNAMOORTHY
Subsystem Name        :Core Java Training
Module Name           :
Date of First Release : Jan 13, 2017 2017 4:54:27 PM
Author                :PRAVEEN KUMAR KRISHNAMOORTHY
Description           :

Version               :1.0
Date(DD/MM/YYYY)      :Jan 13, 2017 2017 4:54:27 PM
Modified by           : PRAVEEN KUMAR KRISHNAMOORTHY
Description of change :Initial Version
 
***********************************************************************/

package org.aricent.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import org.aricent.student.Student;

/**
 * @name	: CollegeOperations Class
 * @author  : PRAVEEN KUMAR KRISHNAMOORTHY
 * @see	    : college
 * @version : Text 1.0
 * @since	: JAN 13, 2017 2017 4:54:27 PM
 */
public class CollegeOperations {
	HashSet<Student> set = new HashSet<Student>();
	
	/**
	 * @name GetData method 
	 * @param NIL
	 * @return description : void
	 * @see CollegeOperations
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */

	public Student GetData()
	{
		Scanner S = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("Please Enter the Student's First Name");
		stu.setFirstName(S.next());
		System.out.println("Enter Student's Last Name");
		stu.setLastName(S.next());
		System.out.println("Enter the Student's Mid Term Grade");
		stu.setMidtermGrade(S.nextDouble());
		System.out.println("Enter the Student's Final Term Grade");
		stu.setFinalGrade(S.nextDouble());
		S.close();
		return stu;
	}
	
	/**
	 * @name PutData method 
	 * @param NIL
	 * @return description : void
	 * @see CollegeOperations
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */

	public void PutData(Student e)
	{
		set.add(e);
	}
	
	/**
	 * @name Display method 
	 * @param NIL
	 * @return description : void
	 * @see CollegeOperations
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */
	public void Display()
	{
		Student temp;
		int count = 0;
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext())
		{
			count ++;
			temp = itr.next();
			System.out.println("The Student's Name is"+temp.getFirstName()+" "+temp.getLastName());
			System.out.println("The Student's Mid Term Grade is :"+temp.getMidtermGrade());
			System.out.println("The Student's Final Term Grade is"+temp.getFinalGrade());
		}
		
		if (count == 0)
		{
			System.out.println("No Records To Display");
		}
	}
	
	/**
	 * @name Sort method 
	 * @param NIL
	 * @return description : void
	 * @see CollegeOperations
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */
	public void Sort()
	{
		Student Stu;
		ArrayList<Student> list = new ArrayList<Student>(set);
		Collections.sort(list);
		
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Stu = itr.next();
			System.out.println("The Student's Name is"+Stu.getFirstName()+" "+Stu.getLastName());
			System.out.println("The Student's Mid Term Grade is :"+Stu.getMidtermGrade());
			System.out.println("The Student's Final Term Grade is"+Stu.getFinalGrade());
		}
	}

	/**
	 * @name isCheckRecord method 
	 * @param Student Stu
	 * @return description : Boolean
	 * @see CollegeOperations
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */	
	public boolean isCheckRecord(Student Stu)
	{
		Student temp;
		Iterator<Student> itr = set.iterator();
		
		while (itr.hasNext())
		{
			temp = itr.next();
			if(temp.getFirstName().equalsIgnoreCase(Stu.getFirstName()))
			{
				if(temp.getLastName().equalsIgnoreCase(Stu.getLastName()))
				{
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @name CalculateGrade method 
	 * @param Student Stu
	 * @return description : Double
	 * @see CollegeOperations
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */

	public double CalculateGrade(Student Stu)
	{
		double temp = 0;		
		
		temp = ((Stu.getFinalGrade() + Stu.getMidtermGrade()) / 2.0);
		
		return temp;
	}

}
