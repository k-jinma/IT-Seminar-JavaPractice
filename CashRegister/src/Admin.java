public class Admin extends Employee {
    
    private String password;
    private String[] adminGyomu = {"精算"}; // 業務の種類
    
    public Admin(int empNo, String name, String password) {
        super(empNo, name);
        this.password = password;
    }

    private String[] kanriGyomu = {"精算"};
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getKanriGyomu() {
        return kanriGyomu;
    }

    public void setKanriGyomu(String[] kanriGyomu) {
        this.kanriGyomu = kanriGyomu;
    }

    public String[] getAdminGyomu() {
        return adminGyomu;
    }

    public void setAdminGyomu(String[] adminGyomu) {
        this.adminGyomu = adminGyomu;
    }

    // 精算業務をする
    public void seisan(){
        super.dispGyomu();
        for( int i = 1; i < getAdminGyomu().length; i++ ){
            System.out.println( i + ":" + getAdminGyomu()[i-1] );
        }
    }
    
    // 業務を表示する
    public void dispGyomu(){
        for( int i = 1; i < getAdminGyomu().length; i++ ){
            System.out.println( i + ":" + getAdminGyomu()[i-1] );
        }
    }
}
