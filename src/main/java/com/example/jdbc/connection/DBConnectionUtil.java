package com.example.jdbc.connection;


import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.example.jdbc.connection.ConnectionConst.*;

@Slf4j
public class DBConnectionUtil {
    public static Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); //getConnection() 메소드는 checked 예외를 발생할 수도 있다.
            log.info("get connection = {}, class = {}", connection, connection.getClass());

            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e); //checked 예외(SQLException)를  unchecked 예외(IllegalStateException)로 변환
        }
    }
}
