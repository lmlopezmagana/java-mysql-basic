package net.openwebinars.java.mysql.basic;


import java.sql.*;

public class App {

    public static void main(String[] args) {

        String url = """
            jdbc:mysql://localhost/database?allowPublicKeyRetrieval=true&useSSL=false
            """;

        try {
            Connection conn = DriverManager.getConnection(url,"user", "password");
            System.out.println("Conectado a la base de datos");

            Statement stm = conn.createStatement();

            String sql = """
                    INSERT INTO alumno (nombre, apellidos, edad, email)
                    VALUES ('Sergio', 'Martínez del Campo', 25, 'serginho@gmail.com');
                    """;

            int n = stm.executeUpdate(sql);

            if (n > 0)
                System.out.println("Se ha insertado el registro en la base de datos");


            String sql2 = """
                    SELECT * FROM alumno;
                    """;

            ResultSet rs = stm.executeQuery(sql2);

            while (rs.next()) {
                System.out.println(String.format("%d. %s %s %d %s",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }


            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("ErrorCode: " + ex.getErrorCode());
        }
    }

}
