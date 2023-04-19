package main;

public class OddNumbersThread extends Thread {

  @Override
  public void run() {
    try {
      for (int i = 1; i <= 20; i += 2) {
        System.out.println(i);
        Thread.sleep(10);
      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }

}
