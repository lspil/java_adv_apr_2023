package main;

import java.util.List;

public class Exemplu4 {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,4,5,6,7);

    int sum =
      list.stream()
          .map(x -> 2 * x)
          .reduce(0, (x,y) -> x + y);

    System.out.println(sum);

  }
}
