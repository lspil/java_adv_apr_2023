package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu18 {

  public static void main(String[] args) {
    List<String> list = List.of("Ana", "are", "mere");

    Map<Boolean, Map<String, Integer>> map =
      list.stream()
          .distinct()
          .collect(Collectors.partitioningBy(x -> x.length() % 2 == 0,
                      Collectors.filtering(x -> x.contains("e"),
                          Collectors.filtering(x -> x.contains("a"),
                              Collectors.toMap(x -> x, x -> x.length())))));

    System.out.println(map);
  }
}
