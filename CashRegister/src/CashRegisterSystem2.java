import java.util.ArrayList;

public class CashRegisterSystem2 {
    public static void main(String[] args) {

        // 従業員情報
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add( new Admin(1, "管理者", "admin") );
        employees.add( new PartTime(2, "パート１") );

        // レジを起動
        CashRegister register = new CashRegister(
            1,
            new Shop(1, "店舗１", "愛媛県松山市３番町", "089-111-2222"),
            employees
        );

        register.getEmployee().get(1).dispGyomu();
        register.getEmployee().get(0).dispGyomu();
    }
}
