class Employee{
	int id;
	String name;
	String dept;
	String tel;
	Employee(int tmpId, String tmpName, String tmpDept, String tmpTel){
		id = tmpId;
		name = tmpName;
		dept = tmpDept;
		tel = tmpTel;
	}
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	String getDept(){
		return dept;
	}
	String getTel(){
		return tel;
	}
}