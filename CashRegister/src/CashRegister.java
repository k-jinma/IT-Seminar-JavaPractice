import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int item1Price;
		int item1Count;
		int item2Price;
		int item2Count;
		int item3Price;
		int item3Count;

		System.out.print("商品１の金額を入力してください：\\");
		item1Price = sc.nextInt();

		System.out.print("商品１の数量を入力してください：");
		item1Count = sc.nextInt();

		System.out.print("商品２の金額を入力してください：\\");
		item2Price = sc.nextInt();

		System.out.print("商品２の数量を入力してください：");
		item2Count = sc.nextInt();

		System.out.print("商品３の金額を入力してください：\\");
		item3Price = sc.nextInt();

		System.out.print("商品３の数量を入力してください：");
		item3Count = sc.nextInt();

		int syokei = item1Price * item1Count + item2Price * item2Count + item3Price * item3Count;

		System.out.println("小計：\\" + syokei );

		double tax = syokei * 0.1;

		System.out.println("消費税：\\" + tax);

		System.out.println("合計：\\" + (syokei + tax) );

		System.out.print("お預かり：");
		int azukari = sc.nextInt();

		System.out.println("お釣り：\\" + (azukari - syokei - tax) );

	}

}