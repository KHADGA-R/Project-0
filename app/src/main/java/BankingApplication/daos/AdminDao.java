package BankingApplication.daos;

import BankingApplication.models.Customer;

public interface AdminDao {

    public boolean updateCustomer(Customer c);

    public Customer deleteById(Customer c);
}
