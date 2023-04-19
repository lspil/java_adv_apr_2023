package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exemplu1 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/demo"; // le citim de undeva
    String username = "root";  // intr-un vault
    String password = "";

    try (Connection con = DriverManager.getConnection(url, username ,password)) {
//      Statement
//      PreparedStatement
//      ResultSet

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
