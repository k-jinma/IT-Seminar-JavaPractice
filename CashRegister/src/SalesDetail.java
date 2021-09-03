import java.time.LocalDateTime;
import java.util.ArrayList;

public class SalesDetail {
    private int saledNo; // 売上No
    private int empNo;  // 従業員No
    private LocalDateTime saledLdt;  // 売上日時
    private ArrayList<Item> saledItems; // 売上商品
    private ArrayList<Integer> saledCnt;    // 売上数量

    public SalesDetail(int saledNo, int empNo, LocalDateTime saledLdt, ArrayList<Item> saledItems,
            ArrayList<Integer> saledCnt) {
        this.saledNo = saledNo;
        this.empNo = empNo;
        this.saledLdt = saledLdt;
        this.saledItems = saledItems;
        this.saledCnt = saledCnt;
    }

    public int getSaledNo() {
        return saledNo;
    }

    public void setSaledNo(int saledNo) {
        this.saledNo = saledNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public LocalDateTime getSaledLdt() {
        return saledLdt;
    }

    public void setSaledLdt(LocalDateTime saledLdt) {
        this.saledLdt = saledLdt;
    }

    public ArrayList<Item> getSaledItems() {
        return saledItems;
    }

    public void setSaledItems(ArrayList<Item> saledItems) {
        this.saledItems = saledItems;
    }

    public ArrayList<Integer> getSaledCnt() {
        return saledCnt;
    }

    public void setSaledCnt(ArrayList<Integer> saledCnt) {
        this.saledCnt = saledCnt;
    }

    
    
}
