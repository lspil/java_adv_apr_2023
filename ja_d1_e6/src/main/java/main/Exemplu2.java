package main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu2 {

  public static void main(String[] args) {
    ExecutorService service = Executors.newCachedThreadPool();

    Future<Integer> f = service.submit(new NumbersSumCallable(3, 5));

    // sa fac altceva intre timp

    try {
      Integer result = f.get();
      System.out.println(result);
    } catch (InterruptedException e) {

    } catch (ExecutionException e) {

    }

    service.shutdown();
  }
}
