package BankingApplication.models;

public class Admin {

    private int admin_Id;
    private String email;


    public Admin(){

    }

    public Admin(int admin_Id,  String email) {
        this.admin_Id = admin_Id;
        this.email = email;
    }

    public int getAdmin_Id(){
        return admin_Id;
    }

    public void setAdmin_Id(int admin_Id) {
        this.admin_Id = admin_Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_Id=" + admin_Id +
                ", email='" + email + '\'' +
                '}';
    }
}
