package array;

public class ArrayExample3 {
	public static void main(String[] args) {

		int num1 = 100, num2 = 11, num3 = 30;
		int temp; // temp : 변수

		// 세 변수의 들어 있는 값 중... 가장 큰 값을 temp
		if (num1 > num2) {
			if (num1 > num3) {
				temp = num1;
			} else {
				temp = num3;
			}
		} else if (num1 < num2) {
			if (num2 > num3) {
				temp = num2;
			} else {
				temp = num3;
			}
		} else {
			temp = num3;
		}

		System.out.println("큰 수는 : " + temp);
		temp = 0;
		int[] intAry = { 34, 25, 57, 39, 55 };
		for (int num : intAry) {
			if (temp < num) {
				temp = num;
			}
		}
		System.out.println("큰 수는 : " + temp);
	}

}
