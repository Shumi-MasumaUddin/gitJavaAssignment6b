package javaHomeWork;

import java.util.Scanner;

public class TC_007 {
	
//	public static void main(String[] args){
//		
//		compare_Value();
//		
//	}
	
	
	
	public static int compare_Value() {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the first number : ");
	    int x = sc.nextInt();  
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();
		
		if(x>y) {
			
			System.out.println("The Larger value is :"+x);
			return x;
		}
		else if (x==y) {
			System.out.println("Both numbers are Equal");
			return 0;
		}
		else if (x%6==y%6) {
			
			if (x<y) {
				System.out.println("The smaller value is : "+x);
				return x;
			}else
				System.out.println("The smaller value is : "+y);
				return y;
			
		}
		else
			{System.out.println("The Larger value is :"+y);
			return y;}
			
			
	}

}
