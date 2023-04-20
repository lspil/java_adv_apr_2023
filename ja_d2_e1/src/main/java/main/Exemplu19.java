package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu19 {

  public static void main(String[] args) {
    List<String> list = List.of("Ana", "are", "mere");

    Map<Integer, List<String>> map =
      list.stream()
          .distinct()
          .collect(Collectors.groupingBy(x -> x.length()));

    System.out.println(map);
  }
}
