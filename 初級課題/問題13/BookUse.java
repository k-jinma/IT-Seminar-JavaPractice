class Book{
	String bookTitle;
	String bookAuthor;
	int stockCount;
	void setBook(String tmpBookTitle){
		bookTitle = tmpBookTitle;
		bookAuthor = "�s��";
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
		System.out.println("�^�C�g���F"+bookTitle);
		System.out.println("��@�@�ҁF"+bookAuthor);
		System.out.println("�݌ɐ��ʁF"+stockCount);
		System.out.println();
	}
}
class BookUse{
	public static void main(String[] args){
		Book book = new Book();
		book.setBook("�T�N���t�@�C�X");
		book.disp();
		book.setBook("�}�{���V�̒�", "���c��");
		book.disp();
		book.setBook("KAGEROU","�V���q�T",1000);
		book.disp();
	}
}