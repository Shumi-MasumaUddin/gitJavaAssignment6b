package javaHomeWork;

import java.util.Scanner;

public class TC_003 {
	
	public void multiply(int num1,int num2) {
				
		int product = num1*num2;
		
	}
		// OR
public void multiply() {
		System.out.println("Enter the first num:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the second num:");
		int num2 = sc.nextInt();
				
		int product = num1*num2;
		System.out.println("Multiplication of these numers are:"+ product);
			
	
	}
}
