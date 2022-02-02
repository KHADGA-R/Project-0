package BankingApplication.service;

import BankingApplication.daos.EmployeeDao;
import BankingApplication.daos.EmployeeDaoImpl;
import BankingApplication.models.Customer;
import BankingApplication.models.Type;

import java.util.List;

public class EmployeeService {

    private final EmployeeDao employeeDao = new EmployeeDaoImpl();

    public boolean createCustomer(Type type, String first, String last, String phone, String password) {

        Customer c = new Customer(type, first, last, phone, password);

        return employeeDao.createCustomer(c);

    }

    public List<Customer> getAllCustomer() {
        return employeeDao.getAllCustomer();

    }

    public Customer getCustomerById(int id) {
        return employeeDao.getCustomerById(id);
    }

    public boolean createCustomer(Customer c){
    Customer newCustomer = new Customer();
        return employeeDao.createCustomer(c);
    }
}


