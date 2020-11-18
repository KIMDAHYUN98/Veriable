package variable;

public class ArrayExample0 { 
	public static void main(String[] args) {
		
		int[] intAry = new int[5]; // 초기값 : 0, int 타입으로 5개의 index를 만들겠다
		intAry[0] = 15;
		intAry[4] = 33;
		for(int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}
		
		double[] doubleAry; // 크기 & 값 지정 X (=null 값), 변수 선언 / (= double[] doubleAry {2.3, 2, 4.5, 2.2, 1.6};)
		doubleAry = new double[] {2.3, 2, 4.5, 2.2, 1.6}; // 크기 & 값 지정 O
		System.out.println(doubleAry[0]);
		double sum = 0;
		for(int i=0; i < doubleAry.length; i++) { // i < doubleAry = i < 5
			sum += doubleAry[i];
		}
		System.out.println("sum : " + sum);
		
		// enhanced for (확장 for, 더 간단)
		sum = 0;
		for (double j : doubleAry) { // 배열(doubleAry)의 크기만큼 반복해서 실행해라. db1 = 변수
			sum += j;
			//System.out.println(j);
		}
		System.out.println("sum : " + sum);
	}

}
