package main;

import java.util.concurrent.Callable;

public class NumbersSumCallable implements Callable<Integer> {

  private int x;
  private int y;

  public NumbersSumCallable(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public Integer call() throws Exception {
    return x + y;
  }
}
