class TestEmployee{
	public static void main(String[ ] args){
		Employee emp = new Employee(1001, "山田 太郎", "開発部", "3101");
		int id = emp.getId( );
		String name = emp.getName( );
		String dept = emp.getDept( );
		String tel = emp.getTel( );
		System.out.println("ID : " + id);
		System.out.println("名前 : " + name);
		System.out.println("所属 : " + dept);
		System.out.println("内線 : " + tel);
	}
}