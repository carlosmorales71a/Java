	// import for number formatting
import java.text.DecimalFormat;

public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;

		// add instance fields for the three test scores
	private int test1, test2, test3;
	
	public Student(String first, String last, Address home,
			       Address school, int t1, int t2, int t3)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		
		   // set test scores to be parameter values
		test1 = t1;
		test2 = t2;
		test3 = t3;
		

	}   // end constructor Student
	
	public Student(String first, String last, Address home,
		       Address school)
    {
	    firstName = first;
	    lastName = last;
	    homeAddress = home;
	    schoolAddress = school;
	    
	       // set test scores to be zero
	    test1 = 0;
		test2 = 0;
		test3 = 0;

    }   // end overloaded constructor Student
	
	public void setTestScore(int testNumber, int score)
	{
		switch(testNumber)
		{
		case 1: test1 = score; break;
		case 2: test2 = score; break;
		case 3: test3 = score; break;
		default: System.out.println("Error.  " +
					testNumber + " does not exist!");
		}

	}   // end method setTestScore
	
	public int getTestScore(int testNumber)
	{
		int testScore;
		
		switch(testNumber)
		{
		case 1: testScore = test1; break;
		case 2: testScore = test2; break;
		case 3: testScore = test3; break;
		default: System.out.println("Error.  " +
					testNumber + " does not exist!");
				testScore = -1;
		} //end switch statement
		
		return testScore;	// to be taken out
		
	}   // end method getTestScore
	
	public double getAverage()
	{
		double average;
		
			// calculate average test score
		
		average = (test1 + test2 + test3) / 3.0;
		
		return average;	// to be taken out
	}   // end method getAverage
	
	public String toString()
	{
		String result;
		
		   // declare type of format for formating numbers
		DecimalFormat fmt = new DecimalFormat("0.##");
		
			// build up string for display
		result = "Student: ";
		result += firstName + " " + lastName + "\n\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result +="\nSchool Address:\n" + schoolAddress;
		
		
		    // add information about the test scores
		result += "\n\nTest 1 score: " + test1;
		result += "\nTest 2 score: " + test2;
		result += "\nTest 3 score: " + test3;
		result += "\nAverage test score: " + 
					fmt.format(getAverage());

		
		return result;	// to be taken out;
	}   // end method toString
	

}   // end class Student
