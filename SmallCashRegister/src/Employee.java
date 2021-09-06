package src;

public class Employee {

	private int empNo;		// 従業員No
	private String empName;	// 従業員名
	private int empRank;	// 従業員区分(1:管理者,2:パート,3:アルバイト)

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
