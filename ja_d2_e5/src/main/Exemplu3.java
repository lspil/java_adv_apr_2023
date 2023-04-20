package main;

public class Exemplu3 {

  public static void main(String[] args) {
    int x = 10;

    switch (x) {
      case 1:
      case 2:
      case 3:
        System.out.println(":)");
        break;


    }

    switch (x) {
      case 1, 2, 3:
        System.out.println(":)");
        break;
    }

    // ---------------------------

    int y = switch (x) {
      case 1 -> 10;
      case 2 -> 20;
      default -> throw new RuntimeException();
    };



  }

}
