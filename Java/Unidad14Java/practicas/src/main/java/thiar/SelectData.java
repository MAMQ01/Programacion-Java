package thiar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectData {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String selectSQL = "SELECT * FROM usuarios";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }

        } catch (SQLException e) {
            System.out.println("Error al seleccionar datos");
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
