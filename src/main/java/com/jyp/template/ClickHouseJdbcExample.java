package com.jyp.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClickHouseJdbcExample {

    public static void main(String[] args) {
        try {
            // 加载ClickHouse JDBC驱动
            Class.forName("ru.yandex.clickhouse.ClickHouseDriver");

            // 建立数据库连接
            String url = "jdbc:clickhouse://localhost:8123/default";
            String user = "default";
            String password = "";
            Connection connection = DriverManager.getConnection(url, user, password);

            // 创建Statement对象
            Statement statement = connection.createStatement();

            // 执行SQL查询
            String sql = "SELECT * FROM tb_stat";
            ResultSet resultSet = statement.executeQuery(sql);

            // 处理查询结果
            while (resultSet.next()) {
                System.out.println("Column 1: " + resultSet.getString(1));
                System.out.println("Column 2: " + resultSet.getString(2));
                // 根据你的表结构，继续处理其他列
            }

            // 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
