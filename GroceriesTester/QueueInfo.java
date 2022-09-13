
public class QueueInfo {
		// declare instance fields to 
		// represent a shopper's
		// name and their grocery bill
	private String name;
	private double bill;
	
	public QueueInfo(String newName, double newBill)
	{
		name = newName;
		bill = newBill;
	}	// end constructor QueueInfo
	
	public String toString()
	{
		return "Shopper's name '" + name +
				"', and their bill " + bill;
	}	// end method toString

}	//end class QueueInfo
