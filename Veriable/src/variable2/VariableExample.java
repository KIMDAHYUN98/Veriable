package variable2;

public class VariableExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;
		
		String name = "Hong";
		int age = 10;
		double height = 178.8;
		
		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;
		
//		Person p1 =new Person();
//		System.out.println("p1의 이름 : " + p1.getName());
//		System.out.println("p1의 나이 : " + p1.getAge());
//		System.out.println("p1의 키 : " + p1.getHeight());
		
		// --> 생성자 초기값 출력됨
		
		Person p1 =new Person("kk", 12);
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 나이 : " + p1.getAge());
		
//		Person p1 = new Person("Choi", 20, 175.5, 72.4); //생성자(=Person)를 필드에다가 값을 지정
//		System.out.println("p1의 이름 : " + p1.getName());
//		System.out.println("p1의 나이 : " + p1.getAge());
//		System.out.println("p1의 키 : " + p1.getHeight());
		
		System.out.println("=============================");
		
//		Person p1 = new Person(); //Person class에 정의된 구조를 이용해서 만듦(=인스턴스), 초기값 : null
//		p1.name = "Hong"; //p1 변수이름
		p1.setName("홍"); //Person 클래스의 메소드로 인해 값이 바뀜
//		p1.age = 10;
		p1.setAge (11);
//		p1.height = 178.8;
		p1.setHeight(178.8);
		p1.setWeight(65.5);
//		p1.getName(); // string타입의 ??를 출력
//		System.out.println("p1의 이름 : " + p1.getName());
//		System.out.println("p1의 나이 : " + p1.getAge());
//		System.out.println("p1의 키 : " + p1.getHeight());
//		System.out.println("p1의 몸무게 : " + p1.getWeight());
//		p1.showInfo(); //메소드를 호출
		
		//메소드로 인해 값을 입력 할 수 있음
		
		Person p2 = new Person();
//		p2.name = "Hwang";
//		p2.age = 15;
//		p2.height = 188.8;
		p2.setName("Hwang");
		p2.setAge(15);
		p2.setHeight(188.8);
		p2.setWeight(75.5);
//		p2.showInfo();
		
		Person p3 = new Person();
//		p3.name = "Park";
//		p3.age = 17;
//		p3.height = 166.8;
//		p3.weight = 56.5; //class에 정의 되어있는 값만 출력할 수 있음
		p3.setName("Park");
		p3.setAge(17);
		p3.setHeight(166.8);
		p3.setWeight(60.5);
//		p3.showInfo();
		
		// 총 세개의 인스턴스를 만듦
		
//		Person[] persons = {p1, p2, p3}; // persons : 여러건의 배열을 담고 있음
//		for(Person per : persons) {
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);
//			System.out.println();
//		}
		
//		System.out.println(p1.name); //주소값을 출력
//		System.out.println(p1.age);
//		System.out.println(p1.height);
//		System.out.println(p1.weight); //기본 값 0.0
		
		
		
		
	}

}
