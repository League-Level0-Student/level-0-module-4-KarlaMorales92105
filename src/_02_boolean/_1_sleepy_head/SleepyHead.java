package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(answer);
        if(answer == 1) {
        	isWeekday = true;
        }
        else {
        	isWeekday = false;
        }
        
        answer = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Get up lazybones!", JOptionPane.YES_NO_OPTION);
        if(answer == 0) {
        	isVacation = true;
        }
        else {
        	isVacation = false;
        }
        
        if(isVacation) {
        	JOptionPane.showMessageDialog(null, "Sleep in!");
        }
        else {
        	if(isWeekday) {
        		JOptionPane.showMessageDialog(null, "Get up lazybones!");
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "You get to sleep in!");
        	}
        }
        
        /*
         * Print "sleep in"? if it is a vacation or a weekend. 
         * If it's a weekday, print "get up lazybones!"? 
         * If it's a weekday, but we are on vacation,  print "sleep in"?.
         */
    }
}
