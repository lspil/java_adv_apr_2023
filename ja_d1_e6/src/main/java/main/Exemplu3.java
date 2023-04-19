package main;

public class Exemplu3 {

  public static void main(String[] args) {

    int x = 10;

    NumbersSumCallable c = new NumbersSumCallable(1,2);

    NumbersSumCallable c2 = new NumbersSumCallable(2,3) {
      void add () {

      }
    };
  }
}
