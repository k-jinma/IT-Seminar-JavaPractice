package src;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Sales {
    private static int salesNo = 0; // 売上No
    private LocalDateTime salesDateTime; // 売上日時
    private int empNo; // 従業員No
    private Map<Item, Integer> salesDetails = new HashMap<>(); // 売上明細(商品,売上数)

    public Sales(LocalDateTime salesDateTime, int empNo, Map<Item, Integer> salesDetails) {
        // 売上Noは自動採番
        salesNo++;
        this.salesDateTime = salesDateTime;
        this.empNo = empNo;
        this.salesDetails = salesDetails;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public LocalDateTime getSalesDateTime() {
        return salesDateTime;
    }

    public void setSalesDateTime(LocalDateTime salesDateTime) {
        this.salesDateTime = salesDateTime;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public Map<Item, Integer> getSalesDetails() {
        return salesDetails;
    }

    public void setSalesDetails(Map<Item, Integer> salesDetails) {
        this.salesDetails = salesDetails;
    }


}
