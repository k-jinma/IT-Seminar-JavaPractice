package kadai.mondai14;

public class CDStockUse {
    public static void main(String[] args) {
        
        if( args.length == 0 ){
            System.err.println("Please input one Keyword.");
            System.exit(1);
        }
        CDStock cdStock = new CDStock();
        System.out.println("検索キーワードは " + args[0] + " です。");
        if( cdStock.searchCD( args[0] ) ){
            cdStock.disp();
        }else{
            System.out.println("該当商品はありません。");
        }

    }
}
