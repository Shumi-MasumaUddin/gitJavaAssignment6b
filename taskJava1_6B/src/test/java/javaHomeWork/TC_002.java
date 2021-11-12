package javaHomeWork;

public class TC_002 {

	public int testData_a(int i1,int i2,int i3) {
		
		int calculation = -i1+i2*i3;
		return calculation;
	

	}
	
	public float testData_b(float f1,float f2,float f3) {
		
		float calculation = (f1+f2)%f3;
		return calculation;
	}
	
public float testData_c(float f1,float f2,float f3, float f4) {
		
		float calculation = f1+-f2*f3/f4;
		//int cal= (int) calculation;
		return calculation;
		
	}

public float testData_d(float f1,float f2,float f3, float f4, float f5) {
	
	float calculation = f1+f2/f3*f4-f5%f3;
	return calculation;
	
}

}
