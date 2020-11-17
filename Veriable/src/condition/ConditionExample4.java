package condition;

public class ConditionExample4 {
	public static void main(String[] args) {

		int num1 = 21;

		if (num1 % 3 == 0 && num1 % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");

			// 앞의 식과 뒤의 식이 참일 경우에 실행

		} else if (num1 % 5 == 0) {
			System.out.println("5의 배수입니다.");

		} else if (num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");

		} else {
			System.out.println("기타입니다.");
		}

	}

}
