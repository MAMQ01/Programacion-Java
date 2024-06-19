package thiar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String updateSQL = "UPDATE usuarios SET nombre = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setString(1, "Juan Manuel Pérez");
            preparedStatement.setInt(2, 1); // Suponiendo que el ID del usuario que queremos actualizar es 1
            preparedStatement.executeUpdate();
            System.out.println("Datos actualizados exitosamente");

        } catch (SQLException e) {
            System.out.println("Error al actualizar datos");
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
