package kadai.mondai1;

public class Average {
    public static void main(String[] args) {

        // データが３つでなかった場合、エラーメッセージを表示し、プログラムを終了する
        if( args.length != 3 ){
            System.out.println("3つの整数を入力してください");
            System.exit(1);
        }

        // 受け取ったデータをint型に変換し、変数に代入する
        int math = Integer.parseInt(args[0]);
        int japanese = Integer.parseInt(args[1]);
        int english = Integer.parseInt(args[2]);

        // ３つのデータの平均を求めてdouble型の変数に代入する
        double average = (math + japanese + english) / 3;

        // それぞれのデータを標準出力する
        System.out.println("数学・国語・英語の点数を計算します");
        System.out.println("数学の点数\t：" + args[0]);
        System.out.println("国語の点数\t：" + args[1]);
        System.out.println("英語の点数\t：" + args[2]);
        
        System.out.println("3科目の平均点：" + average);

    }
}
