package kadai.mondai6;

public class Vending {
    String goodsName;
    int goodsPrice;
    int payment;

    void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    void setPayment(int payment) {
        this.payment = payment;
    }
    void disp(){
        System.out.println("GoodsName  :" + goodsName);
        System.out.println("GoodsPrice :" + goodsPrice);
        System.out.println("Payment    :" + payment);
    }    
}

class VendUser{
    public static void main(String[] args) {
        Vending vending = new Vending();
        vending.goodsName = "Coffee";
        vending.goodsPrice = 130;
        vending.payment = 200;
        
        vending.disp();
    }
}
