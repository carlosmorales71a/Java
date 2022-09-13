//----------------------------------------------------
// Programmer:		Carlos Morales
// Course: 			COSC 2436 Section 003
// Semester: 		Spring 2021
// Assignment #:	10a
// Due Date: 		4/14/2021   
//----------------------------------------------------

import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
			// declare variables to be used
			// in the program
		int number, theFact;
		String numberText;
		
		do
		{
				// prompt the user to enter an integer
				// number and then read it in and
				// parse it into an integer data type
			numberText = JOptionPane.showInputDialog(null,
							"Enter an integer number " +
							"(or -1 to quit)");
			number = Integer.parseInt(numberText);
			
			if (number != -1)
			{
				// invoke the method 'fact'
				// to calculate the factorial
				// of 'number'
			theFact = fact(number);
			
			JOptionPane.showMessageDialog(null,
						"The factorial of " + number +
						"! is " + theFact);
				
			} // end if statement
			
		}	while (number != -1);
		
		JOptionPane.showMessageDialog(null,
				"This program was written by Carlos Morales." +
				"\nEnd of program.");
		
	} // end method main
	
	public static int fact(int num)
	{
		int answer;
		
			// test to see if the base case
			// has been reached. The base
			// case is when 'num' is
			// less than or equal to one
		if (num <= 1)
		{
			System.out.println("\nReached base case. " +
								"Return1");
			return 1;
		} // end if statement
		else
		{	// recursively call the method 'fact'
			// again. Pass the parameter by
			// subtracting one from 'num'
			
				/* num! = num * (num - 1)! */
			answer = num * fact(num -1);
			
			System.out.println("Processing: " +
								num + " * " +
								(num - 1) + "!" +
								"-> " + answer);
			return answer;
			
		} // end else statement
		
	} // end method fact

} // end class Factorial
