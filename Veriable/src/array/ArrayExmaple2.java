package array;

public class ArrayExmaple2 { 
	public static void main(String[] args) {
		double sum = 0;
		double[] dAry = {23.2, 55.3, 52.8, 62.8};
		sum = doubleSum(dAry);
		
		double avg = 0;
		avg = doubleAvg(dAry);
		
		//메소드 호출
		System.out.println("결과 값 : " + sum);
		System.out.println("결과 값 : " + avg);
	}

	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry(변수이름)
	// method : doubleSum(), 매개변수 : double[]
	// 반환해주는 값 : double
	
	public static double doubleSum(double[] dAry){
	double sum = 0;
	for (double i : dAry) {
		sum += i;
	}
	return sum;
		
	}
	
	public static double doubleAvg(double[] dAry) {
		double sum = 0;
		double avg = 0;
		for (double i : dAry) {
			sum += i;
			avg = sum/dAry.length;
		}
		
		return avg;
	}
}
