package practice1;

public class Sales extends Employee {

	private String erea;	//担当地域名

	public Sales(int id, String name, String erea) {
		super(id, name);
		this.erea = erea;
	}

	public String getErea() {
		return this.erea;

	}

	public void display() {
		System.out.print("従業員番号：" + getId() + " " );
		System.out.print("従業員名：" + getName() + " ");
		System.out.println("担当地域名：" + this.erea + " ");
	}

}
