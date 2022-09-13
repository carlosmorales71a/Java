//------------------------------------------
// Programmer: 		Carlos Morales
// Course: 			COSC 1336 Section 012
// Semester: 		Summer 2018
// Assignment #: 	Semester Project
// Due Date: 		July 18, 2018
//------------------------------------------

	// import classes and packages to be used
import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class KennedySpeech {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
		throws FileNotFoundException {
		
			// declare variables to be used
			// in this program
		int max;
		String output;
		File f = new File("OriginalSpeech.txt");
		File f2 = new File("FormattedSpeech.txt");
		File f3 = new File("FormattedSpeech.txt");
		Scanner inputFile = new Scanner(f);
		Scanner inputFile2 = new Scanner(f2);
		PrintStream outputFile = new PrintStream(f3);

		
			// display the absolute path name of file
			// that holds the unformatted speech
		displayAbsolutePath(f);
		
			// invoke method 'getNumCharacters' to get
			// the number of characters from the user
		max = getNumCharacters();

			// print out title for file that will
			// hold the formatted speech
		output = "\nPresident Kennedy's inaugural speech " +
			"with " + max + " characters per line:";
		outputFile.println(output);
		outputFile.println();
		
			// invoke method 'readFromfile' to read unformatted
			// speech and then format it
		readFromFile(inputFile, outputFile, max);
		
			//close files
		closeFile(inputFile);
		closeFile(outputFile);
		
			// print out formatted speech by invoking
			// method 'printFormattedSpeech'
		printFormattedSpeech(inputFile2);
		closeFile(inputFile2);

			// build up string for final output
		output = "This program was written by Carlos Morales." +
				"\nEnd of program.";
		
			// display final 'output' string by
			// invoking the method 'displayString'
		displayString(output);
		
	}	// end method main
	
	public static int getNumCharacters()
	{		
		String numCharactersText;
		int numCharacters;
		
			// prompt the user for the number of character
			// on each line that the formatted speech will
			// have, then read it in
		
		numCharactersText = JOptionPane.showInputDialog(null,
			"How many characters per line would you like?");
		numCharacters = Integer.parseInt(numCharactersText);
		
			// return this number
		return numCharacters;
	}	// end method getNumCharacters
	
	public static void displayAbsolutePath(File f)
	{
			// display the absolute path of input file
		JOptionPane.showMessageDialog(null,
				"The absolute path of the original " +
				"file is: \n" +
				f.getAbsolutePath(),
				"Absolute path of original file",
				JOptionPane.INFORMATION_MESSAGE);
	}	// end method displayAbsolutePath
	
	public static void readFromFile(Scanner inputFile,
 					  PrintStream outputFile,
					  int max)
	{
		String word;
		int wordCount, lineCount = 0;
		boolean answer;
		
			// using a while loop, go through each 'word' 
			// of the unformatted speech and place it in its
			// appropriate place in the formatted file
		while (inputFile.hasNext())
		{
				// get next word from file and
				// obtain its length
			word = inputFile.next();
			wordCount = word.length();
			
				// invoke the method 'checkIfParagraphNumber'
				// to see if this current 'word' is a
				// paragraph number			
			answer = checkIfParagraphNumber(word);
			
				//it is a paragraph number
			if (answer)
			{
					// advance two new lines for new
					// paragraph and change value of 
					// 'lineCount' to start again
					// at zero
				outputFile.println();
				outputFile.println();
				lineCount = 0;
				
			}	// end if statement
			
				// not a paragraph
			if (answer == false)
			{
					// we will go beyond the number of
					// character on this current line
				if ((lineCount + wordCount + 1) >= max)
				{
						// start new 'lineCount'
					lineCount = 0;
					
						// update new value of 'lineCount'
						// that includes the length of this
						// word plus one (for a space)
					lineCount = lineCount + wordCount + 1;
					
						// print out this word to
						// the formatted file
					outputFile.println();
					outputFile.print(word + " ");
				}	// end if statement
				else	// can safely continue printing this
				{		// word on the current line (i.e. it
						// fits on this line without
						// exceeding 'max' characters)
					outputFile.print(word + " ");
					
						// update new value of 'lineCount'
						// that includes the length of this
						// word plus one (for a space)
					lineCount = lineCount + wordCount + 1;					
				}	// end else statement
						
			}	// end outer if statement
			
		}	// end while loop
		
	}	// end method readFromFile
	
	public static boolean checkIfParagraphNumber(String word)
	{		
		char aChar;
		int i, n;
		boolean answer;

			// get the length of this current 'word'
		n = word.length();
		i = 0;
		
			// using a while loop, scan through each
			// character of 'word' to see if it is a number
		while (i < n)
		{
			aChar = word.charAt(i);
			
			switch(aChar)
			{
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': answer = true; break;
			default: answer = false; // not a number
			}	// end switch statement
			
			i++;
		}	// end while loop
		
			// get last character in this string to test
			// to see if it is a paragraph number
		aChar = word.charAt(n - 1);
				
			// check to see if this is really
			// a paragraph number
		if (aChar == '#') // yes it is
		{
			answer = true;
		}
		else // not a paragraph number
		{
			answer = false;
		}
		return answer;
	}	// end method checkIfParagraphNumber
	
	public static void printFormattedSpeech(Scanner inputFile2)
	{		
		String line;
		
			// using a while loop, read each line from
			// the newly created file that holds the
			// formatted speech and print it to the screen
		while (inputFile2.hasNext())
		{
			line = inputFile2.nextLine();
			System.out.println(line);
		}	// end while loop
		
	}	// end printFormattedSpeech
	
	public static void closeFile(Scanner fileName)
	{
			// close file
		fileName.close();
	}	// end closeFile
	
	public static void closeFile(PrintStream fileName)
	{
			// close file
		fileName.close();
	}	// end closeFile (overloaded)

	public static void displayString(String outString)
	{
			// print out the formal parameter 'outString'
		JOptionPane.showMessageDialog(null,
						outString,
						"Good bye!",
						JOptionPane.INFORMATION_MESSAGE);
	}	// end method displayString

}	// end class KennedySpeech
