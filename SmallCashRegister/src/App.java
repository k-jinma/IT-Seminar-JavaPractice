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
		Item item1 = new Item(1, "ぽてち", 1, 100);
		Item item2 = new Item(2, "チョコレート", 1, 250);

		ArrayList<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);

		// ・従業員情報
		Employee emp1 = new Employee(1, "管理者", 1);
		Employee emp2 = new Employee(2, "パート", 2);
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);

		// ログイン処理
		int inputNo = 0;
		boolean logined = false;
		do {
			try {
				System.out.println("-----------ログイン画面-----------");
				System.out.print("従業員番号を入力してください:");
				inputNo = sc.nextInt();

				for (Employee e : emps) {
					if (e.getEmpNo() == inputNo) {
						logined = true;
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
		// メニュー表示
		System.out.println("------------------------------");
		System.out.println("キャッシュ・レジスター　メニュー");
		System.out.println("１：お会計");
		System.out.println("２：？？？？"); //未実装
		System.out.println("３：？？？？"); //未実装
		System.out.println("４：ログアウト");
		System.out.println("------------------------------");

		// メニュー番号入力
		inputNo = sc.nextInt();

		// お会計処理
		System.out.print("商品番号を入力してください:");
		inputNo = sc.nextInt();

		// 商品番号を調べる
		for (Item i : items) {
			if (i.getItemNo() == inputNo) {
				System.out.println(i.getItemName());
				System.out.println(i.getPrice());
			}
		}

	}
}
