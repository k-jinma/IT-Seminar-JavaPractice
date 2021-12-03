class Customer2{
	int custNo;
	String custName;
	Customer2(int tmpCustNo, String tmpCustName){
		custNo = tmpCustNo;
		custName = tmpCustName;
	}
	int getCustNo(){
		return custNo;
	}
	String getCustName(){
		return custName;
	}
}