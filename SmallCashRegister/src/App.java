package src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    	Item item1 = new Item(1, "ぽてち", 1 , 100);
    	Item item2 = new Item(2, "チョコレート", 1, 250);

    	ArrayList<Item> items = new ArrayList<Item>();
    	items.add(item1);
    	items.add(item2);

    	Employee emp1 = new Employee(1, "管理者", 1);
    	Employee emp2 = new Employee(2, "パート", 2);
    	ArrayList<Employee> emps = new ArrayList<Employee>();
    	emps.add(emp1);
    	emps.add(emp2);

    	// ログイン
		// 従業員番号入力
    	int flg = 0;
    	System.out.print("従業員番号を入力してください:");
		int inputNo = sc.nextInt();
    	for( Employee e : emps ) {
    		if( e.getEmpNo() == inputNo ) {
    			flg = 1;
    			break;
  
    		}

    	}
    	if( flg == 0 ) {
    		System.out.println("ログインできません");
    	}
    	
    	if( flg == 1 ) {
        	// キャッシュレジスターシステム
        	// メニュー表示
    		System.out.println("------------------------------");
    		System.out.println("キャッシュ・レジスター　メニュー");
    		System.out.println("１：お会計");
    		System.out.println("２：売上管理");	//未実装
    		System.out.println("３：在庫管理");	//未実装
    		System.out.println("４：ログアウト");
    		System.out.println("------------------------------");

    		// メニュー番号入力
    		inputNo = sc.nextInt();

    		// お会計処理
    		System.out.print("商品番号を入力してください:");
    		inputNo = sc.nextInt();

    		// 商品番号を調べる
    		for( Item i : items ) {
    			if( i.getItemNo() == inputNo ) {
    				System.out.println( i.getItemName() );
    				System.out.println( i.getPrice());
    			}
    		}

    	}

    }
}
