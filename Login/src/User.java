public class User {

    String userId;      // ユーザーID
    String password;    // パスワード
    int missCnt = 3;     // ログイン制限回数

    // ログインする
    boolean login( String inputUserId, String inputPassword ) {

        boolean logined;

        // ユーザー名とパスワードが一致しているか確認する
        if( inputUserId.equals(this.userId) && inputPassword.equals(this.password)){

            System.out.println("ログイン成功");

            // 再ログインのために試行回数を３にリセットする
            this.missCnt = 3;

            logined =  true;
        
        }else{
            // ログインが失敗すれば試行回数を１回減少させる
            this.missCnt--;

            // ログイン試行回数を確認する
            if( getMissCnt() == 0 ){

                System.err.println("ログイン試行回数制限によりシステムを終了します");
                System.exit(-1);

            }
            
            logined = false;  
        
        }

        return logined;

    }

    // ログイン試行回数を取得する
    int getMissCnt() {

        return missCnt;

    }


}
