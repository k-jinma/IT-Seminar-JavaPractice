class CreateEmployee{
	public static void main(String[] args){
		if(args.length == 2){
			Employee emp = new Employee(Integer.parseInt(args[0]), args[1]);
			System.out.println("EmpNo   :"  + emp.getEmpNo());
			System.out.println("EmpName :"  + emp.getEmpName());
		}else{
			System.out.println("Please input again.");
		}
	}
}