package iteration;

public class MorningCode {
	public static void main(String[] args) {

		int sum7 = 7;

		for (int i = 1; i <= 50; i++) {
			if(i%sum7 == 0) {
				System.out.println(i + " 는 7의 배수입니다.");
			}
		}
		
		int sum8 = 8;
		
		for (int j =1; j<= 50; j++) {
			if(j % sum8 == 0) {
				System.out.println(j + " 는 8의 배수입니다.");
			}
		}
		
		
	}

}
