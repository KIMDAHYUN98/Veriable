package variable;

public class DataTypeExample {
	public static void main(String[] args) {
		byte num1 = 12;
		short num2 = 128;
		int num3 = 1000000000;
		long num4 = 100000000000L;

		byte val1 = 10;
		num3 = val1; // promotion

		// byte result = num1 + val1; //사칙연산은 더하기(-, *, /)의 의미가 int형으로 변환해서 계산

		byte result = (byte) (num1 + val1); // byte 유형으로 변환해서 계산 : casting

		num1 = 120; // -128 ~ 127
		for (int i = 0; i < 20; i++) {
	//		System.out.println(num1++); // for 구문에서 실행할 라인이 하나 밖에 없으면 중괄호 생략 가능
		}

		char char1 = 97;
		for (int i = 0; i < 26; i++)
			System.out.println(char1++);
		
		float floatVal = 4.567F;
		double doubleVal = 3.4567;
		
		
	}

}
