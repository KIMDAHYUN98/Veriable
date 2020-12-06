package employee;

public class Vo {
	private int employeeNo;
	private String name;
	private String email;
	private int salary;

	public Vo(int employeeNo, String name, String email, int salary) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Vo() {

	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showEmpInfo() {
		System.out.println(employeeNo + "/" + name + "/" + email + "/" + salary);
	}

}
