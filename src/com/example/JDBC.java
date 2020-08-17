package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo?serverTimezone=GMT%2B8";
        String sql = "select * from user";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","123456");
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                String name = rs.getString("username");
                String pasw = rs.getString("password");
                System.out.println(name + " " + pasw);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                rs.close();
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
