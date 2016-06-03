package ru.dvfu.mrcpk.ex15database;

import java.sql.*;

public class sql {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;

        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\test\\car.s3db");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from car");
            int n = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= n; i++) {
                System.out.print(resultSet.getMetaData().getColumnLabel(i) + "\t");
            }
            System.out.println();
            while (resultSet.next()){
                for (int i = 1; i <= n; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
