package main;

import java.util.List;

public class Exemplu5 {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,4,5,6,7);

    int sum =
        list.stream()
            .filter(x -> x % 2 == 0)
            .reduce(0, (x,y) -> x + y);

    System.out.println(sum);

  }
}
