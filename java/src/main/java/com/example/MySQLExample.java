import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLExample {

    // Configurações de conexão com o MySQL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://172.17.0.2:3306/contatos";
    static final String USER = "root";
    static final String PASS = "senha_root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Registrando o driver JDBC
            Class.forName(JDBC_DRIVER);

            // Abrindo uma conexão
            System.out.println("Conectando ao banco de dados...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Executando uma consulta SQL
            System.out.println("Criando declaração...");
            stmt = conn.createStatement();
            String sql = "SELECT PersonID, LastName, FirstName, Address, City FROM Persons";
            ResultSet rs = stmt.executeQuery(sql);

            // Extraindo dados do resultado da consulta
            while (rs.next()) {
                // Recuperando por coluna
                int id = rs.getInt("PersonID");
                String lastName = rs.getString("LastName");
                String firstName = rs.getString("FirstName");
                String address = rs.getString("Address");
                String city = rs.getString("City");

                // Exibindo resultados
                System.out.print("ID: " + id);
                System.out.print(", Last Name: " + lastName);
                System.out.print(", First Name: " + firstName);
                System.out.print(", Address: " + address);
                System.out.println(", City: " + city);
            }

            // Fechando recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechando recursos finalmente
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // Nada a fazer
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Fim da aplicação.");
    }
}
