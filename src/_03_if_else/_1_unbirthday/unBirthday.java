package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unBirthday {
public static void main(String[] args) {

	String userBirthday = JOptionPane.showInputDialog("When is your birthday? (mm/dd), e.g. 06/09");
	if (userBirthday.equalsIgnoreCase("06/29")) {
		JOptionPane.showMessageDialog(null, "I wish you a very happy birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "I wish you a very merry UNbirthday!");
	}
	
	
	
	
	
	
	
}
}
