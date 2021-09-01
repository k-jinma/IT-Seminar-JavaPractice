package kadai.mondai2;

public class MaxValue {
    public static void main(String[] args) {

        // データがない場合はエラーを表示しプログラムを終了する
        if( args.length == 0 ){
            System.out.println("Please input one number.");
            System.exit(1);
        }
        
        // 最大値を格納するための変数を宣言し、0を代入する
        int maxValue = 0;

        // データの要素分繰り返しを行う
        for( String num : args ){
            // 引数のデータの方が大きい場合は、最大値を格納する変数に格納する
            if( maxValue < Integer.parseInt(num) ){
                maxValue = Integer.parseInt(num);
            }
        }
        System.out.println("最大値は" + maxValue + "です");

    }
}
