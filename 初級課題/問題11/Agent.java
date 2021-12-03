class Agent{
	public static void main(String[] args){
		Customer cust = new Customer();
		cust.setCustNo(100);
		cust.setCustName("Michael");
		System.out.println("Customer No. :"+cust.getCustNo());
		System.out.println("Customer Name:"+cust.getCustName());
	}
}