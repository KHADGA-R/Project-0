package BankingApplication.daos;

public interface AccountDao {

    public void deposit();
    public void withdraw();
    public void transfer();
    public double getBalance();

}
