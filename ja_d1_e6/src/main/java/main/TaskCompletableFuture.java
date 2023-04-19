package main;

import java.util.concurrent.CompletableFuture;

public class TaskCompletableFuture extends CompletableFuture<Integer> {

  private NotifiedObject notifiedObject;

  public TaskCompletableFuture(NotifiedObject notifiedObject) {
    this.notifiedObject = notifiedObject;
  }

  @Override
  public boolean complete(Integer value) {
    // do stuff
    notifiedObject.notifyObject();
    return super.complete(value);
  }
}
