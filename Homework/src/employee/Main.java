package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
			
			Service service = new Impl();
			List<Vo> list = service.getemployeeList();
			for(Object vo : list) {
				Vo emp = (Vo) vo;
				emp.showEmpInfo();
			}
			
			Stream<Vo> stream = list.stream();
			stream.filter(t -> t.getSalary() > 100)
			.forEach(s -> System.out.println(s.getName() +"/" + s.getEmail()));
			
			
		}
}
