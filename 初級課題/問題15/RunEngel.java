class Engel{
	double food;
	double consumption;
	String name;
	Engel(String tmpName){
		name = tmpName;
	}
	Engel(){}
	void setFood(double tmpFood){
		food = tmpFood;
	}
	void setConsumption(double tmpConsumption){
		consumption = tmpConsumption;
	}
	double calculation(){
		return ((food / consumption) * 100);
	}
	void show(){
		System.out.println(name + "����̃G���Q���W����" + calculation() + "%�ł�");
	}
	void explain(){
		System.out.println("�������F�H����");
		System.out.println("�������F����x�o");
		System.out.println("��O�����F����");
	}
}

class RunEngel{
	public static void main(String[] args){
		if(args.length == 3){
			Engel eng1 = new Engel(args[2]);
			eng1.setFood(Double.parseDouble(args[0]));
			eng1.setConsumption(Double.parseDouble(args[1]));
			eng1.show();
		}else{
			Engel eng2 = new Engel();
			eng2.explain();
		}
	}
}