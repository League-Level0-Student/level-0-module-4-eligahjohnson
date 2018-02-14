//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    
     int king = JOptionPane.showConfirmDialog(null, "is a week day?");
     if(king==0) {
    	 int vacation = JOptionPane.showConfirmDialog(null, "is vacation??");
    	 if(vacation==0) {
    		 JOptionPane.showMessageDialog(null, "sleep in");
    	 }
    	 else	 JOptionPane.showMessageDialog(null, "Get up LazyBone!");
     }
     if(king==1) {
    	 JOptionPane.showMessageDialog(null, "Sleep in ");
     }
     
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
