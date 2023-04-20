package main;

import java.util.List;

public class Exemplu7 {

  public static void main(String[] args) {

    List<Integer> list = List.of(1,2,3,2,4,5,6,6,1,7);

    list.stream()
        .distinct()
        .sorted()
        .forEach(x -> System.out.println(x));
    
  }
}
