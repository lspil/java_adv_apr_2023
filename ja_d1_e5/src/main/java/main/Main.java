package main;

public class Main {

  public static void main(String[] args) {
    OddNumbersThread t = new OddNumbersThread();
    t.start();

    EvenNumbersRunnable r = new EvenNumbersRunnable();
    new Thread(r).start();

    System.out.println("End");
  }
}
