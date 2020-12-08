package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class Example06 {
public static void main(String[] args) {
		
		
		Connection conn = DAO.getConnection();
		List<Employee> list = new ArrayList<>();
		try {
			String sql = "select * from emp1";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setfirstName(rs.getString("first_name"));;
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setJobId(rs.getString("job_id"));
				list.add(emp); 

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Stream<Employee> stream = list.stream();
		stream.forEach((t) -> t.showEmpInfo());
		
		System.out.println("[ 부서가 IT_PROG인 사원의 평균급여 ]");
		
		OptionalDouble avg = list.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
		}).mapToDouble(new ToDoubleFunction<Employee>() {

			@Override
			public double applyAsDouble(Employee value) {
				return value.getSalary();
			}
			
		}).average();
		
		System.out.println("평균 급여 : " + avg.orElse(0.0));
			
	
		

		
		
}
}