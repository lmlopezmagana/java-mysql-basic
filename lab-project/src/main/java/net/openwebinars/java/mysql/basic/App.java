package net.openwebinars.java.mysql.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        String url = """
            jdbc:mysql://localhost/database?allowPublicKeyRetrieval=true&useSSL=false
            """;

        try {
            Connection conn = DriverManager.getConnection(url,"user", "password");
            System.out.println("Conectado a la base de datos");
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("ErrorCode: " + ex.getErrorCode());
        }
    }

}
