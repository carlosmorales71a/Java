//----------------------------------------------------
// Programmer: 		Carlos Morales
// Course: 			COSC 1437 Section 004
// Semester: 		Summer 2019
// Assignment #: 	Semester Project
// Due Date: 		July 10, 2019
//----------------------------------------------------

import java.awt.*;
import javax.swing.JFrame;

public class PizzaOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x, y; // used to center frame

		   // instantiate a frame
		JFrame frame = new JFrame ("Carlos' Pizza!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		   // instantiate our 'primary' panel for our frame
		PizzaControls primary = new PizzaControls();
				
		   // add this panel to the frame
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
			// center the frame on the screen
		Dimension screenSize = 
				Toolkit.getDefaultToolkit().getScreenSize();
		Dimension size = frame.getSize();
		screenSize.height = screenSize.height / 2;
		screenSize.width = screenSize.width / 2;
		size.height = size.height / 2;
		size.width = size.width / 2;
		y = screenSize.height - size.height;
		x = screenSize.width - size.width;
		frame.setLocation(x, y);
		
	}   // end method main

}   // end class PizzaOrder
