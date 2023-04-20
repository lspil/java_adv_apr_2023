package main;

import java.util.List;

public class Exemplu9 {

  public static void main(String[] args) {

    List<List<Integer>> list =
        List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(6, 7, 8));

    int sum =
    list.stream()
        .flatMap(x -> x.stream())
        .reduce(0, (x,y) -> x + y);

    System.out.println(sum);
  }
}
