package bookshelf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BookshelfRun {

	public void run() {
		while( true ) {
			MessageData.menu();
			System.out.println( MessageData.INQUIRY_MSG_001);
			Scanner sc = new Scanner(System.in);
			String str = (String)sc.next();

			if( ! (str .equals("1") || str.equals("2") || str.equals("3") ) ) {
				System.out.println( MessageData.MSG_003);
				break;
			}

			try {
				BookshelfFileOperate bfo = new BookshelfFileOperate( MessageData.fileName );

				if( str.equals("1") ) {
					System.out.println( MessageData.ATTENTION_MSG_001 );
					System.out.println( MessageData.ATTENTION_MSG_002 );
					String[] strArray = new String[MessageData.fileRegistItemCount];

					for( int i =0; i < strArray.length; i++ ) {
						System.out.println( MessageData.INQUIRY_MSG_011[ i ] );
						if( i == 0 ) {
							while( true ) {
								strArray[i] = (String)sc.next();
								if( (inputDataCheck(i, strArray[i] ) ) == false ) {
									System.out.println( MessageData.ERROR_MSG_004 );
									for( String s : MessageData.INQUIRY_MSG_011 ) {
										System.out.println( s );
									}
								}else {
									break;
								}
							}
						}else if( i == 3 ) {
							while( true ) {
								strArray[i] = (String)sc.next();
								if( inputDataCheck(i, strArray[i] ) == false ) {
									System.out.println( MessageData.ERROR_MSG_005 );
									for( String s : MessageData.INQUIRY_MSG_011 ) {
										System.out.println( s );
									}
								}else {
									break;
								}
							}
						}else {
							strArray[i] = (String)sc.next();

						}
					}
					//ここ注意（上のブロックの外側で実行）
					if( bfo.booksheelfFileWrite( strArray ) == true ) {
						System.out.println( MessageData.MSG_001);
					}else {
						System.out.println( MessageData.ERROR_MSG_001);
					}
				}else if( str.equals("2") ) {
					if( bfo.fileCheck(MessageData.fileName) == false ) {
						System.out.println( MessageData.ERROR_MSG_007);
					}else {
						System.out.println( MessageData.INQUIRY_MSG_002 );
						//TODO 削除すると次のレコードが前のレコードの後ろにくるので改行を保つように修正する
						if( bfo.bookshelfFileRemove( (String)sc.next() ) == true ) {
							System.out.println( MessageData.MSG_002 );
						}else {
							System.out.println( MessageData.ERROR_MSG_002 );
						}
					}
				}else if( str.equals("3") ) {
					if( bfo.fileCheck(MessageData.fileName) == false ) {
						System.out.println( MessageData.ERROR_MSG_007 );
					}else {
						bfo.bookshelfDisp();
					}
				}

			}catch( Exception e ) {
				System.out.println( MessageData.ERROR_MSG_003 );
				break;
			}
		}
	}

	private boolean inputDataCheck( int i, String s ) {
		if( i == 0 ) {
			if( s.length() != 5 ) {
				return false;
			}
		}
		if( i == 3 ) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				sdf.parse( s );

			}catch( ParseException e ) {
				return false;
			}
		}
		return true;
	}
}
