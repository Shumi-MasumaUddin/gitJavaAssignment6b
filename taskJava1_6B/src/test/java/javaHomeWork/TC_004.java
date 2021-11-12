package javaHomeWork;

import java.util.Scanner;

public class TC_004 {
	
	public void multiplyTable() {
		
		
		System.out.print("Enter the Number for Multiplication Table: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		for(int i=1;i<=10;i++) {
			 
			System.out.println(num + "*"+ i + "=" + num*i);
			
			
		}
		
		
	
	}
	//OR

	//Take input from user
	public void multiplyTable2() {
		
		System.out.print("Enter the Number for Multiplication Table: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int i=1;
		while (i<=10) {
			
			System.out.println(num+"*"+i+"="+num*i);
			i++;
			
		}
		
	}
//	public static void main(String[] args) {
//		
//		multiplyTable();
//	}
//	
	
}
