import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int item1Price, item2Price, item3Price; // 商品金額１～３
		int item1Count, item2Count, item3Count; // 商品数量１～３
		int syokei; // 小計
		int tax; // 消費税
		int azukari; // 預かり金額

		// メニュー画面表示
		System.out.println("キャッシュ・レジスター　メニュー");
		System.out.println("１：お会計");
		System.out.println("２：終了");

		// メニュー番号入力
		int inputNo = sc.nextInt();
		switch (inputNo) {

		// お会計処理
		case 1:

			System.out.print("商品１の金額を入力してください：\\");
			item1Price = sc.nextInt();
			if (item1Price < 0) {
				System.err.println("入力金額が不正です。システムを終了します。");
				System.exit(-1);
			}

			System.out.print("商品１の数量を入力してください：");
			item1Count = sc.nextInt();
			if (item1Count < 0) {
				System.err.println("入力数量が不正です。システムを終了します。");
				System.exit(-2);
			}

			System.out.print("商品２の金額を入力してください：\\");
			item2Price = sc.nextInt();
			if (item2Price < 0) {
				System.err.println("入力金額が不正です。システムを終了します。");
				System.exit(-1);
			}

			System.out.print("商品２の数量を入力してください：");
			item2Count = sc.nextInt();
			if (item2Count < 0) {
				System.err.println("入力数量が不正です。システムを終了します。");
				System.exit(-2);
			}

			System.out.print("商品３の金額を入力してください：\\");
			item3Price = sc.nextInt();
			if (item3Price < 0) {
				System.err.println("入力金額が不正です。システムを終了します。");
				System.exit(-1);
			}

			System.out.print("商品３の数量を入力してください：");
			item3Count = sc.nextInt();
			if (item3Count < 0) {
				System.err.println("入力数量が不正です。システムを終了します。");
				System.exit(-2);
			}

			// 小計の計算と表示
			syokei = item1Price * item1Count + item2Price * item2Count + item3Price * item3Count;
			System.out.println("小計：\\" + syokei);

			// 消費税の計算と表示
			tax = (int) (syokei * 0.1);
			System.out.println("消費税：\\" + tax);

			// 合計額の表示
			System.out.println("合計：\\" + (syokei + tax));

			// お預かり金額の入力
			System.out.print("お預かり：");
			azukari = sc.nextInt();
			if (azukari < 0) {
				System.err.println("入力金額が不正です。システムを終了します。");
				System.exit(-1);

			} else if (azukari < (syokei + tax)) {
				System.err.println("お預かり金額が合計額より少ないです。システムを終了します");
				System.exit(-3);
			}

			System.out.println("お釣り：\\" + (azukari - syokei - tax));

			break;

			
		// システム終了
		case 2:
			
			System.out.println("システムを終了します。");
			break;

		//システム終了
		default:
			System.out.println("1または2以外の番号が入力されました。システムを終了します。");
			break;

		}
		
		
		sc.close();

	}

}
