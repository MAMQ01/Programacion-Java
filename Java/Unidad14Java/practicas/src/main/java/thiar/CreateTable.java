package thiar;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String createTableSQL = "CREATE TABLE usuarios ("
                    + "id INT(11) NOT NULL AUTO_INCREMENT, "
                    + "nombre VARCHAR(45) NOT NULL, "
                    + "email VARCHAR(45) NOT NULL, "
                    + "PRIMARY KEY (id))";

            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Tabla creada exitosamente");

        } catch (SQLException e) {
            System.out.println("Error al crear la tabla");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
