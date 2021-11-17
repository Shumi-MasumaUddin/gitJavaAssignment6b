package javaHomeWork;

import java.util.Scanner;

public class TC_006 {
	
	/*public static void main(String[] args) {
		
		reverse(" dsaf");
		reverse_Anotherway();
	}*/
		
				
	public void reverse(String input) {

		    if (input == null) {
		    	System.out.println("Please Enter An Input");
		    }

		    String output = "";

		    for (int i = input.length() - 1; i >= 0; i--) {
		        output = output + input.charAt(i);
		    }
		    System.out.println(output);

		}
		//  OR
	//Take input from user
		public void reverse_Anotherway() {
			System.out.println("Enter string input to reverse: ");
			Scanner sc = new Scanner(System.in);
			String myStrInput =sc.nextLine();
		
		if( myStrInput == null) {
			System.out.println("Please Enter An Input");
		}
			
			String output="";
			for (int i=myStrInput.length()-1;i>=0;i--) {
				 output= output+myStrInput.charAt(i);
				 				
			 }
			System.out.println(output);
		
			
			
			
		}
	

}
