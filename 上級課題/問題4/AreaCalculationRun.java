package toi4;

public class AreaCalculationRun {

	public static void main(String[] args) {
		AreaCalculation ac = new AreaCalculation();

		try {
			ac.circleAreaCalculate(args[0]);
			ac.squareAreaCalculation(args[1], args[2]);
			ac.subtractionAreaCalculate();
			ac.disp();

		} catch (AreaTranscendException e) {
			System.out.println("ERROR!! 円の面積より四角形の面積の方が大きいです。");

			//独自のエラーメッセージを定義している場合は以下のように呼び出す
			System.out.println(e.getMessage() );

		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("ERROR!! コマンドライン引数の入力数が不足しています。");

		} catch (NumberFormatException e ) {
			System.out.println("ERROR!! コマンドライン引数に文字データが入力されました。");
		}

	}

}
