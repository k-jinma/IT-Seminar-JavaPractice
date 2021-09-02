package kadai.mondai15;

public class RunEngel {
    public static void main(String[] args) {
        if( args.length == 3 ){
            Engel engel = new Engel(args[2]);
            engel.setFood(Double.parseDouble(args[0]));
            engel.setConsumption(Double.parseDouble(args[1]));
            engel.show();
        }else{
            Engel engel = new Engel();
            engel.explain();
        }
    }
}
