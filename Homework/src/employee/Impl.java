package employee;

import java.util.List;

public class Impl implements Service {
	
	EmpDAO dao = new EmpDAO();

	public List getemployeeList() {
		
		return dao.getemployeeList();
	}

}
