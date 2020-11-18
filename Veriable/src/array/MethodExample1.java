package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("45"); // 숫자와 같은 다른 타입을 넣으면 에러, but "45" --> 문자열 타입
		int result = showDouble(45);
		System.out.println("반환 : " + result);
		System.out.println("반환 : " + showDouble(33.2));
		System.out.println("반환 : " + multi(33, 22, 11));
		System.out.println("반환 : " + divide(2, 11.5));
	}

	public static void showInfo(String name) { // String = 매개변수
		System.out.println("안녕하세요. " + name + " 입니다.");
	}
	
	public static int showDouble(int num) { //showDouble : 입력한 값의 두배를 반환
		return num * 2;
		
	}
	
	public static double showDouble(double num) { //showDouble
		return num * 2;
		
	}
	
	// 정수형 변수 2개를 받아서 두 수의 합을 반환해주는 메소드(sum)
	
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	
	// 정수형 변수 3개를 받아서 세 수의 곱을 반환해주는 메소드
	
	public static int multi(int z, int x, int c) {
		int result = 0;
		result = z * x * c;
		return result;
	}
	
	// double 2개를 받아서 첫번째 매개변수/ 두번째 매개변수 (divide)
//		public static double divide(double a, double b) {
//		double result = 0;
//		result = a/b;
//		return result;
//		}
	
	// double 2개를 받아서 큰수/작은수 (divide)
	public static double divide(double a, double b) {
		double result = 0;
		if(a>b) {
			result = a/b;
			return result;
		} else {
			result = b/a;
			return result;
		}
	}
}
