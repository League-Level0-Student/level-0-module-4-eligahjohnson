//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
    static int HL = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
 String frog = JOptionPane.showInputDialog("What type of pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		 for (int i = 0; i < 6; i++) {
			
					// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you like to do with your pet", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "clean up poop", "groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
                 if(task==0) {
                	 cuddle();
                 }
                 else if(task==1){
                	 cleanuppoop(); 
                		
                	}
                	 else if (task==2){
                		 
                	 }
                 
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
              if(HL>100) {
            	JOptionPane.showMessageDialog(null, "You Love your pet");   
               }
	}
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle() { JOptionPane.showMessageDialog(null, "Woff");
	HL=HL+5;		// TODO Auto-generated method stub
     
	}
	static void cleanuppoop() {
		JOptionPane.showMessageDialog(null, "Woff");
		HL=HL+100;

	}
	static void groom() {
		JOptionPane.showMessageDialog(null, "Woff");
		HL=HL+10;

	}
}
