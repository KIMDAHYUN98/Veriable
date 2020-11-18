package array;

public class ArrayExample4 {
	public static void main(String[] args) {
		int [][] intAry = new int[3][3]; //이차원배열?, 3행(칼럼) 3열
		intAry[0] = new int[] {11, 12, 13};
		intAry[1] = new int[] {21, 22, 23};
		intAry[2] = new int[] {31, 32, 33};
		
		System.out.println(intAry[0][0]);
		System.out.println(intAry[0].length);
		
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {
				System.out.println("intAry[" + i + "," + j + "]" + ">" + intAry[i][j]);
				
			}
		}
		
		int[][] intAry2 = {
				{11, 12}, // 1행 3열
				{21},// 2행 1열
				{31, 32} // 3행 2열
				};
		
		System.out.println(intAry2.length);
		}
	}

