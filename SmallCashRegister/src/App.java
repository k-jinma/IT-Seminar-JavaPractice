package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// データ準備
		// ・店舗情報
		Shop shop = new Shop(1, "コンビニ松山１号店", "愛媛県松山市１番町", "089-111-2222");

		// ・商品情報
		Item item1 = new Item(1, "手巻きおにぎり　焼き鮭ほぐし", 1, 150);
		Item item2 = new Item(2, "手巻きおにぎり　おかか", 1, 110);
		Item item3 = new Item(3, "手巻きおにぎり　日高昆布", 1, 120);
		Item item4 = new Item(4, "サントリー　プレミアムボス　ブラック　390g", 1, 150);
		Item item5 = new Item(5, "アサヒ　ワンダ　モーニングショット　185g", 1, 120);
		Item item6 = new Item(6, "アサヒ　十六茶　660ml", 1, 150);
		Item item7 = new Item(7, "オリジナル　マスク　7枚", 2, 270);
		Item item8 = new Item(8, "トイレットティシューコンパクト 8ロール シングル ", 2, 430);
		Item item9 = new Item(9, "レジ袋", 3, 3);

		ArrayList<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		items.add(item8);
		items.add(item9);

		// ・従業員情報
		Employee emp1 = new Employee(1, "管理者", 1);
		Employee emp2 = new Employee(2, "パート", 2);
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);

		// ・売上記録
		ArrayList<Sales> sales = new ArrayList<Sales>();

		do {
			// ログイン処理
			int inputNo = 0;
			Employee emp = null;
			boolean logined = false;
			do {
				try {
					System.out.println("-----------ログイン画面-----------");
					System.out.print("従業員番号を入力してください:");
					inputNo = sc.nextInt();

					for (Employee e : emps) {
						if (e.getEmpNo() == inputNo) {
							logined = true;
							emp = e;
							break;
						}
					}
				} catch (InputMismatchException e) {
					System.err.println("従業員番号は整数で入力してください");

					// 改行が読み捨てられるためダミー行を追加
					System.out.println();
					// Scannerのバッファを読み捨てる処理
					sc.next();
				}
			} while (logined == false);

			// キャッシュレジスターシステム
			do {
				// メニュー表示
				emp.dispMenu();
				// メニュー番号入力
				System.out.print("番号を入力してください：");
				inputNo = sc.nextInt();
				// メニュー実行
				// TODO: salesは精算処理で使用することを検討中ですので今は無視してください
				emp.execute(inputNo, shop, items, sales);

			} while (inputNo != 4);


			System.out.print("レジを終了?(Yes:999):");
		} while (sc.nextInt() != 999);

		sc.close();

	}
}
