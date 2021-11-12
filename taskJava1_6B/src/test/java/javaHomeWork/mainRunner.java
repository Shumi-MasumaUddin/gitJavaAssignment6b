package javaHomeWork;

public class mainRunner {

	public static void main(String[] args) {
		
		TC_001 answer1 = new  TC_001();
		System.out.println("Output of the Task_1 is:"); 
		answer1.printAnything();
		
		TC_002 answer2 = new TC_002();
		System.out.println("Output of the Task_2 is:"); 
		System.out.println(answer2.testData_a(5, 8, 6));
		System.out.println(answer2.testData_b(55, 9, 9));
		System.out.println(answer2.testData_c(20,3,5,8));
		System.out.println(answer2.testData_d(5,15,3,2,8));
		System.out.println(" ");
		
		TC_003 answer3 = new TC_003();
		System.out.println("Output of the Task_3 is:");
		answer3.multiply();
		//answer3.multiply(25,5);
		System.out.println(" ");
		
		TC_004 answer4 = new TC_004();
		System.out.println("Output of the Task_4 is:");
		answer4.multiplyTable();
		System.out.println(" ");
		
		TC_005 answer5 = new TC_005();
		System.out.println("Output of the Task_5 is:");
		answer5.convertLowerCase();
		System.out.println(" ");
		
		
		TC_006 answer6 = new TC_006();
		System.out.println("Output of the Task_6 is:"); 
		answer6.reverse("dsaf");
		answer6.reverse_Anotherway();
		System.out.println(" ");
		
		TC_007 answer7 = new TC_007();
		System.out.println("Output of the Task_7 is:"); 
		answer7.compare_Value();
		System.out.println(" ");
		
	}

}
