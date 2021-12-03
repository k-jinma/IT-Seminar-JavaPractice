class Vending{
	String goodsName;
	int goodsPrice;
	int payment;
	
	void setGoodsName(String name){
		goodsName = name;
	}
	void setGoodsPrice(int price){
		goodsPrice = price;
	}
	void setPayment(int money){
		payment = money;
	}
	void disp(){
		System.out.println("GoodsName : " + goodsName);
		System.out.println("GoodsPrice : " + goodsPrice);
		System.out.println("Payment : " + payment);
	}
}

class VendUser{
	public static void main(String[] args){
		Vending v = new Vending();
		v.setGoodsName("Coffee");
		v.setGoodsPrice(130);
		v.setPayment(200);
		v.disp();
	}
}