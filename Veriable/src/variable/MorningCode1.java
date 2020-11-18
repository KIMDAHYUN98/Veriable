package variable;

public class MorningCode1 {
	public static void main(String[] args) {

		int[] Numbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		int i = 0;

		// 홀수 값의 합 : sum 변수에 저장하고 출력

		for (i = 0; i <= 5; i++) {

			if (Numbers[i] % 2 != 0) {
				sum += Numbers[i];
			}
		}
		System.out.println(sum);

		int avg = 0;

		for (i = 0; i <= 5; i++) {
			
			if(Numbers[i] % 2 != 0)

			avg += Numbers[i];
		}
		System.out.println(avg/3);
		
	}

}
