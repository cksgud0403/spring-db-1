package com.example.jdbc.connection;


public abstract class ConnectionConst { //abstract를 한 이유는 객체 생성을 못하기 위해서 이다.
    public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";
}
