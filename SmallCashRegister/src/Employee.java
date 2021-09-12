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
			System.out.println("----------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("２：精算");
			System.out.println("４：ログアウト");
			System.out.println("----------------------------------");

		} else if (this.empRank == 2 || this.empRank == 3) {
			// パート・アルバイトメニューを表示する
			System.out.println("----------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("４：ログアウト");
			System.out.println("----------------------------------");
		}
	}

	public void execute(int inputNo, Shop shop, ArrayList<Item> items, ArrayList<Sales> sales) {

		Scanner sc = new Scanner(System.in);

		switch (inputNo) {
			case 1:
				// 会計処理
				System.out.println("=============会計処理=============");
				int goukei = 0;
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

					// 合計金額を累積
					goukei += (item.getPrice() * itemCnt);

					// 売上明細に記録する
					Map<Item, Integer> pair = new HashMap<>();
					pair.put(item, itemCnt);
					sales.add(new Sales(LocalDateTime.now(), this.empNo, pair));


					System.out.print("次の商品？(Yes:1, No:2)");
					inputNo = sc.nextInt();

				} while (inputNo != 2);

				// TODO: 合計計算、釣銭入力
				int ukeKin = 0;
				System.out.println("----------------------------------");
				System.out.println("小計：" + goukei + " 円");
				int tax = (int) (goukei * 0.1);
				System.out.println("消費税：" + tax + " 円");
				System.out.println("合計：" + (goukei + tax) + " 円");
				System.out.print("受取代金：");
				ukeKin = sc.nextInt();
				System.out.println("お釣り：" + ((goukei + tax) - ukeKin) + " 円");
				System.out.println("----------------------------------");

				// 売上合計記録する
				shop.addShopSales(goukei);
				shop.addSalesTax(tax);

				// レシートNo加算
				Sales.addSalesNo();

				// TODO: レシートフッター
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("レシートNo" + " " + sales.get(sales.size() - 1).getSalesNo());
				System.out.println("担当No" + " " + this.getEmpNo());
				System.out.println(shop.getShopName() + " " + shop.getShopAddress());
				System.out.println("TEL" + " " + shop.getShopTel());
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

				break;
			case 2:
				// 精算処理
				if (this.empRank == 1) {
					System.out.println("精算処理をします");

					for (Sales s : sales) {
						for (Item i : items) {
							if (s.getSalesDetails().get(i) != null) {
								System.out.println(s.getSalesDateTime() + " " + i.getItemName()
										+ " × " + s.getSalesDetails().get(i) + " = "
										+ i.getPrice() * s.getSalesDetails().get(i) + "円");

							}
						}
					}
					System.out.print("売上額：" + shop.getShopSales() + " 円");
					System.out.println("  ");
					System.out.println("消費税：" + shop.getShopSalesTax() + " 円");
					System.out.println(
							"総売上額：" + (shop.getShopSales() + shop.getShopSalesTax()) + " 円");
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
