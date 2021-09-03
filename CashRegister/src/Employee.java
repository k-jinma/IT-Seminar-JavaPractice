public class Employee {
    private int empNo;  // 従業員No
    private String name;    // 従業員名
    private String[] gyomu = {"販売", "終了"}; // 業務の種類

    public Employee(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGyomu() {
        return gyomu;
    }

    public void setGyomu(String[] gyomu) {
        this.gyomu = gyomu;
    }

    // 業務を表示する
    public void dispGyomu(){
        for( int i = 1; i < getGyomu().length; i++ ){
            System.out.println( i + ":" + getGyomu()[i-1] );
        }
    }

    // 販売業務をする
    public void hanbai(){

    }

}
