package org.aricent.college;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.aricent.Operations.CollegeOperations;
import org.aricent.constants.Constants;
import org.aricent.student.Student;

/**
 * @name	: CollegeMain class
 * @author  : PRAVEEN KUMAR KRISHNAMOORTHY
 * @see	    : college
 * @version : Text 1.0
 * @since	: Jan 16, 2017 2017 11:14:16 AM
 */
public class CollegeMain 
{
	/**
	 * @name Main method 
	 * @param String Args
	 * @return description : Void
	 * @see CollegeMain
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  13-Jan-2017
	 */
    public static void main( String[] args )
    {
    	Scanner S = new Scanner(System.in);
    	CollegeOperations object = new CollegeOperations();
    	Student E;
    	int choice = 0;
    	while(true)
    	{
    		try
    		{
    		System.out.println("1->ADD STUDENT DATA\n2->DISPLAY STUDENT DATA\n3->SORT STUDENT DATA\n->EXIT\nEnter Your Choice");
    		choice = S.nextInt();
    		}catch(InputMismatchException e)
    		{
    			System.out.println("The Entered Choice should be an Integer");
    			S.next(); //FLUSH
    		}
    		switch(choice)
    		{
    		case Constants.ADD:
    			E = object.GetData();
    			if(false == object.isCheckRecord(E))
    			{
        			object.PutData(E);    				
    			}
    			else
    			{
    				System.out.println("Data already Exists , Cannot Insert Duplicate");
    			}
    			break;
    			
    		case Constants.DISPLAY:
    			object.Display();
    			break;
    		
    		case Constants.SORT:
    			object.Sort();
    			break;
    			
    		case Constants.EXIT:
    			S.close();
    			System.exit(0);
    		}
    	}
    }
}
