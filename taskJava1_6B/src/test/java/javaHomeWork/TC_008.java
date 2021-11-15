package javaHomeWork;

public class TC_008 {

//	public static void main(String[] args) {
//		
//		find_Largest();
//	}
	
	static int array[]= {20,30,40};
	public static void find_Largest() {

		
		int large = array[0];
		for(int i=0; i<array.length;i++) {
			
			if(array[i]>large) {
				large=array[i]; }
		}
				
		System.out.println("The largest num of array is: "+large);
	}

}
