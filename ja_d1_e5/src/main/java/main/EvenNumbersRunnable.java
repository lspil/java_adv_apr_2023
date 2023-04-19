package main;

public class EvenNumbersRunnable implements Runnable {

  @Override
  public void run() {
    try {
      for (int i = 0; i <= 20; i += 2) {
        System.out.println(i);
        Thread.sleep(10);
      }
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}
