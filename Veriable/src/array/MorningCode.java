package array;

public class MorningCode {
	public static void main(String[] args) {
		
		int[][] intAry = new int[5][5];
		int num = 1;
		
		for(int i=0; i< intAry.length; i++) {
			for(int j=0; j<intAry.length; j++) {
				System.out.println("intAry[" + i + "," + j + "]" + ">" +  num++);
				
			}
		}
		int [][] intAry2 =
			{
					{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20}
			
			};
		
		String[] strAry = { "Hello", "World" };
		for (String str : strAry) {
			System.out.println(str);
		}
		
		
//		for(int i=0; i< intAry.length; i++) {
//			for(int j=0; j<intAry[i].length; j++) {
//				System.out.println(intAry[i][j] + " ");
	//		}
	//		System.out.println();
	//	}
		
		
		System.out.println(intAry[0][0]);
		System.out.println(intAry[0][4]);
		
		System.out.println(intAry[1][0]);
		System.out.println(intAry[1][4]);
		
		System.out.println(intAry[2][0]);
		System.out.println(intAry[2][4]);
		
		System.out.println(intAry[3][0]);
		System.out.println(intAry[3][4]);
		
		System.out.println(intAry[4][0]);
		System.out.println(intAry[4][4]);
		
//		 intAry[0] = new int[] {0,4};
//	     intAry[1] = new int[] {0,4};
//	     intAry[2] = new int[] {0,4};
//		 intAry[3] = new int[] {0,4};
//	     intAry[4] = new int[] {0,4};
		
	}


}
