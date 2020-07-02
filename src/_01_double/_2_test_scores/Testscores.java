	package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Testscores {

	public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("What was your test score?");
		
		//int score = Integer.parseInt(answer);
		double score = Double.parseDouble(answer);
		
		if(score >= 70) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied very hard!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Oops. Don't worry, just keep studying!");
		}
	
	
	
	}
}
