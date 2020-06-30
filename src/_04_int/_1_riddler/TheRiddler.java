package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int gameScore = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String userAnswer1 = JOptionPane
				.showInputDialog("What can travel around the world \nwhile staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (userAnswer1.equalsIgnoreCase("A Stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			gameScore++;
			JOptionPane.showMessageDialog(null, "Your score is now " + gameScore);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer was: \nA Stamp");
			JOptionPane.showMessageDialog(null, "You score is still " + gameScore);
		}
		// 6. Add some more riddles
		String userAnswer2 = JOptionPane.showInputDialog("What has hands \nbut can't clap?");
		if (userAnswer2.equalsIgnoreCase("A Clock")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			gameScore++;
			JOptionPane.showMessageDialog(null, "Your score is now " + gameScore);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer was: \nA Clock");
			JOptionPane.showMessageDialog(null, "You score is still " + gameScore);
		}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,
				"Good job! You got a score of " + gameScore + "/2! Can you do better next time?");
	}
}
