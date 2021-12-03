class CDStock{
	String[] artists = {"嵐", "EXILE", "AKB48", "ももいろクローバーＺ", "BON JOVI", "2PM"};
	String[] titles = {"Popcorn", "願いの塔", "1830m", "5TH DIMENSION", "What About Now", "LEGEND OF 2PM"};
	long[] stocks = {100,150,50,200,75,30};
	String artist;
	String title;
	long stock;
	boolean searchCD(String keyword){
		for(int i=0; i<artists.length; i++){
			if(keyword.equals(artists[i])){
				setCD(i);
				return true;
			}
		}
		for(int i=0; i<titles.length; i++){
			if(keyword.equals(titles[i])){
				setCD(i);
				return true;
			}
		}
		return false;
	}
	void setCD(int num){
		artist = artists[num];
		title = titles[num];
		stock = stocks[num];
	}
	void disp(){
		System.out.println("アーティスト名：" + artist);
		System.out.println("アルバム名　　：" + title);
		System.out.println("在庫数　　　　：" + stock + "枚");
	}
}

class CDStockUse{
	public static void main(String[] args){
		if(args.length != 0){
			CDStock cd = new CDStock();
			System.out.println("検索キーワードは" + args[0] + "です。");
			System.out.println();
			if(cd.searchCD(args[0])){
				cd.disp();
			}else{
				System.out.println("該当商品はありません。");
			}
		}else{
			System.out.println("Please input one Keyword.");
		}
	}
}