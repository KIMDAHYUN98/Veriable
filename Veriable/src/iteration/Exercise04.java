package iteration;

public class Exercise04 {
	public static void main(String[] args) {
		
		int i = (int)(Math.random()*5) + 1;
		int j = (int)(Math.random()*5) + 1;

		int sum = 0;
		sum = i+j;
		if (sum == 5) {
		
			System.out.println("(" + i + "," + j + ")");
		} else { 
			System.out.println("(" + i + "," + j + ")");
			
		}
	}

}
