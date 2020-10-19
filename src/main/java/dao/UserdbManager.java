package dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserdbManager {
    private DataSource dataSource;
    public UserdbManager(DataSource theDataSource) {
        dataSource = theDataSource;
    }

    public boolean login(String email, String password){
        Connection connect = null;
        ResultSet result = null;
        try{
            connect = dataSource.getConnection();
            System.out.println("email : "+ email + " password :"+ password);
            String sql = "select * from user where email = ? AND password = ?";
            PreparedStatement statement = connect.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            result = statement.executeQuery();
            if(result.next()){
                return true;
            } else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

}
