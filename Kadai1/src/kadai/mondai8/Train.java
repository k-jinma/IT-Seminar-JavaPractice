package kadai.mondai8;

public class Train {
    String name;    // 列車名
    int speed;      // 最高速度
    int free;       // 自由席の数

    public Train(String name, int speed, int free) {
        this.name = name;
        this.speed = speed;
        this.free = free;
    }

    void show(){
        System.out.println("TrainName :" + this.name);
        System.out.println("MaxSpeed  :" + this.speed);
        System.out.println("FreeSeat  :" + this.free);

    }

    
}
