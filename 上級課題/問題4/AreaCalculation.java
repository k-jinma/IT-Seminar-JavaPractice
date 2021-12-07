package toi4;

public class AreaCalculation {

	private double circleArea;	//円の面積
	private double squareArea;	//四角の面積
	private double area;	//円の面積-四角の面積

	public void circleAreaCalculate( String s ) {
		double han = Double.parseDouble(s);
		circleArea = han * han * Math.PI;
	}

	public void squareAreaCalculation( String s1, String s2 ) {
		double tate = Double.parseDouble(s1);
		double yoko = Double.parseDouble(s2);
		squareArea = tate * yoko;
	}

	public void subtractionAreaCalculate() throws AreaTranscendException{
		area = circleArea - squareArea;
		if( area < 0 ) {
			AreaTranscendException ex = new AreaTranscendException();
			throw ex;
		}
	}
	public void disp() {
		System.out.println("円の面積           :" + (int)circleArea);
		System.out.println("四形の面積          :" + (int)squareArea);
		System.out.println("円の面積 - 四角の面積:" + (int)area);
	}

}
