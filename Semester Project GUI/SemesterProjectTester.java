//----------------------------------------------------
// Programmer:   Carlos Morales
// Course:       COSC 2436 Section 003
// Semester:     Spring 2021
// Assignment #: Semester Project
// Due Date:     4/28/21
//----------------------------------------------------

import java.awt.*;
import javax.swing.JFrame;

public class SemesterProjectTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x, y;
		
			// instantiate a frame
		JFrame frame = new JFrame("Searching comparison");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			// instantiate our 'primary' panel for our frame
		SemesterProjectGUI primary = new SemesterProjectGUI();
		
			// add this panel to the frame
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
			// center the frame on the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension size = frame.getSize();
		
		screenSize.height = screenSize.height / 2;
		screenSize.width = screenSize.width / 2;
		
		size.height = size.height / 2;
		size.width = size.width / 2;
		
		x = screenSize.width - size.width;
		y = screenSize.height - size.height;
		
		frame.setLocation(x, y);
		
	}   // end method main

}   // end class SemesterProjectTester