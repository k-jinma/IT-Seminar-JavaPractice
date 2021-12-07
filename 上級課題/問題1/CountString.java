package toi1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountString {

	public static void main(String[] args) {

		// 1.操作するファイルを指定する
		File file =
			new File("C:\\Users\\user\\Documents\\JavaBasic\\java_basic\\ensyu3\\toi1\\iroha.txt");

		// 2.読み込みクラス（FileReader）を準備し、1のファイル情報を渡す
		try {
			FileReader fr = new FileReader( file );

			// 3.さらに便利な読み込みクラス(BufferedReader)を準備し、2のファイル情報を渡す
			BufferedReader br = new BufferedReader( fr );

			// [A] P317 ファイルの内容を画面に出力する（読み込む行がなくなるまで、１行ずつ読み込んで表示する）
			String str;
			int mojiCnt = 0;
			int lineCnt = 0;
			while( ( str = br.readLine() ) != null ){
				System.out.println( str );
				//文字数を加算する
				mojiCnt = mojiCnt + str.length();
				//行数を加算する
				lineCnt++;
			}
			System.out.println( mojiCnt + " 文字です。");
			System.out.println( lineCnt + " 行です。");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}




	}
}