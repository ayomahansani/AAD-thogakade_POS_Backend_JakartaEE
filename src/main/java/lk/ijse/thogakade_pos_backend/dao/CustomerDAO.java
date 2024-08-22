package lk.ijse.thogakade_pos_backend.dao;

import lk.ijse.thogakade_pos_backend.entity.Customer;

import java.sql.Connection;
import java.sql.SQLException;

public interface CustomerDAO {

    boolean save(Customer customer, Connection connection) throws SQLException;

    boolean update(String customerId, Customer customer, Connection connection) throws SQLException;

    boolean delete(String customerId, Connection connection) throws SQLException;

}
