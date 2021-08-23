public class Item {
    public int no;      //商品コード
    public String name; //商品名
    public int price;   //価格
    
    public Item(int no, String mame, int price) {
        this.no = no;
        this.name = mame;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getMame() {
        return name;
    }

    public void setMame(String mame) {
        this.name = mame;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
