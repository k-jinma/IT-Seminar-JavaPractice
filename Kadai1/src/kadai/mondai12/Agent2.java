package kadai.mondai12;

public class Agent2 {
    public static void main(String[] args) {
        Customer2 customer2 = new Customer2(200, "KEN");
        int custNo = customer2.getCustNo();
        String custName = customer2.getCustName();

        System.out.println("Customer No.  : " + custNo);
        System.out.println("Customer Name : " + custName);
    }
}
