package helloWorld;

public class Exercise {
	public static void main(String[] args) {
		
		int[][] intAry = new int[5][5];
		
		int num = 1;
		
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry.length; j++)
				
				System.out.println("intAry[" + i + ", " + j + "]" + ">" + num++);
		}
		
		int[][] intAry2 =
			{ { 1, 2, 3, 4, 5,
			    6, 7, 8, 9, 10,
			    11, 12, 13, 14, 15,
			    16, 17, 18, 19, 20 }
			};
		
		System.out.println(intAry2[0][1]);
		
		String[][] strAry =
			{
					{ "Hello", " World" }
			};
//		for(String str = 0; str < strAry.length; str++) {
//			
//			System.out.println(sum);
//		} 
			
		
	}
}