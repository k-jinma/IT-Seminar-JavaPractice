public class Shop {
    private int shopNo; // 店舗No
    private String shopName;    // 店舗名
    private String shopAddress;
    private String shopTel;
    
    public Shop(int shopNo, String shopName, String shopAddress, String shopTel) {
        this.shopNo = shopNo;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopTel = shopTel;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel;
    }

    
}
