package BankingApplication.models;

import java.util.Date;

public class Customer {

    private int customer_Id;
    private Type type;
    private String first;
    private String last;
    private String phone;
    private String password;



    public Customer(){

    }

    public Customer(int customer_Id, Type type, String first, String last, String phone, String password){
        this.customer_Id = customer_Id;
        this.type = type;
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.password = password;

    }

    public Customer(Type type, String first, String last, String phone, String password) {
        this.type = type;
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.password = password;
    }

    public int getCustomer_Id(){
    return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id=" + customer_Id +
                ", type=" + type +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}




