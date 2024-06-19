package thiar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String deleteSQL = "DELETE FROM usuarios WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, 1); // Suponiendo que el ID del usuario que queremos eliminar es 1
            preparedStatement.executeUpdate();
            System.out.println("Datos eliminados exitosamente");

        } catch (SQLException e) {
            System.out.println("Error al eliminar datos");
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
