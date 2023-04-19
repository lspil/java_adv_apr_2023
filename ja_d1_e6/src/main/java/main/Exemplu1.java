package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {

  public static void main(String[] args) {
    //Executors.newSingleThreadExecutor()
    //Executors.newCachedThreadPool()
    //Executors.newFixedThreadPool()

    ExecutorService es1 = null;
    try {
      System.out.println(Runtime.getRuntime().availableProcessors());
      es1 = Executors.newCachedThreadPool();

      //Runnable  ->> nu returneaza nimic
      //Callable  ->> returneaza o valoare


      es1.submit(new EvenNumbersRunnable());
    } finally {
      es1.shutdown();
    }

  }
}
