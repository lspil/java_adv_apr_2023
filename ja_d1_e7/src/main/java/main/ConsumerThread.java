package main;

public class ConsumerThread extends Thread {

  public ConsumerThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      synchronized (Main.list) {
        if (!Main.list.isEmpty()) {
          String uuid = Main.list.get(0);
          Main.list.remove(0);
          System.out.println("Consumer " + getName() + " consumed value " + uuid);
        }
      }
    }
  }
}
