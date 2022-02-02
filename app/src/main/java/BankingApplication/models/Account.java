package BankingApplication.models;

public class Account {

    private String accountNo;
    private Type type;
    public float interestRate;
    private double balance;

    public Account(){

    }

    public Account(String accountNo, Type type, float interestRate, double balance){
        this.accountNo = accountNo;
        this.type = type;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    public String getAccountNo(){
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", type=" + type +
                ", interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
}



