class Train{
	String name;
	int speed;
	int free;
	
	Train(String tmpName, int tmpSpeed, int tmpFree){
		name = tmpName;
		speed = tmpSpeed;
		free = tmpFree;
	}
	
	void show(){
		System.out.println("TrainName :" + name);
		System.out.println("MaxSpeed  :" + speed);
		System.out.println("FreeSeat  :" + free);
	}
}