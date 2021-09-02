package kadai.mondai10;

public class Employee {
    int empNo;      // 社員番号
    String empName; // 社員名

    public Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }
    
}
