
public class OperatorExample2 {
	public static void main(String[] args) {
		
		int num1 = 3;
		num1 /= 2;
		

		// 1) if 구문
		
		if (num1 % 2 == 0) {
			System.out.println("num1는 짝수입니다.");
		} else {
			System.out.println("num1는 홀수입니다.");
		}
		
		// 2) ? : 구문
		
//		int result = 0; // 짝수 : 0, 홀수 : 1
			
		boolean result = true; // 짝수 : true, 홀수 : False
		
//		String  result1 = (num1 % 1) == 0 ? "True" : "False";
//		System.out.println(result1);
		
		
	}

}
