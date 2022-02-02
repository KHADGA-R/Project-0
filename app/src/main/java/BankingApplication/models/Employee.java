package BankingApplication.models;

public class Employee {

    private int eid;
    private String first;
    private String last;
    private String email;


    public Employee(){

    }

    public Employee(int eid, String first, String last, String email){
        this.eid = eid;
        this.first = first;
        this.last = last;
        this.email = email;

    }
    public int getEid(){
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
