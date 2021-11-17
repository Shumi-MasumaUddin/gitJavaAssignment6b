package javaHomeWork;

import java.util.Scanner;

public class TC_009 {

//	public static void main(String[] args) {
//		converInchToMeter();
//
//	}
//	
	public void converInchToMeter() {
		
		System.out.println("Enter the input in inch: ");
		Scanner sc = new Scanner(System.in);
		double inch= sc.nextDouble();
		double meter = inch*0.0254;
		System.out.println(inch+" inch is "+meter+" meter");
		
		
	}

}
