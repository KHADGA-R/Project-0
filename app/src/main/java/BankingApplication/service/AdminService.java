package BankingApplication.service;

import BankingApplication.daos.AdminDao;
import BankingApplication.daos.AdminDaoImpl;
import BankingApplication.models.Customer;

public class AdminService {

    private final AdminDao adminDao = new AdminDaoImpl();

    public boolean updateCustomer(Customer c) {
        return adminDao.updateCustomer(c);
    }
}


