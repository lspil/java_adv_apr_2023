package main;

import java.util.List;

public class Exemplu6 {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,2,4,5,6,6,1,7);

    int sum =
        list.stream()
            .distinct()
            .filter(x -> x % 2 == 0)
            .filter(x -> x < 5)
            .map(x -> 2 * x)
            .reduce(0, (x,y) -> x + y);

    System.out.println(sum);

  }
}
