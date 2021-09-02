package kadai.mondai9;

public class Employee {
    int id;         // 社員ID
    String name;    // 社員名
    String dept;    // 所属名
    String tel;     // 内線番号
    
    public Employee(int id, String name, String dept, String tel) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getTel() {
        return tel;
    }

    
}
