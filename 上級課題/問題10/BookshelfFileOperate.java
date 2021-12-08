package bookshelf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BookshelfFileOperate {
	private File file = null;
	private FileWriter fw = null;
	private FileReader fr = null;
	private BufferedWriter bw = null;
	private BufferedReader br = null;
	private TreeMap<String, String[]> ts = null;

	public BookshelfFileOperate( String str ) throws Exception{
		if( str != null && str != "" ) {
			if( fileCheck( str ) == false ) {
				file.createNewFile();
			}
		}else {
			Exception ex = new Exception( MessageData.ERROR_MSG_006 );
			throw ex;
		}
	}

	private boolean bookshelfCheck( String str ) throws IOException {
		ts = bookshelfFileRead();
		return ts.containsKey( str );

	}

	public boolean fileCheck( String str ) throws IOException {
		file = new File( str );
		return file.exists();
	}

	public TreeMap<String, String[]> bookshelfFileRead() throws IOException {
		fr = new FileReader( file );
		br = new BufferedReader( fr );
		ts = new TreeMap<String, String[]>();

		String str = "";
		while( ( str = br.readLine() ) != null ) {
			StringTokenizer st = new StringTokenizer( str, ",");
			String[] strArray = new String[ MessageData.fileRegistItemCount ];
			int i = 0;
			while( st.hasMoreTokens() ) {
				strArray[ i ] = st.nextToken();
				i++;
			}
			ts.put(strArray[0], strArray);
		}
		return ts;
	}

	public boolean booksheelfFileWrite( String[] strArray ) throws IOException {

		if( bookshelfCheck( strArray[0] ) == false ) {
			fw = new FileWriter( file, true );
			bw = new BufferedWriter( fw );

			fileWrite(strArray);
			bw.newLine();
			bw.close();
			return true;
		}else {
			return false;
		}
	}

	public boolean bookshelfFileRemove( String str ) throws IOException {
		ts = bookshelfFileRead();
		if( ts.remove( str ) == null ) {
			return false;
		}
		fw = new FileWriter( file, false );
		bw = new BufferedWriter( fw );

		String[] strArray;
		for( String s : ts.keySet() ) {
			strArray = ts.get( s );
			fileWrite( strArray );
			bw.newLine();	//改行を追加
		}
		bw.close();
		return true;
	}

	private void fileWrite( String[] strArray ) throws IOException {
		for(  int i = 0; i < strArray.length; i++ ) {
			bw.write( strArray[i] );
			if( i != (strArray.length - 1) ) {
				bw.write(",");
			}
		}

	}

	public void bookshelfDisp() throws IOException{
		ts = bookshelfFileRead();
		System.out.println( MessageData.MSG_004 );
		System.out.println( MessageData.MSG_005 );

		/*
		 * 4.	拡張forループを使用し、フィールド変数 ts の keySet() メソッドから文字列データを取得する。そのデータがなくなるまで処理を繰り返す
		 */
		ArrayList<String[]> strArray = new ArrayList<String[]>();
		for( String s : ts.keySet() ) {
			strArray.add( ts.get( s ) );
		}
		for( int i = 0; i < strArray.size(); i++ ) {

			for( int j = 0; j < strArray.get(i).length; j++ ) {
				System.out.println( MessageData.INQUIRY_MSG_011[ j ]);
				System.out.println( strArray.get( i )[j] );
			}
			System.out.println(MessageData.MSG_005);
		}


	}

}
