package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	Connection conn = null;
	PreparedStatement pstmt;
	String sql;
	ResultSet rs;

	public List<Vo> getemployeeList() {
		conn = DAO.getConnection();
		sql = "SELECT employee_id, last_name, email, salary from employees";
		List<Vo> list = new ArrayList<Vo>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vo vo = new Vo();
				vo.setEmployeeNo(rs.getInt("employee_id"));
				vo.setName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				vo.setSalary(rs.getInt("salary"));

				list.add(vo);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;

	}

}
