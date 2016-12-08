package ru.dvfu.mrcpk.ex15database;

import java.sql.*;

public class sql {
    public static void main(String[] args) {

        //Объявления переменных для создания соединения и получения результатов
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;

        try{
            //Запрос класса по имени
            Class.forName("org.sqlite.JDBC");
            //Установление соединения
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\test\\car.s3db");
            //Создание экземпляра для выполнения запросов
            statement = connection.createStatement();
            //Запрос данных
            resultSet = statement.executeQuery("select * from car");

            //Получение количества полей
            int n = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= n; i++) {
                System.out.print(resultSet.getMetaData().getColumnLabel(i) + "\t");
            }
            System.out.println();

            //Выборки данных полей
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
