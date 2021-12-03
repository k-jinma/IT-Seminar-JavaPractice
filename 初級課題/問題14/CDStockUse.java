class CDStock{
	String[] artists = {"��", "EXILE", "AKB48", "��������N���[�o�[�y", "BON JOVI", "2PM"};
	String[] titles = {"Popcorn", "�肢�̓�", "1830m", "5TH DIMENSION", "What About Now", "LEGEND OF 2PM"};
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
		System.out.println("�A�[�e�B�X�g���F" + artist);
		System.out.println("�A���o�����@�@�F" + title);
		System.out.println("�݌ɐ��@�@�@�@�F" + stock + "��");
	}
}

class CDStockUse{
	public static void main(String[] args){
		if(args.length != 0){
			CDStock cd = new CDStock();
			System.out.println("�����L�[���[�h��" + args[0] + "�ł��B");
			System.out.println();
			if(cd.searchCD(args[0])){
				cd.disp();
			}else{
				System.out.println("�Y�����i�͂���܂���B");
			}
		}else{
			System.out.println("Please input one Keyword.");
		}
	}
}