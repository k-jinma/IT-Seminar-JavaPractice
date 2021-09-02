package kadai.mondai13;

public class BookUse {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("３月のライオン");
        book1.disp();

        System.out.println();

        Book book2 = new Book();
        book2.setBook("銀の匙", "荒川弘");
        book2.disp();

        System.out.println();

        Book book3 = new Book();
        book3.setBook("海街diary", "吉田秋生", 1000);
        book3.disp();
    }
}