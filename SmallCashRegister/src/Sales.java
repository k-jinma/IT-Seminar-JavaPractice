package src;

import java.time.LocalDateTime;
import java.util.Map;

public class Sales {
    int salesNo; // 売上No
    LocalDateTime salesDateTime; // 売上日時
    int empNo; // 従業員No
    Map<Item, Integer> salesDetails; // 売上明細

    public Sales(LocalDateTime salesDateTime, int empNo, Map<Item, Integer> salesDetails) {
        // 売上Noは自動採番
        this.salesNo++;
        this.salesDateTime = salesDateTime;
        this.empNo = empNo;
        this.salesDetails = salesDetails;
    }
s
    public int getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
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
