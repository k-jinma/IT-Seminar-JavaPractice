package bookshelf;

public class MessageData {

	public static final String fileName = "C:\\bookshelfdata\\Bookshelf.txt";
	public static final String MSG_001  = "1件登録されました。\n";
	public static final String MSG_002 = "削除されました。\n";
	public static final String MSG_003 = "システムを終了しました。\n";
	public static final String MSG_004 = "<<<<<【MyBook List】>>>>>\n";
	public static final String MSG_005 = "--------------------------------------------------\n";
	public static final String ERROR_MSG_001 = "管理番号が重複しているため登録できません。\n";
	public static final String ERROR_MSG_002 = "該当の管理番号がないか、エラーのため削除できません。\n";
	public static final String ERROR_MSG_003 = "システムエラーが発生しました。管理者に問い合わせてください。\n";
	public static final String ERROR_MSG_004 = "管理番号は5桁で入力してください。\n";
	public static final String ERROR_MSG_005 = "日付は YYYY/MM/DDのフォーマットで入力してください。\n";
	public static final String ERROR_MSG_006 = "ファイルが正しくありません。\n";
	public static final String ERROR_MSG_007 = "データを保存しているファイルが存在しません。登録から行ってください。\n";
	public static final String ATTENTION_MSG_001 = "【注意！】スペースは使用しないでください。\n";
	public static final String ATTENTION_MSG_002 = "【注意！】日付は YYYY/MM/DD のフォーマットで入力してください。\n";
	public static final String INQUIRY_MSG_001 = "Select Number =>";
	public static final String INQUIRY_MSG_002 = "削除したい管理番号 =>";
	public static final String[] INQUIRY_MSG_011 = {"【管理番号】","【書 籍 名】","【著 者 名】","【発 売 日】","【出 版 社】"};
	public static final int fileRegistItemCount = 5;

	public static final void menu() {
		System.out.println("---【MENU】---");
		System.out.println("登　録 ==> 1");
		System.out.println("削　除 ==> 2");
		System.out.println("一　覧 ==> 3");
		System.out.println("上記以外:終了");
		System.out.println("---------------");

	}

}
