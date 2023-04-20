package main;

public class Exemplu5 {

  public static void main(String[] args) {

    Product p = new Product(1, "Beer", "Holsten");

    int id = p.id();
    String name = p.name();
    String vendor = p.vendor();

  }
}
