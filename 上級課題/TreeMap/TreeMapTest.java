package toi10;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		/*
		 * TreeMapはデータが自動的にソートされて格納されるクラス
		 * データを登録するとき「キー（名前）」と「値（データ）」を組で登録する
		 */

		//宣言
		TreeMap<String, String> treeMap = new TreeMap<>();

		//データ追加
		treeMap.put("B", "Brazil");
		treeMap.put("E", "England");
		treeMap.put("A", "America");
		treeMap.put("C", "Chaina");

		//出力
		for( String key : treeMap.keySet() ) {
			System.out.println( treeMap.get(key) );
		}


	}

}
