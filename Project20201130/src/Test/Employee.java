package Test;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String hireDate;
	private int departmentId;
	private int salary;
	private String jobId;
	
	public Employee() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Employee(int employeeId, String firstName, String lastName, String hireDate, int departmentId, int salary, String jobId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.departmentId = departmentId;
		this.salary = salary;
		this.jobId = jobId;
	}
	
	public void showEmpInfo() {
		System.out.println("이름 : " + firstName + ", employeeId : " + employeeId + ", salary : " + salary + ", jobId : " + jobId + ", departmentId : " + departmentId);

	}

}
