package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu17 {

  public static void main(String[] args) {
    List<String> list = List.of("Ana", "are", "mere");

    Map<Boolean, List<String>> map =
      list.stream()
          .distinct()
          .collect(Collectors.partitioningBy(x -> x.length() % 2 == 0,
                      Collectors.filtering(x -> x.contains("e"),
                          Collectors.toList())));

    System.out.println(map);
  }
}
