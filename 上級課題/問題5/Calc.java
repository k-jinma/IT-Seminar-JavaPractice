package toi5;

public class Calc {
	private int num1;
	private int num2;

	public Calc( int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int devide() {
		return num1 /num2;
	}

	public void display() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
