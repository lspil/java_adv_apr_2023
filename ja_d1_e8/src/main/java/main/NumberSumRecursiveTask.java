package main;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class NumberSumRecursiveTask extends RecursiveTask<Integer> {

  private final List<Integer> input;

  public NumberSumRecursiveTask(List<Integer> input) {
    this.input = input;
  }

  @Override
  protected Integer compute() {
    if (input.size() <= 2) {
      return input.stream().mapToInt(x -> x).sum(); // suma valorilor din input
    }

    int mid = input.size() / 2;
    List<Integer> part1 = input.subList(0, mid);
    List<Integer> part2 = input.subList(mid, input.size());

    NumberSumRecursiveTask t1 = new NumberSumRecursiveTask(part1);
    NumberSumRecursiveTask t2 = new NumberSumRecursiveTask(part2);

    t1.fork();

    return t2.compute() + t1.join();
  }
}
