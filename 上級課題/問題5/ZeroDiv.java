package toi5;

public class ZeroDiv {

	public static void main(String[] args) {
		Calc calc1 = new Calc(10, 5);
		Calc calc2 = new Calc(20, 0);

		try {
			calc1.display();
			System.out.println("num1 / num2 = " + calc1.devide() );
			calc2.display();
			System.out.println("num1 / num2 = " + calc2.devide() );

		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("ArithmethicException : " + e.getMessage());
		}

	}

}
