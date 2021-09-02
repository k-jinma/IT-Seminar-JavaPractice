package kadai.mondai15;

public class Engel {
    double food;    // 食糧費
    double consumption; //消費支出
    String name;    // 氏名

    public Engel(String name) {
        this.name = name;
    }
    
    public Engel() {
    }

    public void setFood(double food) {
        this.food = food;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double calculation(){
        return (this.food / this.consumption ) * 100;
    }

    public void show(){
        System.out.println(this.name + "さんのエンゲル係数は" + calculation() + "%です");
    }

    public void explain(){
        System.out.println("第一引数:食糧費");
        System.out.println("第二引数:消費支出");
        System.out.println("第三引数:氏名");
    }
    
}
