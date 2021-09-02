package kadai.mondai11;

public class Agent {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustNo(100);
        customer.setCustName("Michael");
        int custNo = customer.getCustNo();
        String custName = customer.getCustName();

        System.out.println("Customer No.  : " + custNo);
        System.out.println("Customer Name : " + custName);

    }
}
