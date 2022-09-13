//----------------------------------------------------
// Programmer:		Carlos Morales
// Course: 			COSC 2436 Section 003
// Semester: 		Spring 2021
// Assignment #:	10b
// Due Date: 		4/14/2021   
//---------------------------------------------------- 

import javax.swing.*; 

public class DecimalToBinary {
	
		// declare a global string variable
		// for displaying the binary number
	static String output;	

	public static void main(String[] args) {
			// declare variables to be used
			// in program
		int decimalNumber, base;
		String numberText;
		
			// make our base two since
			// we are converting to binary
		base = 2;
		
		do
		{
				// prompt the user to enter an integer
				// base 10 number, then read it in
				// and convert it to an integer
				// data type
			numberText = JOptionPane.showInputDialog(null,
							"Enter an integer number " +
							"in base 10 (or 0 to quit)");
			decimalNumber = Integer.parseInt(numberText);
			
			if (decimalNumber != 0)
			{
				output = "Decimal number: " +
							decimalNumber +
							"\nBinary number: ";
				
					// invoke the method 'decToBin'
					// to convert the decimal
					// number to binary
				decToBin(decimalNumber, base);								
				
					// display the 'output' string
					// variable that contains
					// the binary equivalent of 
					// the decimal number					
				JOptionPane.showMessageDialog(null,
						output,
						"Decimal to Binary equivalent",
						JOptionPane.INFORMATION_MESSAGE);
			}	// end if statement
			
		} while (decimalNumber != 0);
		
		JOptionPane.showMessageDialog(null,
				"This program was written by Carlos Morales." +
				"\nEnd of program.",
				"Good bye!",
				JOptionPane.INFORMATION_MESSAGE);

	}	// end method main
	
	public static void decToBin(int num, int base)
	{
		if (num > 0)
		{
				// recursively call the method
				// 'decToBin' again. Pass the
				// first parameter by dividing
				// 'num'  by the 'base'. The
				// second parameter is always
				// 'base'
			decToBin((num / base), base);
			
				// concatenate the remainder of
				// the current value of 'num'
				// and 'base'
			output = output + (num % base);
			System.out.println("Current answer: " +
								output);
			
		}	// end if statement
		else
		{	// we have reached our base case here
			System.out.println("\nReached base case.");
			return;			
		} // end else statement
	}	// end method decToBin
	
}	// end class DecimalToBinary
