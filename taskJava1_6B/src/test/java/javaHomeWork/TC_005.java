package javaHomeWork;

import java.util.Scanner;

public class TC_005 {
	
//	public static void main(String[] args) {
//	
//		convertLowerCase();
//	
//}
	
	public void convertLowerCase() {
	System.out.println("Enter string input in Capital Letter:  ");
	Scanner sc = new Scanner(System.in);
	String sentence =sc.nextLine();
	String convert= sentence.toLowerCase();
	System.out.println("Converted to lowercase string is: " + convert);
	
	
	}


}
