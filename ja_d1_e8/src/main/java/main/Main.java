package main;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,4,5,6,7,8);

    ForkJoinPool forkJoinPool = new ForkJoinPool();
    Integer res = forkJoinPool.invoke(new NumberSumRecursiveTask(list));
    System.out.println(res);
    // RecursiveAction (Runnable), RecursiveTask (Callable)

  }
}
