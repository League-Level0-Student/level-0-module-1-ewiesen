package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Ben = "A Great Singer";
		String Bryce = "test2";
		String Evan = "test";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String userName = JOptionPane.showInputDialog("Enter your name");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (userName.equalsIgnoreCase("Ben")) {
			JOptionPane.showMessageDialog(null, Ben);
		}
		if (userName.equalsIgnoreCase("Bryce")) {
			JOptionPane.showMessageDialog(null, Bryce);
		}
		if (userName.equalsIgnoreCase("Evan")) {
			JOptionPane.showMessageDialog(null, Evan);
		}
	}
}

