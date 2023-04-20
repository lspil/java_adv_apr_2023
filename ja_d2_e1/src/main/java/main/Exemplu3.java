package main;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Exemplu3 {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,4,5,6,7);

    list.stream()
        .forEach(x -> System.out.println(x));

    Stream.of(1,2,3,4,5,6,7)
        .forEach(x -> System.out.println(x));

    Stream.generate(() -> 1)   // sursa infinita
        .limit(10)
        .forEach(x -> System.out.println(x));

    Stream.generate(() -> new Random().nextInt())
        .limit(10)
        .forEach(x -> System.out.println(x));

    Stream.iterate(1, x -> x + 1)
        .limit(10)
        .forEach(x -> System.out.println(x));

    Stream.iterate(1, x -> x < 10, x -> x + 1)
        .forEach(x -> System.out.println(x));
  }
}
