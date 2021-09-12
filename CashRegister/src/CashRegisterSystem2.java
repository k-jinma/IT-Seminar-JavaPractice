import java.util.ArrayList;

public class CashRegisterSystem2 {
    public static void main(String[] args) {

        // 従業員情報
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Admin(1, "管理者", "admin"));
        employees.add(new PartTime(2, "パート１"));

        // 商品情報
        ArrayList<Item> items = new ArrayList<Item>();
        FoodItem fi = new FoodItem(1, "ポテチ", 120);
        OtherItem oi = new OtherItem(2, "歯磨き粉", 200);
        items.add(fi);
        items.add(oi);

        // レジを起動
        CashRegister register = new CashRegister(1, // レジスターNo
                new Shop(1, "店舗１", "愛媛県松山市３番町", "089-111-2222"), // 店舗情報
                employees, // 従業員情報
                items // 商品情報
        );

        // ログイン処理
        Employee emp = register.login();
        emp.dispGyomu();



        /*
         * // テスト 管理者 業務メニュー表示テスト register.getEmployee().get(0).dispGyomu(); System.out.println();
         * // テスト パート 業務メニュー表示テスト register.getEmployee().get(1).dispGyomu();
         */
    }
}
