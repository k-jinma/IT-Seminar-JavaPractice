package kadai.mondai13;

public class Book {
    String bookTitle;   // タイトル
    String bookAuthor;  // 作者名
    int stockCount;     // 在庫数

    public void setBook(String bookTitle) {
        this.bookTitle = bookTitle;
        this.bookAuthor = "不明";
        this.stockCount = 0;
    }

    public void setBook(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.stockCount = 0;
    }

    public void setBook(String bookTitle, String bookAuthor, int stockCount) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.stockCount = stockCount;
    }

    public void disp(){
        System.out.println("タイトル：" + this.bookTitle);
        System.out.println("作　　者：" + this.bookAuthor);
        System.out.println("在庫数量：" + this.stockCount);
    }
    
}
