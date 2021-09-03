import java.util.ArrayList;

public class CashRegister {
    private int registerNo; // レジスターNo
    private Shop shop;  // 店舗情報
    private ArrayList<Employee> employee;   // 従業員一覧
    private static final double tax = 0.1;  // 消費税
    private ArrayList<SalesDetail> salesDetails;
    
    public CashRegister(int registerNo, Shop shop, ArrayList<Employee> employee) {

        this.registerNo = registerNo;
        this.shop = shop;
        this.employee = employee;
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

    


}
