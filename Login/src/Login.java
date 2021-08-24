import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // ユーザー作成
        User user1 = new User();
        user1.userId = "user1";
        user1.password = "abcd";
        user1.missCnt = 0;

        User user2 = new User();
        user2.userId = "user2";
        user2.password = "abcd";
        user2.missCnt = 0;

        User user3 = new User();
        user3.userId = "user3";
        user3.password = "abcd";
        user3.missCnt = 0;

        // ユーザーを配列で管理する
        User[] users = { user1, user2, user3 };

        // ログインする
        Scanner sc = new Scanner(System.in);
        String inputUserId;
        String inputUserPassword;
        boolean loginChk = false;

        while( loginChk == false ){

            // ユーザー名とパスワードを入力する
            System.out.print("ユーザー名を入力してください：");
            inputUserId = sc.next();
            System.out.print("パスワードを入力してください：");
            inputUserPassword = sc.next();

            // 配列に登録されているすべてのユーザーのユーザーIDとパスワードをを調べてログインを試行する
            for( User u : users ){

                loginChk = u.login( inputUserId, inputUserPassword );
                
                if( loginChk == true ){
                    break;

                }
            }
        }

        // ログイン後の処理につづく

        sc.close();

    }
}
