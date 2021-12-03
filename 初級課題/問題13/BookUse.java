class Book{
	String bookTitle;
	String bookAuthor;
	int stockCount;
	void setBook(String tmpBookTitle){
		bookTitle = tmpBookTitle;
		bookAuthor = "不明";
		stockCount = 0;
	}
	void setBook(String tmpBookTitle, String tmpBookAuthor){
		bookTitle = tmpBookTitle;
		bookAuthor = tmpBookAuthor;
		stockCount = 0;
	}
	void setBook(String tmpBookTitle, String tmpBookAuthor, int tmpStockCount){
		bookTitle = tmpBookTitle;
		bookAuthor = tmpBookAuthor;
		stockCount = tmpStockCount;
	}
	void disp(){
		System.out.println("タイトル："+bookTitle);
		System.out.println("作　　者："+bookAuthor);
		System.out.println("在庫数量："+stockCount);
		System.out.println();
	}
}
class BookUse{
	public static void main(String[] args){
		Book book = new Book();
		book.setBook("サクリファイス");
		book.disp();
		book.setBook("マボロシの鳥", "太田光");
		book.disp();
		book.setBook("KAGEROU","齋藤智裕",1000);
		book.disp();
	}
}