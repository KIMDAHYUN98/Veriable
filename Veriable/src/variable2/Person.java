package variable2;

public class Person {
	//main 메소드 없음, 값을 가질 수 있는 다른 타입의 데이터를 담을 수 있는 유형?
	
	//1. 필드 (반환 타입을 지정)
	private String name; // private : 외부의 접근 제한
	private int age;
	private double height;
	private double weight;
	
	//2. 생성자 : 필드의 초기값 저장.
	public Person() { // 반환 타입이 없음 (void, string...)
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, double height, double weight) { //=매개변수
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	//매개변수를 필드에다가 값을 지정
	}
	
	
	//3. 메소드 : 여러 개 만들 수 있음, 기능을 구현 (반환 타입을 지정)
	public void showInfo() { //public : 공용?
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + height); //name, age, height = 위의 필드
				
	}
	// 필드에 값을 저장, 불러오는 기능
	
	public void setName(String name) { //setName : 메소드
		this.name = name; // 클래스에 있는 매개변수의 필드값을 바꾸겠다
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public void setAge(int age) {
		if(age > 0)
			this.age = age; //잘못된 값의 입력을 방지
		else
			this.age = age;
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
