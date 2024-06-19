package thiar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String insertSQL = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, "Juan Pérez");
            preparedStatement.setString(2, "juanperez@example.com");
            preparedStatement.executeUpdate();
            System.out.println("Datos insertados exitosamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar datos");
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
