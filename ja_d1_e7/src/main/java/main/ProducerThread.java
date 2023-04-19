package main;

import java.util.UUID;

public class ProducerThread extends Thread {

  public ProducerThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      synchronized (Main.list) {
        if (Main.list.size() < 100) {
          String uuid = UUID.randomUUID().toString();
          Main.list.add(uuid);
          System.out.println("Producer " + getName() + " added value " + uuid);
        }
      }
    }
  }
}
