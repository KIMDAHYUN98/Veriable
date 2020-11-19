package variable2;

public class StudentExample {
	public static void main(String[] args) {
		
//		student s1 = new student();
//		s1.name = "Kim";
//		s1.stuno = 20;
//		s1.Engsore = 85.5;
//		s1.Mathsore = 73.3;
//		
//		student s2 = new student();
//		s2.name = "Mong";
//		s2.stuno = 19;
//		s2.Engsore = 99.9;
//		s2.Mathsore = 86.2;
//		
//		student[] students = {s1, s2};
//		for(student stu : students) {
//			System.out.println(stu.name);
//			System.out.println(stu.stuno);
//			System.out.println(stu.Engsore);
//			System.out.println(stu.Mathsore);
//			System.out.println();
//		}
		
		student s2 = new student();
		s2.setName("김다현");
//		s2.setName("KIMDAHYUN");
		s2.setNo(121212);
		s2.setEng(80);
		s2.setMath(70);
		
		s2.studentInfo();
		s2.totalScore();
		System.out.println("합계점수 : " + s2.totalScore());
		
	
	}

}
