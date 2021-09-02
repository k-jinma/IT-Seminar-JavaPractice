package kadai.mondai10;

public class CreateEmployee {
    public static void main(String[] args) {

        if( args.length != 2 ){
            System.err.println("Please input again.");
            System.exit(1);
        }
        int empNo = Integer.parseInt(args[0]);
        String empName = args[1];

        Employee emp = new Employee(empNo, empName);

        System.out.println("EmpNo    : " + emp.getEmpNo());
        System.out.println("EmpName  : " + emp.getEmpName());
    }
}
