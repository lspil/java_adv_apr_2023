package main;

import java.util.List;

public class Exemplu8 {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,2,4,5,6,6,1,7);

    // allMatch(), noneMatch(), anyMatch()

    boolean b =
      list.stream()
          .filter(x -> x % 2 == 0)
          .allMatch(x -> x % 2 == 0);

    System.out.println(b);

  }
}
