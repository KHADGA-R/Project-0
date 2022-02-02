package BankingApplication.daos;

import BankingApplication.models.Customer;

import java.util.List;

public interface EmployeeDao {

    public boolean createCustomer(Customer c);
    public Customer getCustomerById(int cid);
    public List<Customer> getAllCustomer();
}
