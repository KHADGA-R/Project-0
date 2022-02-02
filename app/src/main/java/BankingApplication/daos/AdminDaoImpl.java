package BankingApplication.daos;

import BankingApplication.models.Customer;
import BankingApplication.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminDaoImpl implements AdminDao {

    @Override
    public Customer deleteById(Customer c) {
        return null;
    }

    @Override
    public boolean updateCustomer(Customer c) {
        String sql = "update customer set type = ?, first = ?, last = ?, phone = ?, password = ? where id = ?";

        try (Connection conn = ConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){


            ps.setInt(1, c.getType().ordinal());
            ps.setString(2, c.getFirst());
            ps.setString(3, c.getLast());
            ps.setString(4, c.getPhone());
            ps.setString(5, c.getPassword());

            int rowsAffected = ps.executeUpdate();

            if(rowsAffected==1){
                return  true;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }
}
