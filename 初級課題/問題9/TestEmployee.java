class TestEmployee{
	public static void main(String[ ] args){
		Employee emp = new Employee(1001, "�R�c ���Y", "�J����", "3101");
		int id = emp.getId( );
		String name = emp.getName( );
		String dept = emp.getDept( );
		String tel = emp.getTel( );
		System.out.println("ID : " + id);
		System.out.println("���O : " + name);
		System.out.println("���� : " + dept);
		System.out.println("���� : " + tel);
	}
}