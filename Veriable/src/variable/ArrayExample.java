package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int[] numbers = { 10, 20, 30, 40, 50 }; // 값을 여러개 담을 수 있는 배열변수의 데이터 타입
		numbers[1] = 200; // 값을 넣을 수 있음, [] : index, index 값은 0부터 시작
		System.out.println(numbers[1]); // 해당된 위치의 값을 가져옴

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];

		}
		System.out.println("합: " + sum);

		String[] strings = { "Hello", "World", //
				"Nice", "To", "Meet" };
		strings[2] = "Good";
		for (int i = 0; i < strings.length; i++) { // strings.length : 5
			System.out.println(strings[i]);
		}
	}

}
