package variable2;

public class student {
	private String name;
	private int stuno;
	private double Engsore;
	private double Mathsore;

	public void studentInfo() { // 반환값 : x => void
		System.out.println("이름 : " + name + ", 학번 : " + stuno);
	}

	public double totalScore() { // 반환 값 : int, double
		return Engsore + Mathsore; //출력X
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int stuno) {

		this.stuno = stuno;
	}

	public void setEng(int Engsore) {
		this.Engsore = Engsore;
	}

	public void setMath(int Mathsore) {
		this.Mathsore = Mathsore;
	}

//	public double getEng() {
//		return this.Engsore;
//	}
//
//	public double getMath() {
//		return this.Mathsore;
//	}

}
