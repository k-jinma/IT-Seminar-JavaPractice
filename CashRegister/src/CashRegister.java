import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    private int registerNo; // レジスターNo
    private Shop shop; // 店舗情報
    private ArrayList<Employee> employee; // 従業員一覧
    private static final double tax = 0.1; // 消費税
    private ArrayList<SalesDetail> salesDetails;
    private ArrayList<Item> items; // 商品情報

    Scanner sc = new Scanner(System.in);

    public CashRegister(int registerNo, Shop shop, ArrayList<Employee> employee,
            ArrayList<Item> items) {

        this.registerNo = registerNo;
        this.shop = shop;
        this.employee = employee;
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public static double getTax() {
        return tax;
    }

    public ArrayList<SalesDetail> getSalesDetails() {
        return salesDetails;
    }

    public void setSalesDetails(ArrayList<SalesDetail> salesDetails) {
        this.salesDetails = salesDetails;
    }

    public Employee login() {

        do {
            System.out.println("ログイン画面");
            System.out.print("従業員番号：");
            int inputNo = sc.nextInt();
            for (Employee emp : this.getEmployee()) {
                if (inputNo == emp.getEmpNo()) {
                    return emp;

                }
            }
            System.out.println("従業員コードが見つかりません");
        } while (true);

    }


}
