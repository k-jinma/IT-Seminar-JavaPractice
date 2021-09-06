package src;

public class Employee {

	private int empNo;
	private String empName;
	private int empRank;

	public Employee(int empNo, String empName, int empRank) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empRank = empRank;
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpRank() {
		return empRank;
	}
	public void setEmpRank(int empRank) {
		this.empRank = empRank;
	}


}
