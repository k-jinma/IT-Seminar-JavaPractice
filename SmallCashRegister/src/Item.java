package src;

public class Item {
	private int itemNo;			// 商品No
	private String itemName;	// 商品名
	private int kubun;			// 商品区分（1:食品,2:日用品,3:その他）
	private int price;			// 商品単価

	public Item(int itemNo, String itemName, int kubun, int price) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.kubun = kubun;
		this.price = price;
	}

	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getKubun() {
		return kubun;
	}
	public void setKubun(int kubun) {
		this.kubun = kubun;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



}
