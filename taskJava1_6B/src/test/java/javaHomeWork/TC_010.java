package javaHomeWork;

import java.util.Scanner;

public class TC_010 {
//
//	public static void main(String[] args) {
//		compute_BMI();
//
//	}
	
	public void compute_BMI() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight in pounds: ");
		double weight = sc.nextDouble();
		System.out.println("Enter the height in inches: ");
		double height = sc.nextDouble();
		double BMI= (weight/(height*height))*703;
		System.out.println("Calculated BMI is : "+BMI);
		
	}

}
