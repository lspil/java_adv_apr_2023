package main;

public class Exemplu4 {

  public static void main(String[] args) {

    String sql1 = "SELECT * FROM products p" +
        "LEFT JOIN accounts a WHERE p.id = a.id" +
        "...";

    String sql2 = """
        SELECT * FROM products p
        LEFT JOIN accounts a WHERE p.id = a.id
        """;



  }
}
