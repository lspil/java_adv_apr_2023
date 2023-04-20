package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplu13 {

  public static void main(String[] args) {
    List<String> list = List.of("Ana", "are", "mere");

    Map<String, Integer> map =
      list.stream()
          .distinct()
          .collect(Collectors.toMap(x -> x, x -> x.length()));

    System.out.println(map);
  }
}
