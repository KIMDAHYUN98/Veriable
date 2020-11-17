
public class VariableExample {
	public static void main(String[] args) {
		int num1, num2, result;
		String resultStr = " 결과 값은 ";
		
		num1 = 20;
		num2 = 30;

		if (num1 > num2) {
		result = num1 - num2;
		} else {
	    result = num2 - num1;
		}
		System.out.println(resultStr + result);
	}

}
