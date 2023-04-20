package main;

import java.util.List;

public class Exemplu1 {

  public static void main(String[] args) {
    List<Integer> amounts = List.of(10,20,35,44);

//    list.parallelStream()

//    Stream<Integer> stream = list.stream();
//    stream.parallel()

    long statTime = System.currentTimeMillis();
    amounts.parallelStream()
        .map(v -> change(v))
        .forEach(System.out::println);
    long endTime = System.currentTimeMillis();
    System.out.println(endTime - statTime);

    MyInterface i = () -> System.out.println(":)");
  }

  static int change(int amount) {
    // calling an external service.
    try {
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(500);
      return 2 * amount;
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
