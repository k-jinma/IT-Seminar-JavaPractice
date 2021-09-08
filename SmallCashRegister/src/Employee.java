package src;

import java.util.ArrayList;
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

	public void execute(int inputNo, ArrayList<Item> items) {

		Scanner sc = new Scanner(System.in);

		switch (inputNo) {
			case 1:
				// 会計処理
				System.out.println("会計処理をします");
				System.out.print("商品番号を入力してください：");
				// 商品検索処理

				System.out.print("数量を入力してください：");

				System.out.print("小計>");

				break;
			case 2:
				// 精算処理
				if (this.empRank == 1) {
					System.out.println("精算処理をします");
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

	// System.out.print("商品番号を入力してください:");
	// inputNo = sc.nextInt();

	// // 商品番号を調べる
	// for (Item i : items) {
	// if (i.getItemNo() == inputNo) {
	// System.out.println(i.getItemName());
	// System.out.println(i.getPrice());
	// }
	// }


	// 精算処理



	// ログアウト

}
