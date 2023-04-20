package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu15 {

  public static void main(String[] args) {
    List<String> list = List.of("Ana", "are", "mere");

    Map<Boolean, Long> map =
      list.stream()
          .distinct()
          .collect(Collectors.partitioningBy(x -> x.length() % 2 == 0,
                      Collectors.counting()));

    System.out.println(map);
  }
}
