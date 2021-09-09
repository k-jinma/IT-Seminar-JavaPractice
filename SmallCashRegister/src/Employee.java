package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {

	private int empNo; // 従業員No
	private String empName; // 従業員名
	private int empRank; // 従業員区分(1:管理者,2:パート,3:アルバイト)

	public Employee(int empNo, String empName, int empRank) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empRank = empRank;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpRank() {
		return empRank;
	}

	public void setEmpRank(int empRank) {
		this.empRank = empRank;
	}

	public void dispMenu() {

		if (this.empRank == 1) {
			// 管理者メニューを表示する
			System.out.println("------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("２：精算");
			System.out.println("４：ログアウト");
			System.out.println("------------------------------");

		} else if (this.empRank == 2 || this.empRank == 3) {
			// パート・アルバイトメニューを表示する
			System.out.println("------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("４：ログアウト");
			System.out.println("------------------------------");
		}
	}

	public void execute(int inputNo, ArrayList<Item> items, ArrayList<Sales> sales) {

		Scanner sc = new Scanner(System.in);

		switch (inputNo) {
			case 1:
				// 会計処理
				System.out.println("会計処理をします");

				// 商品入力
				do {
					System.out.print("商品番号を入力してください：");
					int itemNo = sc.nextInt();

					System.out.print("数量を入力してください：");
					int itemCnt = sc.nextInt();
					Item item = null;
					// 商品検索処理
					for (Item i : items) {
						if (itemNo == i.getItemNo()) {
							item = i;
							break;
						}
					}
					System.out.println(item.getItemName() + " " + item.getPrice() + "円" + " " + "×"
							+ " " + itemCnt + "個" + " " + "=" + " " + item.getPrice() * itemCnt
							+ "円");

					Map<Item, Integer> pair = new HashMap<>();
					pair.put(item, itemCnt);
					sales.add(new Sales(LocalDateTime.now(), this.empNo, pair));

					System.out.println("次の商品？(Yes:1, No:2)");
					inputNo = sc.nextInt();

				} while (inputNo != 2);

				// 合計計算、釣銭入力


				break;
			case 2:
				// 精算処理
				if (this.empRank == 1) {
					System.out.println("精算処理をします");
					// TODO: レジ起動から現在までの売上を表示する
					for (Sales s : sales) {
						for (Item i : items) {
							if (s.getSalesDetails().get(i) != null) {
								System.out.println(i.getItemName() + " " + s.getSalesDateTime()
										+ " " + s.getSalesDetails().get(i));

							}
						}
					}

				}
				break;
			case 3:
				break;
			case 4:
				// ログアウト
				System.out.println("ログアウト処理をします");
				break;
			default:
				break;
		}

	}

	// 会計処理


	// 精算処理



	// ログアウト

}
