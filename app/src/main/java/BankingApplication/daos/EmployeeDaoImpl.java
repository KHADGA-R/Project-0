package BankingApplication.daos;

import BankingApplication.models.Customer;
import BankingApplication.models.Type;
import BankingApplication.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public boolean createCustomer(Customer c) {
        String sql = "insert into customer (type, first, last, phone, password) values (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);){

            ps.setInt(1, c.getType().ordinal());
            ps.setString(2, c.getFirst());
            ps.setString(3, c.getLast());
            ps.setString(4, c.getPhone());
            ps.setString(5, c.getPassword());

            int rowAffected = ps.executeUpdate();
            if(rowAffected==1){
                return true;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer getCustomerById(int id) {
        String sql = "select * from customer where id = ? ";

        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)){


            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Customer customer = new Customer();
                customer.setCustomer_Id(id);

                int typeOrdinal = rs.getInt("type");
                Type[] types = Type.values(); // ["SAVING", "CHECKING"]
                customer.setType(types[typeOrdinal]);

                customer.setFirst(rs.getString("first"));
                customer.setLast(rs.getString("last"));
                customer.setPhone(rs.getString("phone"));
                customer.setPassword(rs.getString("password"));

                return customer;

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {

        String sql = "select * from customer";
        List<Customer>customer = new ArrayList<>();

        try (Connection conn = ConnectionUtil.getConnection();
             Statement s = conn.createStatement();){

            ResultSet rs = s.executeQuery(sql);


            while(rs.next()) {
                Customer customer1 = new Customer();
                int id = rs.getInt("id");
                customer1.setCustomer_Id(id);


                int typeOrdinal = rs.getInt("type");

                Type[] types = Type.values(); // ["SAVING", "CHECKING"]

                customer1.setType(types[typeOrdinal]);
                customer1.setFirst(rs.getString("first"));
                customer1.setLast(rs.getString("last"));
                customer1.setPhone(rs.getString("phone"));
                customer1.setPassword(rs.getString("password"));

                customer.add(customer1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return customer;
    }
}
