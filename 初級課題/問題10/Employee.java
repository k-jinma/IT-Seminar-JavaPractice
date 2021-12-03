class Employee{
	int empNo;
	String empName;
	Employee(int tmpEmpNo, String tmpEmpName){
		empNo = tmpEmpNo;
		empName = tmpEmpName;
	}
	int getEmpNo(){
		return empNo;
	}
	String getEmpName(){
		return empName;
	}
}